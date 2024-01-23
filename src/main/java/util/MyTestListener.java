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

