package elements.impl;

import elements.ILabel;
import elements.PageElement;
import org.openqa.selenium.WebElement;

public class EdcLabel extends PageElement implements ILabel {
    public EdcLabel(WebElement element) {
        super(element);
    }


    @Override
    public String getText() {
        return element.getText();
    }
}
