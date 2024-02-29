package pages;

import elements.impl.EdcButton;
import elements.impl.EdcCheckBox;
import elements.impl.EdcInputSearchField;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private final By inputEmail = By.xpath("//input[@type='email']");
    private final By inputPassword = By.xpath("//input[@type='password']");
    private final By buttonLogin = By.xpath("//button[@type='submit']");
    private final By checkBoxRememberMe = By.xpath("//input[@name='remember']");
    private final By buttonRegister = By.xpath("//div[@class='au-form-under-actions']//a");

    public EdcButton getButtonRegister() {
        return new EdcButton(driver.findElement(buttonRegister));
    }

    public EdcCheckBox getCheckBoxRememberMe() {
        return new EdcCheckBox(driver.findElement(checkBoxRememberMe));
    }

    public EdcInputSearchField getInputEmail() {
        return new EdcInputSearchField(driver.findElement(inputEmail));
    }

    public EdcInputSearchField getInputPassword() {
        return new EdcInputSearchField(driver.findElement(inputPassword));
    }

    public EdcButton getButtonLogin() {
        return new EdcButton(driver.findElement(buttonLogin));
    }
}
