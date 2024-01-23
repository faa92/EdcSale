package elements.impl;

import elements.IButton;
import elements.PageBlock;
import org.openqa.selenium.WebElement;

public class ButtonDropDownMainCategories extends PageBlock implements IButton {
    private final WebElement element;

    public ButtonDropDownMainCategories(WebElement element) {
        this.element = element;
    }

    public boolean isDisplayedButton() {
        return element.isDisplayed();
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
