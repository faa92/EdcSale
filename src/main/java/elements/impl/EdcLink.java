package elements.impl;

import elements.ILink;
import org.openqa.selenium.WebElement;

public class EdcLink implements ILink {
    WebElement element;

    public EdcLink(WebElement element) {
        this.element = element;
    }

    public boolean isDisplayed() {
        return element.isDisplayed();
    }

    @Override
    public String getText() {
        return element.getText();
    }

    @Override
    public void click() {
        element.click();
    }


}
