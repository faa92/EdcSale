package elements.impl;

import elements.PageElement;
import org.openqa.selenium.WebElement;

public class EdcPrice extends PageElement {
    public EdcPrice(WebElement element) {
        super(element);
    }

    public Integer getPrice() {
        String priceString = element.getText().replaceAll("[^0-9.]", "");
        priceString = priceString.replaceAll("\\..*", ""); // Удаление всех символов после точки
        return Integer.parseInt(priceString);
    }

}
