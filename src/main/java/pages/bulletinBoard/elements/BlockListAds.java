package pages.bulletinBoard.elements;

import elements.PageBlock;
import elements.impl.EdcLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BlockListAds extends PageBlock {

    private final By listAds = By.xpath(".//a[@class='fl-search-quick-item']");

    public BlockListAds(WebElement element) {
        super(element);
    }

    public List<EdcLink> getListAds() {
        return driver.findElements(listAds).stream().map(EdcLink::new).toList();
    }

    public boolean isDisplayed() {
        return element.isDisplayed();
    }


}
