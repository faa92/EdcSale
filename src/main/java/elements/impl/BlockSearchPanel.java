package elements.impl;

import elements.PageBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class BlockSearchPanel extends PageBlock {
    private final WebElement element;

    public BlockSearchPanel(WebElement element) {
        this.element = element;
    }

    private final By listAds = By.xpath("//div[@class='fl-search-h-results']");
    private final By dropdownButton = By.xpath(".//div[@class='fl-search-h-cat-box']");
    private final By searchField = By.xpath(".//input[@class='fl-search-h-input']");
    private final By buttonSubmit = By.xpath(".//div[@class='btn fl-search-btn j-submit']");

    public ButtonDropDownMainCategories getDropdownButton() {
        return new ButtonDropDownMainCategories(driver.findElement(dropdownButton));
    }

    public InputSearchField getSearchField() {
        return new InputSearchField(driver.findElement(searchField));
    }

    public ButtonSubmit getButtonSubmit() {
        return new ButtonSubmit(driver.findElement(buttonSubmit));
    }

    public BlockListAds getBlockListAds() {
        return new BlockListAds(driver.findElement(listAds));
    }
}
