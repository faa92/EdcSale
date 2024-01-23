package elements.impl;

import elements.IButton;
import elements.PageBlock;
import org.openqa.selenium.WebElement;

public class ButtonSubmit extends PageBlock implements IButton {
    private final WebElement element;

    public ButtonSubmit(WebElement element) {
        this.element = element;
    }

    @Override
    public String getTitle() {
        return element.getText();
    }

    @Override
    public void clickButton() {
        element.click();
    }
}
