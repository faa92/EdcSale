package pages.realEstate.elements;

import elements.PageBlock;
import elements.impl.EdcCheckBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BlockCheckboxFilters extends PageBlock {
    public BlockCheckboxFilters(WebElement element) {
        super(element);
    }

    private final By checkboxPhoto = By.xpath(".//input[@name = 'ph']");
    private final By checkboxWithOutIntermediaries = By.xpath(".//input[@name='ow[0]']");
    private final By checkboxBusinessAdsOnly = By.xpath(".//input[@name='ow[1]']");


    public EdcCheckBox getPhotoCheckBox() {
        return new EdcCheckBox(driver.findElement(checkboxPhoto));
    }

    public EdcCheckBox getWithOutIntermediariesCheckBox() {
        return new EdcCheckBox(driver.findElement(checkboxWithOutIntermediaries));
    }

    public EdcCheckBox getBusinessAdsOnlyCheckBox() {
        return new EdcCheckBox(driver.findElement(checkboxBusinessAdsOnly));
    }


}
