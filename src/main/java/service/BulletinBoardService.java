package service;

import data.Categories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BulletinBoard;

public class BulletinBoardService extends BaseService{
    private final BulletinBoard board;
    public BulletinBoardService() {
        super(BulletinBoardService.class);
        this.board = new BulletinBoard();
    }


    public boolean clickOnEachCategory() {
        try {
            for (Categories category : Categories.values()) {
                WebElement categoryElement = board
                        .getAllCategoriesBoard()
                        .findElement(By.xpath("//a[contains(text(),'" + category + "')]"));
                categoryElement.click();
                logger.info("Category " + category + " click");
                driver.navigate().back();
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
