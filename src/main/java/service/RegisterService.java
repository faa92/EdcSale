package service;

import org.openqa.selenium.JavascriptExecutor;
import pages.RegisterPage;

public class RegisterService extends BaseService {
    private final RegisterPage registerPage;

    public RegisterService() {
        this.registerPage = new RegisterPage();
    }

    public void clickAllCheckboxesAndContinueButton() {
        clickIAmNotARobot();
        clickAgreeing();
        clickContinue();
    }

    private void clickIAmNotARobot() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.switchTo().frame(registerPage.getiFrame());
        js.executeScript("arguments[0].click();", registerPage.getCheckBoxIAmNotARobot());

//        registerPage.getCheckBoxIAmNotARobot().clickCheckBox();
    }

    private void clickAgreeing() {
        registerPage.getCheckboxForAgreeingToTheTermsOfService().clickCheckBox();
    }

    private void clickContinue() {
        registerPage.getButtonContinue().clickButton();
    }

}
