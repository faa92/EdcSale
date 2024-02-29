import org.testng.Assert;
import org.testng.annotations.Test;
import service.BulletinBoardService;
import service.LoginService;

public class LoginTest extends BaseTest {
    LoginService loginService = new LoginService();
    BulletinBoardService boardService = new BulletinBoardService();

    @Test(description = "Проверка отображения всех функций в выподающем меню личного кабинета")
    public void login() {
        boardService.clickLoginButton();
        loginService.loginToTheSite();
        Assert.assertTrue(boardService.isCheckedUserItems());
    }

    @Test(description = "Проверка наличия кнопки Выход")
    public void isThereALogoutButton() {
        String expectedValue = "Выход";
        boardService.clickLoginButton();
        loginService.loginToTheSite();
        Assert.assertTrue(boardService.checkItemsUserDropDownByText(expectedValue));
    }


//    @Test
//    public void register() {
//        bulletinBoard.getLoginButton().clickButton();
//        loginService.clickRegister();
//    }
}
