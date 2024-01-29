package service;

import data.Categories;
import elements.impl.EdcLink;
import pages.bulletinBoard.BulletinBoard;

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
        board.getMainBlock()
                .getListCategoriesMainBlock()
                .stream()
                .filter(element -> element.getText().equals(category.getDisplayName()))
                .findFirst()
                .orElseThrow()
                .click();
    }

    public boolean isCategoriesCorrect(Categories[] expectedValues) {
        List<String> listValues = board.getSearchPanel()
                .getDropDownMenuMainCategories()
                .getListCategories()
                .stream()
                .map(EdcLink::getText)
                .toList();

        List<String> expectedList = Arrays.stream(expectedValues).map(Categories::toString).toList();

        return new HashSet<>(listValues).containsAll(expectedList) && new HashSet<>(expectedList).containsAll(listValues);
    }

    public void extendDropdownMenuAllCategories() {
        logger.info("Extend menu");
        if (board.getSearchPanel().getDropDownMenuMainCategories().isDisplayed()) {
            board.getSearchPanel().getDropDownMenuMainCategories().expand();
        } else throw new RuntimeException("Not extend dropdown menu");
    }

    public boolean isPresentMenu() {
        if (board.getSearchPanel().getDropDownMenuMainCategories().isExpanded()) {
            return board.getSearchPanel().getDropDownMenuMainCategories().isDisplayed();
        }
        return false;
    }

    public boolean isCorrectLoadedAllElementsMenu() {
        return board.getSearchPanel().getDropDownMenuMainCategories().getHeaderAllAds().isDisplayed()
                && board.getSearchPanel().getDropDownMenuMainCategories().getAdCounter().isDisplayed()
                && board.getSearchPanel().getDropDownMenuMainCategories().getSeeAllAds().isDisplayed()
                && board.getSearchPanel().getDropDownMenuMainCategories().getListCategories().stream().allMatch(EdcLink::isDisplayed);
    }

    public void enterRequest(String value) {
        board.getSearchPanel().getSearchField().sendText(value);
    }

    public boolean waitDisplayedAdsBlock() {
        return wait.until((driver) -> board.getDropDownListAds().isDisplayed());
    }


    public int countAds() {
        return board.getDropDownListAds().getListAds().size();
    }

    public boolean isMatchesTheRequest(String value) {
        return board.getDropDownListAds()
                .getListAds()
                .stream()
                .allMatch(edcLink -> edcLink.getText().contains(value));
    }

    public void clickTheSearchButton() {
        board.getSearchPanel().getButtonSubmit().clickButton();
    }


}

