package pages.bulletinBoard.elements;

import elements.IDropDown;
import elements.impl.AbstractDropDown;
import elements.impl.EdcLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BlockDropDownPersonalArea extends AbstractDropDown implements IDropDown {

    private final By dropDownElements = By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item']");

    public BlockDropDownPersonalArea(WebElement element) {
        super(element);
    }

    public List<EdcLink> getDropDownElements() {
        return driver.findElements(dropDownElements)
                .stream()
                .map(EdcLink::new)
                .toList();
    }

    public boolean isDisplayedAllItems() {
        return element.findElements(dropDownElements)
                .stream()
                .allMatch(link -> isDisplayed());
    }


    @Override
    protected By getDropDownBys() {
        return dropDownElements;
    }
}
