package service;

import data.Categories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BulletinBoard;

import java.util.HashMap;
import java.util.Map;

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


    public Map<String, String> actualResult() {
        return new HashMap<>() {{
            put(board.getRealEstateButton().getText(), "Недвижимость");
            put(board.getСhildsWorldButton().getText(), "Детский мир");
            put(board.getAnimalsButton().getText(), "Животные");
            put(board.getPersonalItemsButton().getText(), "Личные вещи");
            put(board.getBusinessButton().getText(), "Бизнес");
            put(board.getSportsAndTravelButton().getText(), "Спорт и путешествия");
            put(board.getTransportButton().getText(), "Транспорт");
            put(board.getElectronicsButton().getText(), "Электроника");
            put(board.getHouseAndCottageButton().getText(), "Дом и дача");
            put(board.getServicesButton().getText(), "Услуги");
            put(board.getJobButton().getText(), "Работа");
            put(board.getHobbyMusicArtButton().getText(), "Хобби, музыка, искусство");
        }};
    }

}
