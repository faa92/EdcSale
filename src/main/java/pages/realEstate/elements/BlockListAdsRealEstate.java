package pages.realEstate.elements;

import elements.PageBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BlockListAdsRealEstate extends PageBlock {
    public BlockListAdsRealEstate(WebElement element) {
        super(element);
    }

    private final By adsList = By.xpath("//div[@class='j-item it-list-item']");

    public List<BlockShortAd> getAds() {
        return driver.findElements(adsList).stream().map(BlockShortAd::new).toList();
    }

}
