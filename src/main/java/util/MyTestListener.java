package util;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {
    @Override
    @Attachment(value = "screenshot", type = "image/png")
    public void onTestFailure(ITestResult result) {
        WebDriver driver = MyDriverManager.getDriver();
        try {
            Allure.getLifecycle().addAttachment("screenshot", "image/png", ".png"
                    , ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));

        } catch (Exception e) {
            System.out.println("Failed to take screenshot:  !!!" + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}



/*
public class MyTestListener implements TestLifecycleListener, ITestNGListener {

    public MyTestListener() {
    }

    private static String getTestMethodName(TestResult result) {
        return result.getName();
    }

    @Attachment(value = "Page Screenshot", type = "image/png")
    public byte[] saveScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String message) {
        return message;
    }

    @Override
    public void beforeTestStop(TestResult result) {
        if (FAILED == result.getStatus() || BROKEN == result.getStatus()) {
            WebDriver driver = MyDriverManager.getDriver();
            if (driver != null) {
                saveScreenshot(driver);
            }

            saveTextLog(getTestMethodName(result) + " failed");
            Allure.addAttachment("test", "test");
        }
    }
}
*/







