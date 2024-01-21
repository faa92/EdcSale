package pages;

import elements.impl.EdcLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BulletinBoard extends BasePage {

    private final By allCategoriesBoard = By.xpath("//div[@class='in-cat-box in-cat-box-list j-collapse-list-box']");
    private final By listCategories = By.xpath(".//a[@class= 'in-cat-item-title-in']");

    public WebElement getAllCategoriesBoard() {
        return driver.findElement(allCategoriesBoard);
    }

    public List<EdcLink> getMainCategories() {
        return getAllCategoriesBoard().findElements(listCategories).stream().map(EdcLink::new).toList();
    }


}
