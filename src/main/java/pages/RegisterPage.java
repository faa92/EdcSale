package pages;


import elements.impl.EdcButton;
import elements.impl.EdcCheckBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage {
    //    private final By inputEmail = By.xpath("//input[@type='email']");  //todo  такие же как в логине, можно ли переиспользовать оттуда?
//    private final By inputPassword = By.xpath("//input[@type='password']");
    private final By iFrame = By.xpath("//div[@class='rc-anchor rc-anchor-normal rc-anchor-light']");

    public WebElement getiFrame() {
        return driver.findElement(iFrame);
    }

    private final By checkBoxIAmNotARobot = By.xpath("//div[@class='rc-anchor-center-item rc-anchor-checkbox-holder']");
    private final By checkboxForAgreeingToTheTermsOfService = By.xpath("//span[@class='ico-check']");
    private final By buttonContinue = By.xpath("//button[@class='btn btn-success j-submit']");

    public EdcCheckBox getCheckBoxIAmNotARobot() {
        return new EdcCheckBox(driver.findElement(checkBoxIAmNotARobot));
    }

    public EdcCheckBox getCheckboxForAgreeingToTheTermsOfService() {
        return new EdcCheckBox(driver.findElement(checkboxForAgreeingToTheTermsOfService));
    }

    public EdcButton getButtonContinue() {
        return new EdcButton(driver.findElement(buttonContinue));
    }
}
