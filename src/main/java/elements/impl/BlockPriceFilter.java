package elements.impl;

import elements.IDropDown;
import elements.PageBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BlockPriceFilter extends PageBlock implements IDropDown {
    private final WebElement element;
    private final By inputsPriceFilter = By.xpath("//div[@class='fl-dyn-dropdown j-search-items-box']"); //общее меню фильтра
    //<div class="fl-dyn-dropdown j-search-items-box open" style="left: -5px; top: 51px; right: auto;">  display: none


    private final By priceFrom = By.xpath(".//input[@class='form-control j-from']");
    private final By priceTo = By.xpath(".//input[@class='form-control ml-2 j-to']");
    private final By elementsCurrencySelection = By.xpath(".//select[@class='form-control ml-2 j-curr-select']");  //выбор валюты
    private final By buttonApply = By.xpath(".//button[@class='btn btn-success j-submit']");

    public BlockPriceFilter(WebElement element) {
        this.element = element;
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
