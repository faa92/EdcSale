package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.MyDriverManager;

public abstract class PageBlock {
    protected final WebDriver driver = MyDriverManager.getDriver();
    protected final WebElement element;

    public PageBlock(WebElement element) {
        this.element = element;
    }

    public boolean isDisplayed() {
        return element.isDisplayed();
    }


}
