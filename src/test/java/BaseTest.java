import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import util.MyDriverManager;
import util.MyTestListener;

@Listeners(MyTestListener.class)
public abstract class BaseTest {
    protected WebDriver driver = MyDriverManager.getDriver();


    @BeforeMethod
    public void setUp() {
        driver.get("https://edc.sale/ru/by/");
    }

//    @AfterTest
//    public void closeDriver() {
//        driver.quit();
//    }
}
