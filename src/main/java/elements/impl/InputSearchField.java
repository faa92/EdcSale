package elements.impl;

import elements.IInputSearchField;
import elements.PageBlock;
import org.openqa.selenium.WebElement;

public class InputSearchField extends PageBlock implements IInputSearchField {
    private final WebElement element;

    public InputSearchField(WebElement element) {
        this.element = element;
    }

    @Override
    public void sendText(String text) {
        element.sendKeys(text);

    }

    @Override
    public void submit() {
        element.submit();
    }
}
