package service;

import data.Categories;
import elements.impl.EdcLink;
import pages.BelarusAdsPage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class BelarusAdsService extends BaseService {

    private final BelarusAdsPage belarusAdsPage;

    public BelarusAdsService() {
        this.belarusAdsPage = new BelarusAdsPage();
    }

    public boolean isDisplayedHeader() {
        logger.info("is displayed header");
        return belarusAdsPage.getTitle().isDisplayed();
    }

    public boolean isCategoryCorrect(Categories[] expectedValues) {
        logger.info("checking main categories");
        List<String> actualValue = belarusAdsPage.getListMainCategories().stream().map(EdcLink::getText).toList();
        List<String> expected = Arrays.stream(expectedValues).map(Categories::toString).toList();
        return new HashSet<>(actualValue).containsAll(expected) && new HashSet<>(expected).containsAll(actualValue);
    }


    public boolean IsDisplayListCategories() {
        logger.info("is the list of categories displayed");
        return belarusAdsPage.getListMainCategories().stream().allMatch(EdcLink::isDisplayed);
    }
}
