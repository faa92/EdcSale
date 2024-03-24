import data.Config;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import util.MyDriverManager;
import util.MyPropertyManager;
import util.MyTestListener;

@Listeners(MyTestListener.class)
public abstract class BaseTest {
    protected WebDriver driver = MyDriverManager.getDriver();


    @BeforeMethod
    public void setUp() {
        MyPropertyManager propertyManager = new MyPropertyManager(Config.PATH_CONFIG.toString());
        driver.get(propertyManager.getProperty(Config.HOME_URL.toString()));
//        PageFactory.initElements(driver, BasePage.class);   //todo должно быть тут или в BasePage??
    }

    @AfterTest
    public void closeDriver() {
        driver.quit();
    }
}
