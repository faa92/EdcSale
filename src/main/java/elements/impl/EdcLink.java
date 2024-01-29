package elements.impl;

import elements.ILink;
import elements.PageElement;
import org.openqa.selenium.WebElement;

public class EdcLink extends PageElement implements ILink {

    public EdcLink(WebElement element) {
        super(element);
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
