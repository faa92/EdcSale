package service;

import models.UserModel;
import pages.LoginPage;

import java.util.List;

public class LoginService extends BaseService {
    private final LoginPage loginPage;

    public LoginService() {
        this.loginPage = new LoginPage();
    }

    public void loginToTheSite(List<UserModel> userModel) {
        userDataInput(userModel.stream().findFirst().orElseThrow(null));
        clickRememberMe();
        logger.info("Click button login");
        loginPage.getButtonLogin().clickButton();
    }

    public void userDataInput(UserModel userModel) {
        logger.info("Input user data");
        enterEmail(userModel.getEmail());
        enterPassword(userModel.getPassword());
    }

    private void clickRememberMe() {
        logger.info("Click remember me checkbox");
        loginPage.getCheckBoxRememberMe().clickCheckBox();
    }

    private void enterEmail(String email) {
        loginPage.getInputEmail().sendText(email);
    }

    private void enterPassword(String password) {
        loginPage.getInputPassword().sendText(password);
    }


}
