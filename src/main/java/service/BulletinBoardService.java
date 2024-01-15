package service;

import data.Categories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BulletinBoard;

import java.util.ArrayList;
import java.util.List;

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
                        .findElement(By.xpath("//a[contains(text(),'" + category + "')]"));   //todo
                categoryElement.click();
                logger.info("Category " + category + " click");
                driver.navigate().back();
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public List<String> getActualValues() {
        List<String> actualValues = new ArrayList<>();
        actualValues.add(board.getRealEstateButton().getText());
        actualValues.add(board.getChildsWorldButton().getText());
        actualValues.add(board.getAnimalsButton().getText());
        actualValues.add(board.getPersonalItemsButton().getText());
        actualValues.add(board.getBusinessButton().getText());
        actualValues.add(board.getSportsAndTravelButton().getText());
        actualValues.add(board.getTransportButton().getText());
        actualValues.add(board.getElectronicsButton().getText());
        actualValues.add(board.getHouseAndCottageButton().getText());
        actualValues.add(board.getServicesButton().getText());
        actualValues.add(board.getJobButton().getText());
        actualValues.add(board.getHobbyMusicArtButton().getText());
        return actualValues;
    }

}
