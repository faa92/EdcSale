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

//    public boolean isLoadedCorrectSearchContainer() {
//        logger.info("is Loaded Correct search container");
//        return realEstateFilterSort.getFilterWithoutIntermediaries().isDisplayedCheckBox()
//                && realEstateFilterSort.getFilterWithPhoto().isDisplayedCheckBox()
//                && realEstateFilterSort.getFilterByPrice().isDisplayedCheckBox()
//                && realEstateFilterSort.getFilterBusinessAdsOnly().isDisplayedCheckBox()
//                && realEstateFilterSort.getButtonDropDownMainCategories().isDisplayedButton()
//                && realEstateFilterSort.getFilterWithoutIntermediaries().isDisplayedCheckBox();
//    }
//
//    public boolean isDisplayedElementsDropDownMenu() {
//        logger.info("Is loaded correct drop down menu main categories");
//        realEstateFilterSort.getButtonDropDownMainCategories().clickButton();
//        return realEstateFilterSort.getBlockMainCategories().isCorrectLoadedElementsDropDownMenu();
//    }
}
