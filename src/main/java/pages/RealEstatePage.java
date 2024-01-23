package pages;

import elements.impl.EdcDropDown;
import elements.impl.EdcLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RealEstatePage extends BasePage {

    private final By allTypesOfRealEstate = By.xpath("//div[@id='j-f-categories-block-1']"); //todo
    private final By listTypes = By.xpath("//ul[@class='it-cats-lvl-2']");
    private final By sortAds = By.xpath("//div[@class='it-sort-item' and not(@id)]/div[@class='dropdown-toggle it-sort-item-selected']");

    public WebElement getAllTypesOfRealEstate() {
        return driver.findElement(allTypesOfRealEstate);
    }

    public List<EdcLink> getTypesRealEstate() {
        return getAllTypesOfRealEstate().findElements(listTypes)
                .stream()
                .map(EdcLink::new)
                .toList();
    }

    public EdcDropDown getSortAds() {
        return new EdcDropDown(driver.findElement(sortAds));
    }


}
