package elements;

import org.openqa.selenium.WebElement;

public abstract class PageElement {

    protected final WebElement element;

    public PageElement(WebElement element) {
        this.element = element;
    }

    public boolean isDisplayed() {
        return element.isDisplayed();
    }


}