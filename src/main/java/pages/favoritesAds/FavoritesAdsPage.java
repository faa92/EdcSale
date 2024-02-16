package pages.favoritesAds;

import elements.impl.EdcLabel;
import org.openqa.selenium.By;
import pages.BasePage;
import pages.realEstate.elements.BlockShortAd;

import java.util.List;

public class FavoritesAdsPage extends BasePage {

    private final By header = By.xpath("//div[@class='l-page-head']");
    private final By sumFavoritesAds = By.xpath("//span[@class='grey-text ml-1 j-account-favorites-tab-counter']");
    private final By listFavAds = By.xpath("//div[@class='j-item it-list-item selected']");


    public EdcLabel getHeader() {
        return new EdcLabel(driver.findElement(header));
    }

    public EdcLabel getSumFavoritesAds() {
        return new EdcLabel(driver.findElement(sumFavoritesAds));
    }


    public List<BlockShortAd> getListFavoritesAds() {
        return driver.findElements(listFavAds).stream().map(BlockShortAd::new).toList();
    }
}
