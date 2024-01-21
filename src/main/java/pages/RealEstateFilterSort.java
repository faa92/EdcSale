package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RealEstateFilterSort extends BasePage {

    private final By categoryDropDown = By.id("j-f-cat-desktop-link");

    public WebElement getCategoryDropDown() {
        return driver.findElement(categoryDropDown);
    }

    private final By filterByPrice = By.xpath("//div[@class='fl-aside-filter-item-head collapsed']");
    private final By dropMenuPriceFrom = By.xpath("//input[contains(@placeholder,'от')]");
    private final By dropMenuPriceUpTo = By.xpath("//input[contains(@placeholder,'по')]");
    private final By dropMenuCurrencySelection = By.xpath("//div[@class='form-control ml-2 j-curr-select']");
    private final By buttonFilterApply = By.xpath("//button[contains(text(),'Фильтр')]");

    private final By filterWithPhoto = By.xpath("//span[contains(text(),'С фото')]");
    private final By filterWithoutIntermediaries = By.xpath("//span[contains(text(),'Без посредников')]");
    private final By filterBusinessAdsOnly = By.xpath("//span[contains(text(),'Только бизнес объявления')]");


    public WebElement getDropMenuPriceFrom() {
        return driver.findElement(dropMenuPriceFrom);
    }

    public WebElement getDropMenuPriceUpTo() {
        return driver.findElement(dropMenuPriceUpTo);
    }

    public WebElement getDropMenuCurrencySelection() {
        return driver.findElement(dropMenuCurrencySelection);
    }

    public WebElement getButtonFilterApply() {
        return driver.findElement(buttonFilterApply);
    }

    public WebElement getFilterByPrice() {
        return driver.findElement(filterByPrice);
    }

    public WebElement getFilterWithPhoto() {
        return driver.findElement(filterWithPhoto);
    }

    public WebElement getFilterWithoutIntermediaries() {
        return driver.findElement(filterWithoutIntermediaries);
    }

    public WebElement getFilterBusinessAdsOnly() {
        return driver.findElement(filterBusinessAdsOnly);
    }
}
