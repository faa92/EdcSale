import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import util.MyDriverManager;

import java.time.Duration;

public abstract class BaseTest {
    protected WebDriver driver = MyDriverManager.getDriver();
    @BeforeMethod
    public void setUp() {
        driver.get("https://edc.sale/ru/by/");
    }

//    @AfterSuite
//    public  void closeDriver() {
//        driver.quit();
//    }
}
