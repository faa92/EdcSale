package pages.realEstate.elements;

import elements.PageBlock;
import elements.impl.EdcButton;
import elements.impl.EdcLabel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BlockSortAds extends PageBlock {
    public BlockSortAds(WebElement element) {
        super(element);
    }

    private final By countAds = By.xpath(".//div[@class='it-sort-item it-sort-item-count text-color j-search-total']");
    private final By sortAdsDropDawn = By.xpath(".//span[@class='d-none d-md-flex align-items-center']/..");
    private final By viewList = By.xpath(".//*[@data-id='list']");
    private final By viewGallery = By.xpath(".//*[@data-id='gallery']");
    private final By viewMap = By.xpath(".//*[@data-id='map']");

    public EdcButton getViewList() {
        return new EdcButton(element.findElement(viewList));
    }

    public EdcButton getViewGallery() {
        return new EdcButton(element.findElement(viewGallery));
    }

    public EdcButton getViewMap() {
        return new EdcButton(element.findElement(viewMap));
    }


    public BlockDropDownSortAds getSortAdsDropDawn() {
        return new BlockDropDownSortAds(element.findElement(sortAdsDropDawn));
    }

    public EdcLabel getCountAds() {
        return new EdcLabel(element.findElement(countAds));
    }


}
