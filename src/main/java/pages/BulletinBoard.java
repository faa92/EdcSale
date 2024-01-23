package pages;

import elements.impl.BlockDropDownMainCategories;
import elements.impl.BlockSearchPanel;
import elements.impl.ButtonDropDownMainCategories;
import elements.impl.EdcLink;
import org.openqa.selenium.By;

import java.util.List;

public class BulletinBoard extends BasePage {

    private final By dropdownButton = By.xpath("//div[@class='fl-search-h-cat-box']");
    private final By searchPanel = By.xpath("//div[@class='wb-f-panel-body']");
    private final By dropDownMenu = By.xpath("//div[@class='fl-search-cats-dropdown j-mobile-filter-first-step']");
    private final By listCategories = By.xpath("//a[@class= 'in-cat-item-title-in']");

    public BlockSearchPanel getSearchPanel() {
        return new BlockSearchPanel(driver.findElement(searchPanel));
    }

    public BlockDropDownMainCategories getDropDownMenu() {
        return new BlockDropDownMainCategories(driver.findElement(dropDownMenu));
    }

    public ButtonDropDownMainCategories getDropdownButton() {
        return new ButtonDropDownMainCategories(driver.findElement(dropdownButton));
    }


    public List<EdcLink> getMainCategories() {
        return driver.findElements(listCategories).stream().map(EdcLink::new).toList();
    }


}
