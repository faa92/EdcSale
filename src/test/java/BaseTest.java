import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import util.MyDriverManager;
import util.MyPropertyManager;
import util.MyTestListener;

import static util.MyPropertyManager.PATH_CONFIG;

@Listeners(MyTestListener.class)
public abstract class BaseTest {
    protected WebDriver driver = MyDriverManager.getDriver();


    @BeforeMethod
    public void setUp() {
        MyPropertyManager propertyManager = new MyPropertyManager(PATH_CONFIG);
        driver.get(propertyManager.getProperty("homeUrl"));
    }

//    @AfterTest
//    public void closeDriver() {
//        driver.quit();
//    }
}
