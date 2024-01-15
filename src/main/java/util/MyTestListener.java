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
//
//        @Override
//        public void beforeStepStop(final StepResult result) {
//
//            if(result.getStatus().equals(Status.FAILED) || result.getStatus().equals(Status.BROKEN)) {
//                screenshot();
//                result.setStatus(Status.FAILED);
//            }
//
//        }
//
//        @Attachment(value = "Screenshot", type = "image/png")
//        public byte[] screenshot() {
//            WebDriver driver = MyDriverManager.getDriver();
//            if (driver instanceof TakesScreenshot) {
//                return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            } else {
//                // Обработка случая, если веб-драйвер не поддерживает снятие скриншотов
//                logger.info("Browser is not capable of taking screenshots");
//                return new byte[0]; // Возвращает пустой массив байтов
//            }
//        }
}

