package elements.impl;

import elements.PageBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BlockListAds extends PageBlock {
    private final WebElement element;

    public BlockListAds(WebElement element) {
        this.element = element;
    }

    private final By listAds = By.xpath("//a[@class='fl-search-quick-item']");
//    private final By listTitles = By.xpath("//span[@class='fl-search-quick-title']");

    public List<EdcLink> getListAds() {
        return driver.findElements(listAds).stream().map(EdcLink::new).toList();
    }

//    public List<String> getTitle() {
//        return driver.findElements(listTitles);
//    }

    public boolean isDisplayed() {
        return element.isDisplayed();
    }


}
