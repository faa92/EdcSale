package pages.bulletinBoard.elements;

import elements.PageBlock;
import elements.impl.EdcButton;
import elements.impl.EdcLabel;
import elements.impl.EdcLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BlockTopHeader extends PageBlock {
    public BlockTopHeader(WebElement element) {
        super(element);
    }

    private final By image = By.xpath(".//img[@alt='EDC.SALE']");
    private final By labelEdc = By.xpath(".//div[@class='c-title h-header-logo-title']");
    //    private final By geo = By.xpath(".//div[@class='fl-selected-geo wb-f-item']");  // todo это дропдаун
    private final By favoritesAds = By.xpath(".//span[@class='c-ico-link c-link-fav hidden-link']");
    private final By message = By.xpath(".//a[@class='c-ico-link c-act-with-dot d-none d-md-flex']");
    private final By userDropDownButton = By.xpath(".//a[@class='in-user-open-act d-none d-md-flex']");
    private final By addAdButton = By.xpath(".//a[@class='btn btn-success btn-add-item']");

    public EdcLink getImage() {
        return new EdcLink(element.findElement(image));
    }  // todo image??

    public EdcLabel getLabelEdc() {
        return new EdcLabel(element.findElement(labelEdc));
    }

//    public By getGeo() {   //  todo
//        return geo;
//    }

    public EdcLink getFavoritesAds() {
        return new EdcLink(element.findElement(favoritesAds));
    }

    public EdcLink getMessage() {
        return new EdcLink(element.findElement(message));
    }

    public BlockDropDownPersonalArea getUserDropDown() {
        return new BlockDropDownPersonalArea(element.findElement(userDropDownButton));
    }

    public EdcButton getAddAdButton() {
        return new EdcButton(element.findElement(addAdButton));
    }
}
