package elements;

import org.openqa.selenium.WebDriver;
import util.MyDriverManager;

public abstract class PageBlock {
    protected final WebDriver driver = MyDriverManager.getDriver();

}
