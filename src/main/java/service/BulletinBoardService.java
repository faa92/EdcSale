package service;

import data.Categories;
import elements.impl.EdcLink;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BulletinBoard;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class BulletinBoardService extends BaseService {
    private final BulletinBoard board;

    public BulletinBoardService() {
        this.board = new BulletinBoard();
    }

    public void selectMainCategory(Categories category) {
        logger.info("Category " + category + " click");
        board.getMainCategories().stream().filter(element -> element.getText().equals(category.getDisplayName())).findFirst().orElseThrow().click();
    }

    public boolean isCategoriesCorrect(Categories[] expectedValues) {
        List<String> listValues = board.getMainCategories().stream().map(EdcLink::getText).toList();
        List<String> expectedList = Arrays.stream(expectedValues).map(Categories::toString).toList();

        return new HashSet<>(listValues).containsAll(expectedList) && new HashSet<>(expectedList).containsAll(listValues); //низкая производительность без HS
    }

    public void extendDropdownMenuAllCategories() {
        if (board.getDropdownButton().isDisplayedButton()) {
            board.getDropdownButton().clickButton();
            logger.info("Extend menu");
        } else throw new RuntimeException("Not extend dropdown menu");
    }

    public boolean isPresentMenu() {
        if (board.getDropDownMenu().isExpanded()) {
            return board.getDropDownMenu().isDisplayedMenu();
        }
        return false;
    }

    public boolean isCorrectLoadedAllElementsMenu() {
        return board.getDropDownMenu().getHeaderAllAds().isDisplayed()
                && board.getDropDownMenu().getAdCounter().isDisplayed()
                && board.getDropDownMenu().getSeeAllAds().isDisplayed()
                && board.getDropDownMenu().getListCategories().stream().allMatch(EdcLink::isDisplayed);
    }

    public void enterRequest() {
        board.getSearchPanel().getSearchField().sendText("Автомобиль BMW");
    }

    public boolean waitDisplayedAdsBlock(WebDriverWait wait) {
        return wait.until((driver) -> board.getSearchPanel().getBlockListAds().isDisplayed());
    }


    public int countAds() {
        return board.getSearchPanel().getBlockListAds().getListAds().size();
    }

    public boolean isMatchesTheRequest() {
        return board.getSearchPanel().getBlockListAds().getListAds().stream().allMatch(edcLink -> edcLink.getText().contains("BMW"));
    }

}

