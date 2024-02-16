package pages.realEstate.elements;

import elements.PageBlock;
import elements.impl.EdcButton;
import elements.impl.EdcLabel;
import elements.impl.EdcPrice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BlockShortAd extends PageBlock {
    public BlockShortAd(WebElement element) {
        super(element);
    }

    private final By titleAds = By.xpath(".//div[@class='it-item-title c-shadow-overflow']"); //todo почему приходят все заголовки а не избранные??
    private final By description = By.xpath(".//div[@class = 'it-list-item-in']//div[@class = 'it-list-item-t']/following-sibling::div");
    private final By price = By.xpath(".//div[@class='it-price-box c-shadow-overflow']");
    private final By city = By.xpath(".//div[@class='it-item-address c-shadow-overflow']");
    private final By subtitle = By.xpath(".//div[@class='it-list-item-cat']");

    public EdcLabel getDescription() {
        return new EdcLabel(element.findElement(description));
    }

    public EdcLabel getCity() {
        return new EdcLabel(element.findElement(city));
    }

    public EdcLabel getSubtitle() {
        return new EdcLabel(element.findElement(subtitle));
    }

    private final By addToFavoritesButton = By.xpath(".//div[@class='c-item-fav j-tooltip j-i-fav ']");  // all in div

    //если добавленно в избранное c-item-fav j-tooltip j-i-fav c-block-loader active

    public EdcLabel getTitleAd() {
        return new EdcLabel(element.findElement(titleAds));
    }

    public EdcButton getAddToFavoritesButton() {
        return new EdcButton(element.findElement(addToFavoritesButton));
    }

    public EdcPrice getEdcPrice() {
        return new EdcPrice(element.findElement(price));
    }

}
