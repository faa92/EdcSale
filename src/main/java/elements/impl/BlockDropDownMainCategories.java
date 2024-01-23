package elements.impl;

import elements.IDropDown;
import elements.PageBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BlockDropDownMainCategories extends PageBlock implements IDropDown {

    private final By listCategories = By.xpath(".//ul[@class='fl-search-cats-list-in']");
    private final By headerAllAds = By.xpath(".//div[@class='fl-search-dropdown-title wb-f-panel-title']");
    private final By adCounter = By.xpath(".//span[@class='c-number-spaced mr-1']");
    private final By seeAllAds = By.xpath(".//span[@class='d-none d-md-inline-block']");

    private final WebElement element;

    public BlockDropDownMainCategories(WebElement element) {
        this.element = element;
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


    public boolean isDisplayedMenu() {
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
        driver.findElements(listCategories)
                .stream()
                .filter(element -> element.getText().equals(value))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Not found value: " + value))
                .click();
    }

    @Override
    public boolean isExpanded() {
        return element.getAttribute("style").contains("display: block;");
    } //display: none; если меню свёрнуто
}
