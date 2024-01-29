import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import util.MyDriverManager;

public abstract class BaseTest {
    protected WebDriver driver = MyDriverManager.getDriver();


    @BeforeSuite
    public void setUp() {
        driver.get("https://edc.sale/ru/by/");
    }

//    @AfterSuite
//    public void closeDriver() {
//        driver.quit();
//    }
}
