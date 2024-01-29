package pages.realEstate.elements;

import data.Currency;
import elements.IDropDown;
import elements.PageBlock;
import elements.impl.EdcButton;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BlockPriceFilter extends PageBlock implements IDropDown {
    private final By inputsPriceFilter = By.xpath(".//div[@class='fl-dyn-dropdown j-search-items-box']"); //общее меню фильтра
    private final By priceFrom = By.xpath(".//input[@class='form-control j-from']");
    private final By priceTo = By.xpath(".//input[@class='form-control ml-2 j-to']");
    private final By elementsCurrencySelection = By.xpath(".//select[@class='form-control ml-2 j-curr-select']");  //выбор валюты /алерт?
    private final By buttonApply = By.xpath(".//button[@class='btn btn-success j-submit']");
    private final By inputCurrency = By.xpath(".//input[@class='j-curr']");

    public BlockPriceFilter(WebElement element) {
        super(element);
    }

    public void setCurrencySelection(Currency currency) {            //todo // ищет правильно но не отображает в фильтре выбранную валюту
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String newValue = currency.toString();
        js.executeScript("arguments[0].setAttribute('value', arguments[1])", driver.findElement(inputCurrency), newValue);
    }

    public void enterPriceFrom(Integer priceFrom) {
        WebElement webElement = driver.findElement(this.priceFrom);
        webElement.click();
        webElement.sendKeys(priceFrom.toString());
    }

    public void enterPriceTo(Integer priceTo) {
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
