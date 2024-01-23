package pages;

import elements.impl.CheckBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class RealEstateFilterSort extends BasePage {//todo
    private final By buttonCategory = By.xpath("//div[@class='fl-search-h-cat-box']");
    private final By filterByPrice = By.xpath("//div[@class='fl-aside-filter-item-head collapsed']");
    private final By filtersCheckBoxes = By.xpath("//div[@class='fl-search-dynamics-check j-seek']");

    public CheckBox getFilterByPrice() {
        return new CheckBox(driver.findElement(filterByPrice));
    }

    public List<WebElement> getFiltersCheckBoxes() {
        return driver.findElements(filtersCheckBoxes).stream().toList();
    }

}
