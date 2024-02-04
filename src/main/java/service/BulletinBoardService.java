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
        logger.info("select category");
        logger.info("Category " + category + " click");
        board.getMainBlock()
                .getListCategoriesMainBlock()
                .stream()
                .filter(element -> element.getText().equals(category.toString()))
                .findFirst()
                .orElseThrow()
                .click();
    }

    public boolean isCategoriesCorrect(Categories[] expectedValues) {
        logger.info("checking the main categories in the drop-down menu");
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

    private boolean isPresentMenu() {
        logger.info("Checked dropdown menu");
        if (board.getSearchPanel().getDropDownMenuMainCategories().isExpanded()) {
            return board.getSearchPanel().getDropDownMenuMainCategories().isDisplayed();
        }
        return false;
    }

    private boolean isCorrectLoadedAllElementsMenu() {
        logger.info("Checked all menu items loading correctly");
        return board.getSearchPanel().getDropDownMenuMainCategories().getHeaderAllAds().isDisplayed()
                && board.getSearchPanel().getDropDownMenuMainCategories().getAdCounter().isDisplayed()
                && board.getSearchPanel().getDropDownMenuMainCategories().getSeeAllAds().isDisplayed()
                && board.getSearchPanel().getDropDownMenuMainCategories().getListCategories().stream().allMatch(EdcLink::isDisplayed);
    }

    public boolean isCheckedDropDownMenuAndAllElements() {
        return isPresentMenu() && isCorrectLoadedAllElementsMenu();
    }

    public void enterRequest(String value) {
        logger.info("Enter a query into the search bar");
        board.getSearchPanel().getSearchField().sendText(value);
    }

    public boolean waitDisplayedAdsBlock() {
        logger.info("Waiting for ad dropdown list");
        return wait.until((driver) -> board.getDropDownListAds().isDisplayed());
    }


    public int countAds() {
        logger.info("Getting the ad list size");
        return board.getDropDownListAds().getListAds().size();
    }

    public boolean isMatchesTheRequest(String value) {
        logger.info("Correspondence between the request and the list of advertisements");
        return board.getDropDownListAds()
                .getListAds()
                .stream()
                .allMatch(edcLink -> edcLink.getText().contains(value));
    }

    public void clickTheSearchButton() {
        logger.info("Click the search button");
        board.getSearchPanel().getButtonSubmit().clickButton();
    }


}

