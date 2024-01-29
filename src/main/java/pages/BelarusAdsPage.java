package pages;

import elements.impl.EdcLabel;
import elements.impl.EdcLink;
import org.openqa.selenium.By;

import java.util.List;

public class BelarusAdsPage extends BasePage {

    private final By title = By.xpath("//h1[@class='category-left-search-title']");
    private final By listMainCategories = By.xpath("//ul[@class='it-cats-lvl-2']/li/a");

    public EdcLabel getTitle() {
        return new EdcLabel(driver.findElement(title));
    }

    public List<EdcLink> getListMainCategories() {
        return driver.findElements(listMainCategories).stream().map(EdcLink::new).toList();
    }
}
