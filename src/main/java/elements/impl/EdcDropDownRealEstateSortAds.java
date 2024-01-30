package elements.impl;

import elements.IDropDown;
import elements.PageBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EdcDropDownRealEstateSortAds extends PageBlock implements IDropDown {
    private final By dropDownElements = By.xpath("//a[@class='dropdown-item j-f-sort']");

    public List<EdcButton> getDropDownSortElements() {
        return driver.findElements(dropDownElements).stream().map(EdcButton::new).toList();
    }

    public EdcDropDownRealEstateSortAds(WebElement element) {
        super(element);
    }

    @Override
    public String getText() {
        return element.getText();
    }

    @Override
    public void expand() {
        element.click();
    }

    @Override
    public boolean isExpanded() {
        return element.getAttribute("aria-expanded").equals("true");
    }

    @Override
    public void selectValue(String value) {
        expand();
        driver.findElements(dropDownElements).stream().filter(
                        element -> element
                                .getText().equals(value))
                .findFirst().orElseThrow(() -> new RuntimeException("Not found value: " + value)).click();

    }


}
