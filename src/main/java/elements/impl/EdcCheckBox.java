package elements.impl;

import elements.ICheckBox;
import elements.PageBlock;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class EdcCheckBox extends PageBlock implements ICheckBox {

    public EdcCheckBox(WebElement element) {
        super(element);
    }


    @Override
    public void clickCheckBox() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);

//        element.click();
    }

    public boolean isSelectedFilter() {
        try {
            String checkedAttribute = element.getAttribute("checked");
            return "true".equals(checkedAttribute);
        } catch (NoSuchElementException e) {
            return false;
        }
    }


}
