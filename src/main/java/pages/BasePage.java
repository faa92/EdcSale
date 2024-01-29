package pages;

import org.openqa.selenium.WebDriver;
import util.MyDriverManager;

public abstract class BasePage {
    protected WebDriver driver = MyDriverManager.getDriver();
}
