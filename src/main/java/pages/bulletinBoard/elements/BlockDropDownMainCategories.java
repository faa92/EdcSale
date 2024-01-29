package pages.bulletinBoard.elements;

import elements.IDropDown;
import elements.PageBlock;
import elements.impl.EdcLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BlockDropDownMainCategories extends PageBlock implements IDropDown {
    private final By dropDownMenu = By.xpath("//div[@class='fl-search-cats-dropdown j-mobile-filter-first-step']");
    private final By listCategories = By.xpath(".//li[@class='fl-search-cats-item']");
    private final By headerAllAds = By.xpath(".//div[@class='fl-search-dropdown-title wb-f-panel-title']");
    private final By adCounter = By.xpath(".//span[@class='c-number-spaced mr-1']");
    private final By seeAllAds = By.xpath(".//span[@class='d-none d-md-inline-block']");

    public BlockDropDownMainCategories(WebElement element) {
        super(element);
    }

    public EdcLink getSeeAllAds() {
        return new EdcLink(driver.findElement(seeAllAds));
    }


    public WebElement getHeaderAllAds() {
        return driver.findElement(headerAllAds);
    }              //???todo

    public WebElement getAdCounter() {
        return driver.findElement(adCounter);
    }                     //???todo


    public List<EdcLink> getListCategories() {
        return driver.findElements(listCategories).stream().map(EdcLink::new).toList();
    }


    public boolean isDisplayed() {
        return element.isDisplayed();
    }

    @Override
    public String getText() {
        return element.getText();
    }

    @Override
    public void expand() {
        element.click();

    }

    @Override
    public void selectValue(String value) {
        expand();
        driver.findElements(dropDownMenu)
                .stream()
                .filter(element -> element.getText().equals(value))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Not found value: " + value))
                .click();
    }

    @Override
    public boolean isExpanded() {
        return driver.findElement(dropDownMenu).getAttribute("style").contains("display: block;");
    } //display: none; если меню свёрнуто
}
