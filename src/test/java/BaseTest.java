import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import util.MyDriverManager;

import java.time.Duration;

public abstract class BaseTest {
    protected WebDriver driver = MyDriverManager.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


    @BeforeSuite
    public void setUp() {
        driver.get("https://edc.sale/ru/by/");
    }

//    @AfterSuite
//    public void closeDriver() {
//        driver.quit();
//    }
}
