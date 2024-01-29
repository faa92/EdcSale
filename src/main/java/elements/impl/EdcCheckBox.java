package elements.impl;

import elements.ICheckBox;
import elements.PageBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class EdcCheckBox extends PageBlock implements ICheckBox {

    private final By label = By.xpath(".//span");  //todo  impotr to REBSearchPanel????

    private final By check = By.xpath(".//input[@type = 'checkbox']"); //todo

    public EdcCheckBox(WebElement element) {
        super(element);
    }


    @Override
    public void clickCheckBox() {
        element.click();
    }

    public boolean isSelectedFilter() {
        WebElement webElement;
        try {
            webElement = driver.findElement(check);
        } catch (NoSuchElementException elementException) {
            return false;
        }

        String opacityValue = ((JavascriptExecutor) driver).executeScript("return getComputedStyle(arguments[0]).opacity;", webElement).toString();
        return opacityValue.equals("1");
    }

}
