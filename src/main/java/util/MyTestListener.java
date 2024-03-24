package util;

import io.qameta.allure.testng.AllureTestNg;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.internal.TestNGMethod;


public class MyTestListener extends AllureTestNg {   //todo
//    @Override
//    @Attachment(value = "screenshot", type = "image/png")
//    public void onTestFailure(ITestResult result) {
//        WebDriver driver = MyDriverManager.getDriver();
//        try {
//            Allure.getLifecycle().addAttachment("screenshot", "image/png", ".png"
//                    , ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
//
//        } catch (Exception e) {
//            System.out.println("Failed to take screenshot:  !!!" + e.getMessage());
//        }
//    }

    @Override
    public void onTestStart(ITestResult testResult) {
        setMethodNameFromTest(testResult);
        super.onTestStart(testResult);
    }

    private void setMethodNameFromTest(ITestResult testResult) {
        try {
            TestNGMethod method = (TestNGMethod) FieldUtils.readField(testResult, "m_method", true);
            FieldUtils.writeField(method, "m_methodName", getTestName(testResult), true);

        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private String getTestName(ITestResult testResult) {
        Test annotation = testResult.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
        if (annotation != null) {
            return annotation.description();
        }
        return testResult.getMethod().getMethodName();
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







