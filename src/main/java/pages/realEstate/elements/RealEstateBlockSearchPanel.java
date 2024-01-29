package pages.realEstate.elements;

import elements.PageBlock;
import elements.impl.EdcButton;
import elements.impl.EdcCheckBox;
import elements.impl.EdcInputSearchField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class RealEstateBlockSearchPanel extends PageBlock {
    public RealEstateBlockSearchPanel(WebElement element) {
        super(element);
    }

    //    private final By dropdownButton = By.xpath(".//div[@class='fl-search-h-cat-box']");    пока не трогаем!
    private final By searchField = By.xpath(".//input[@class='fl-search-h-input']");
    private final By buttonSubmit = By.xpath(".//button[@class='btn fl-search-btn j-submit']");
    private final By priceFilter = By.xpath(".//div[@class='fl-aside-filter-item-head collapsed']");
    private final By checkboxPhoto = By.xpath(".//input[@name = 'ph']/..");
    private final By checkboxWithOutIntermediaries = By.xpath(".//input[@name='ow[0]']/..");
    private final By checkboxBusinessAdsOnly = By.xpath(".//input[@name='ow[1]']/..");


    public EdcCheckBox getPhotoCheckBox() {
        return new EdcCheckBox(driver.findElement(checkboxPhoto));
    }

    public EdcCheckBox getWithOutIntermediariesCheckBox() {
        return new EdcCheckBox(driver.findElement(checkboxWithOutIntermediaries));
    }

    public EdcCheckBox getBusinessAdsOnlyCheckBox() {
        return new EdcCheckBox(driver.findElement(checkboxBusinessAdsOnly));
    }

    public EdcInputSearchField getSearchField() {
        return new EdcInputSearchField(driver.findElement(searchField));
    }

    public EdcButton getButtonSubmit() {
        return new EdcButton(driver.findElement(buttonSubmit));
    }

    public BlockPriceFilter getBlockPriceFilter() {
        return new BlockPriceFilter(driver.findElement(priceFilter));
    }
}
