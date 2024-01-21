package service;

import data.Categories;
import elements.impl.EdcLink;
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

}

