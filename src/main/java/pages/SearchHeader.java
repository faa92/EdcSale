package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchHeader extends BasePage {
    private final By allCategories = By.xpath("//span[@class='fl-search-h-cat-title c-shadow-overflow']");
    private final By searchField = By.id("j-f-query");
    private final By searchButton = By.xpath("//button[@class='btn fl-search-btn j-submit']");
    private final By dropDownMenu = By.xpath("//div[@class='wb-f-panel-body fl-search-cats-list fc-popup-in j-custom-scroll ps']");

    public WebElement getDropDownMenu() {
        return driver.findElement(dropDownMenu);
    }

    public WebElement getAllCategories() {
        return driver.findElement(allCategories);
    }

    public WebElement getSearchField() {
        return driver.findElement(searchField);
    }

    public WebElement getSearchButton() {
        return driver.findElement(searchButton);
    }
}
