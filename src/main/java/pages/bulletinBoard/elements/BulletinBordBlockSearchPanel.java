package pages.bulletinBoard.elements;

import elements.PageBlock;
import elements.impl.EdcButton;
import elements.impl.EdcInputSearchField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BulletinBordBlockSearchPanel extends PageBlock {
    public BulletinBordBlockSearchPanel(WebElement element) {
        super(element);
    }

    private final By dropDownMenuMainCategories = By.xpath(".//div[@class='fl-search-h-cat-box']");
    private final By searchField = By.xpath(".//input[@class='fl-search-h-input']");
    private final By buttonSubmit = By.xpath(".//button[@class='btn fl-search-btn j-submit']");

    public BlockDropDownMainCategories getDropDownMenuMainCategories() {
        return new BlockDropDownMainCategories(driver.findElement(dropDownMenuMainCategories));
    }

    public EdcInputSearchField getSearchField() {
        return new EdcInputSearchField(driver.findElement(searchField));
    }

    public EdcButton getButtonSubmit() {
        return new EdcButton(driver.findElement(buttonSubmit));
    }

}
