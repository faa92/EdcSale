package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.MyDriverManager;

public abstract class PageBlock implements IPageElement {
    protected final WebDriver driver = MyDriverManager.getDriver();
    protected final WebElement element;

    public PageBlock(WebElement element) {  // todo не все дроп даун
        this.element = element;
    }

    public boolean isDisplayed() {
        return element.isDisplayed();
    }

    @Override
    public WebElement getWrappedElement() {
        return element;
    }
}
