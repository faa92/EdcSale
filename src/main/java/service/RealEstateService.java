package service;

import data.Currency;
import data.FiltersSearchPanel;
import pages.realEstate.RealEstatePage;

public class RealEstateService extends BaseService {
    private final RealEstatePage realEstatePage;

    public RealEstateService() {
        this.realEstatePage = new RealEstatePage();
    }

    public void selectFilter(FiltersSearchPanel filters) {
        logger.info(" select filter search panel");
        switch (filters) {
            case WITH_PHOTO -> realEstatePage.getSearchPanel().getPhotoCheckBox().clickCheckBox();

            case WITHOUT_INTERMEDIARIES ->
                    realEstatePage.getSearchPanel().getWithOutIntermediariesCheckBox().clickCheckBox();

            case BUSINESS_ADS_ONLY -> realEstatePage.getSearchPanel().getBusinessAdsOnlyCheckBox().clickCheckBox();
        }
    }


    public boolean isPhotoChecked() {
        logger.info("filter selection check");
        return realEstatePage.getSearchPanel().getPhotoCheckBox().isSelectedFilter();
    }

    private void clickTheFilterPrice() {
        realEstatePage.getSearchPanel().getBlockPriceFilter().expand();
    }

    private void enterValuesForTheFilter(int priceFrom, int priceTo) {
        realEstatePage.getSearchPanel().getBlockPriceFilter().enterPriceFrom(priceFrom);
        realEstatePage.getSearchPanel().getBlockPriceFilter().enterPriceTo(priceTo);
    }

    private void setCurrency(Currency currency) {
        realEstatePage.getSearchPanel().getBlockPriceFilter().setCurrencySelection(currency);
    }

    private void applyFilter() {
        realEstatePage.getSearchPanel().getBlockPriceFilter().getButtonApply().clickButton();
    }

    public void filterByPrice(int priceFrom, int priceTo, Currency currency) {
        logger.info("Enter value by price filter");
        clickTheFilterPrice();
        enterValuesForTheFilter(priceFrom, priceTo);
        setCurrency(currency);
        applyFilter();
    }


}
