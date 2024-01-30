package pages.realEstate.elements;

import elements.PageBlock;
import elements.impl.EdcPrice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BlockShortAd extends PageBlock {
    public BlockShortAd(WebElement element) {
        super(element);
    }

    private final By img = By.xpath(".//a[@class='it-img-box j-hover-slider j-mobile-double-tap hvr-slider']"); // all img in div
    private final By titleAd = By.xpath(".//div[@class='it-item-title c-shadow-overflow']");
    private final By addToFavoritesButton = By.xpath(".//div[@class='it-list-item-r']");
    private final By price = By.xpath(".//div[@class='it-price-box c-shadow-overflow']");

    public EdcPrice getEdcPrice() {
        return new EdcPrice(driver.findElement(price));
    }
}
