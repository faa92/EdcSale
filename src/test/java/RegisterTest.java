import org.testng.annotations.Test;
import pages.bulletinBoard.BulletinBoard;
import service.LoginService;
import service.RegisterService;

public class RegisterTest extends BaseTest {
    RegisterService registerService = new RegisterService();
    LoginService loginService = new LoginService();
    BulletinBoard bulletinBoard = new BulletinBoard();

    @Test
    public void registerUser() {
        bulletinBoard.getLoginButton().clickButton();
        loginService.clickRegister();
        loginService.userDataInput();
        registerService.clickAllCheckboxesAndContinueButton();
    }
}
