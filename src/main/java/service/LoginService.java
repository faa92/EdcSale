package service;

import models.UserModel;
import pages.LoginPage;
import util.MyPropertyManager;

import static util.MyPropertyManager.PATH_USER_DATA;

public class LoginService extends BaseService {
    private final LoginPage loginPage;
    MyPropertyManager propertyManager = new MyPropertyManager(PATH_USER_DATA);
    UserModel userModel = new UserModel(propertyManager.getProperty("email"), propertyManager.getProperty("password"));


    public LoginService() {
        this.loginPage = new LoginPage();
    }

    public void clickRegister() {
        logger.info("Click button register");
        loginPage.getButtonRegister().clickButton();
    }

    public void loginToTheSite() {
        userDataInput();
        clickRememberMe();
        logger.info("Click button login");
        loginPage.getButtonLogin().clickButton();
    }

    public void userDataInput() {      //todo испоользовать в разных сервисах?
        logger.info("Input user data");
        enterEmail();
        enterPassword();
    }

    private void enterEmail() {
        loginPage.getInputEmail().sendText(userModel.getEmail());
    }

    private void enterPassword() {
        loginPage.getInputPassword().sendText(userModel.getPassword());
    }

    private void clickRememberMe() {
        logger.info("Click remember me checkbox");
        loginPage.getCheckBoxRememberMe().clickCheckBox();
    }

}
