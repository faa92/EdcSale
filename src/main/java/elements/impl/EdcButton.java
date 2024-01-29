package elements.impl;

import elements.IButton;
import elements.PageBlock;
import org.openqa.selenium.WebElement;

public class EdcButton extends PageBlock implements IButton {
    public EdcButton(WebElement element) {
        super(element);
    }

    @Override
    public String getText() {
        return element.getText();
    }

    @Override
    public void clickButton() {
        element.click();
    }
}
