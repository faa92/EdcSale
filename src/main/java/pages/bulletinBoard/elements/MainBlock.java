package pages.bulletinBoard.elements;

import elements.ISearchBlock;
import elements.PageBlock;
import elements.impl.EdcLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainBlock extends PageBlock implements ISearchBlock {
    public MainBlock(WebElement element) {
        super(element);
    }

    private final By listCategories = By.xpath(".//a[@class='in-cat-item-title-in']");

    @Override
    public void clickElement() {
    }

    public List<EdcLink> getListCategoriesMainBlock() {
        return driver.findElements(listCategories).stream().map(EdcLink::new).toList();
    }
}
