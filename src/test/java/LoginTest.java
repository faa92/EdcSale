import data.Config;
import data.ExpectedValues;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.BulletinBoardService;
import service.LoginService;
import util.UserManager;

public class LoginTest extends BaseTest {
    LoginService loginService = new LoginService();
    BulletinBoardService boardService = new BulletinBoardService();
    UserManager userManager = new UserManager();

    @Test(description = "Проверка отображения всех функций в выподающем меню личного кабинета")
    public void login() {
        boardService.clickLoginButton();
        userManager.getUserListFromCsv(Config.PATH_USER_DATA);
        loginService.loginToTheSite(userManager.getUserListFromCsv(Config.PATH_USER_DATA));
        Assert.assertTrue(boardService.isCheckedUserItems());
    }

    @Test(description = "Проверка наличия кнопки Выход")
    public void isThereALogoutButton() {
        boardService.clickLoginButton();
        loginService.loginToTheSite(userManager.getUserListFromCsv(Config.PATH_USER_DATA));
        Assert.assertTrue(boardService.checkItemsUserDropDownByText(ExpectedValues.LOGOUT_BUTTON.toString()));
    }

}
