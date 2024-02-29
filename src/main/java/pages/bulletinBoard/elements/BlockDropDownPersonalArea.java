package pages.bulletinBoard.elements;

import elements.IDropDown;
import elements.PageBlock;
import elements.impl.EdcLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BlockDropDownPersonalArea extends PageBlock implements IDropDown {

    private final By dropDownElements = By.xpath(".//div[@class='dropdown-menu show']//a[@class='dropdown-item']");// todo как правильно реализовать дропдаун? конструктор?

    public BlockDropDownPersonalArea(WebElement element) {
        super(element);
    }

    public List<EdcLink> getDropDownElements() {
        return driver.findElements(dropDownElements) //todo ищет через драйвер потому что не в элементе, как правильно реализовать дропдаун?
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
    public void expand() {
        element.click();
    }

    @Override
    public void selectValue(String value) {
        expand();
        element.findElements(dropDownElements)
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
