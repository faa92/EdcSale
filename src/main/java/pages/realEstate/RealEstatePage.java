package pages.realEstate;


import org.openqa.selenium.By;
import pages.BasePage;
import pages.realEstate.elements.RealEstateBlockSearchPanel;

public class RealEstatePage extends BasePage {

    private final By searchPanel = By.xpath("//div[@class = 'fl-search-h fl-search-panel  fl-search-h-list fl-search-panel-bg-color']");

    public RealEstateBlockSearchPanel getSearchPanel() {
        return new RealEstateBlockSearchPanel(driver.findElement(searchPanel));
    }

}
