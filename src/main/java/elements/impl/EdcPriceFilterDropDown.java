package elements.impl;

import elements.IDropDown;
import elements.PageBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EdcPriceFilterDropDown extends PageBlock implements IDropDown {
    private final WebElement element;
    private final By dropDownPrice = By.xpath("//div[@class='fl-aside-filter-item-head collapsed']");


    public EdcPriceFilterDropDown(WebElement element) {
        this.element = element;
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public void expand() {

    }

    @Override
    public void selectValue(String value) {

    }

    @Override
    public boolean isExpanded() {
        return false;
    }
}
