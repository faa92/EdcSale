package pages.realEstate.elements;

import data.Currency;
import data.Price;
import elements.IDropDown;
import elements.PageBlock;
import elements.impl.EdcButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BlockPriceFilter extends PageBlock implements IDropDown {
    private final By inputsPriceFilter = By.xpath(".//div[@class='fl-dyn-dropdown j-search-items-box']"); //общее меню фильтра
    private final By priceFrom = By.xpath(".//input[@class='form-control j-from']");
    private final By priceTo = By.xpath(".//input[@class='form-control ml-2 j-to']");
    private final By elementsCurrencySelection = By.xpath(".//select[@class='form-control ml-2 j-curr-select']");  //выбор валюты /алерт?
    private final By buttonApply = By.xpath(".//button[@class='btn btn-success j-submit']");

    public BlockPriceFilter(WebElement element) {
        super(element);
    }

    public void setCurrencySelection(Currency currency) {
        WebElement selectCurrency = driver.findElement(elementsCurrencySelection);
        Select select = new Select(selectCurrency);
        select.selectByValue(currency.toString());

    }

    public void enterPriceFrom(Price priceFrom) {
        WebElement webElement = driver.findElement(this.priceFrom);
        webElement.click();
        webElement.sendKeys(priceFrom.toString());
    }

    public void enterPriceTo(Price priceTo) {
        WebElement webElement = driver.findElement(this.priceTo);
        webElement.click();
        webElement.sendKeys(priceTo.toString());
    }

    public EdcButton getButtonApply() {
        return new EdcButton(driver.findElement(buttonApply));
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
        driver.findElements(inputsPriceFilter).stream().filter(
                        element -> element
                                .getText()
                                .equals(value))
                .findFirst().orElseThrow(() -> new RuntimeException("Not found value: " + value)).click();

    }

    @Override
    public boolean isExpanded() {
        return element.getAttribute("class").contains("open");
    }
}
