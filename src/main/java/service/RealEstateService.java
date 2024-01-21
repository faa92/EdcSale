package service;

import pages.RealEstateFilterSort;
import pages.RealEstatePage;

public class RealEstateService extends BaseService {
    private final RealEstatePage realEstatePage;
    private final RealEstateFilterSort realEstateFilterSort;

    public RealEstateService() {
        this.realEstatePage = new RealEstatePage();
        this.realEstateFilterSort = new RealEstateFilterSort();
    }

    public boolean isLoadedCorrectSearchContainer() {
        logger.info("is Loaded Correct search container");
        return realEstateFilterSort.getFilterWithoutIntermediaries().isDisplayed()
                && realEstateFilterSort.getFilterWithPhoto().isDisplayed()
                && realEstateFilterSort.getFilterByPrice().isDisplayed()
                && realEstateFilterSort.getFilterBusinessAdsOnly().isDisplayed()
                && realEstateFilterSort.getCategoryDropDown().isDisplayed()
                && realEstateFilterSort.getFilterWithoutIntermediaries().isDisplayed();

    }
}
