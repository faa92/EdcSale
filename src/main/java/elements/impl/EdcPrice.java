package elements.impl;

import elements.PageElement;
import org.openqa.selenium.WebElement;

import java.math.BigDecimal;

public class EdcPrice extends PageElement {
    public EdcPrice(WebElement element) {
        super(element);
    }

    public BigDecimal getPrice() {
        return new BigDecimal(element.getText().replaceAll("[^0-9.]", ""));
    }
}
