package pages;

import elements.impl.EdcLabel;
import org.openqa.selenium.By;

public class FavoritesAdsPage extends BasePage {

    private final By header = By.xpath("//div[@class='l-page-head']");
    private final By sumFavoritesAds = By.xpath("//span[@class='grey-text ml-1 j-account-favorites-tab-counter']");

    public EdcLabel getHeader() {
        return new EdcLabel(driver.findElement(header));
    }

    public EdcLabel getSumFavoritesAds() {
        return new EdcLabel(driver.findElement(sumFavoritesAds));
    }
}
