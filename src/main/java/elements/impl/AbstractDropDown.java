package elements.impl;

import elements.IDropDown;
import elements.PageBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class AbstractDropDown extends PageBlock implements IDropDown {
    public AbstractDropDown(WebElement element) {
        super(element);
    }

    protected abstract By getDropDownBys();


    @Override
    public void expand() {
        element.click();
    }

    @Override
    public void selectValue(String value) {
        expand();
        element.findElements(getDropDownBys())
                .stream()
                .filter(element -> element.getText().equals(value))
                .findFirst().orElseThrow(() -> new RuntimeException("Not found value: " + value)).click();

    }

    @Override
    public boolean isExpanded() {
        return element.getAttribute("aria-expanded").equals("true");
    }

    @Override
    public String getText() {
        return element.getText();
    }


}
