package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyDriverManager {
    private static WebDriver driver;
    private MyDriverManager() {
    }
    public static synchronized WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }

}
