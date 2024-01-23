package elements.impl;

import elements.ICheckBox;
import elements.PageBlock;
import org.openqa.selenium.WebElement;

public class CheckBox extends PageBlock implements ICheckBox {
    private final WebElement element;

    public CheckBox(WebElement element) {
        this.element = element;
    }

    public boolean isDisplayedCheckBox() {
        return element.isDisplayed();
    }

    @Override
    public void clickCheckBox() {
        element.click();
    }

}
