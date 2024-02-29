package pages.realEstate.elements;

import elements.IDropDown;
import elements.PageBlock;
import elements.impl.EdcButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BlockDropDownSortAds extends PageBlock implements IDropDown {
    private final By dropDownElements = By.xpath("//a[@class='dropdown-item j-f-sort']");  //todo как реализовать перечень выпадающего меню?

    public List<EdcButton> getDropDownSortElements() {
        return driver.findElements(dropDownElements).stream().map(EdcButton::new).toList();
    }

    public BlockDropDownSortAds(WebElement element) {
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
        element.findElements(dropDownElements).stream().filter( //todo
                        element -> element
                                .getText().equals(value))
                .findFirst().orElseThrow(() -> new RuntimeException("Not found value: " + value)).click();

    }


}
