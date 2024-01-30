package pages.realEstate;


import elements.impl.EdcLabel;
import org.openqa.selenium.By;
import pages.BasePage;
import pages.realEstate.elements.BlockListAdsRealEstate;
import pages.realEstate.elements.BlockSortAds;
import pages.realEstate.elements.RealEstateBlockSearchPanel;

public class RealEstatePage extends BasePage {

    private final By searchPanel = By.xpath("//div[@class = 'fl-search-h fl-search-panel  fl-search-h-list fl-search-panel-bg-color']");
    private final By header = By.xpath(".//h1[@class='category-left-search-title']");
    private final By sortAds = By.xpath("//div[@class='it-list-sort-in']");
    private final By listAds = By.xpath("//div[@class='it-view-list']");

    public BlockListAdsRealEstate getListAds() {
        return new BlockListAdsRealEstate(driver.findElement(listAds));
    }

    public EdcLabel getHeader() {
        return new EdcLabel(driver.findElement(header));
    }

    public BlockSortAds getSortAds() {
        return new BlockSortAds(driver.findElement(sortAds));
    }

    public RealEstateBlockSearchPanel getSearchPanel() {
        return new RealEstateBlockSearchPanel(driver.findElement(searchPanel));
    }

}
