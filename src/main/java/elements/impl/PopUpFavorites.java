package elements.impl;

import elements.ILink;
import elements.PageBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PopUpFavorites extends PageBlock implements ILink {
    public PopUpFavorites(WebElement element) {
        super(element);
    }

    private final By link = By.xpath(".//a[@class='green-link']");


    @Override
    public String getText() {
        return element.getText();
    }

    @Override
    public void click() {
        element.findElement(link).click();
    }
}
