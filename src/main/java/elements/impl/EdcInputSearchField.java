package elements.impl;

import elements.IInputSearchField;
import elements.PageElement;
import org.openqa.selenium.WebElement;

public class EdcInputSearchField extends PageElement implements IInputSearchField {

    public EdcInputSearchField(WebElement element) {
        super(element);
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
