package service;

import data.Currency;
import data.DataRealEstatePage;
import data.FiltersSearchPanel;
import pages.realEstate.RealEstatePage;

import java.math.BigDecimal;

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
        logger.info("Enter price from: " + priceFrom + " Enter price to: " + priceTo);
        enterValuesForTheFilter(priceFrom, priceTo);
        logger.info("Set currency: " + currency);
        setCurrency(currency);
        logger.info("Filter apply");
        applyFilter();
    }

    private boolean isCheckedHeader() {
        if (realEstatePage.getHeader().isDisplayed()) {
            return realEstatePage.getHeader().getText().contains(DataRealEstatePage.HEADER.getValue());
        } else return false;
    }

    private boolean isCheckedCountAds() {
        return realEstatePage.getSortAds().getCountAds().isDisplayed();
    }

    private boolean isCheckedFilterPriceListAdsRealEstate(BigDecimal priceFrom, BigDecimal priceTo) {
        return realEstatePage
                .getListAds()
                .getAds()
                .stream()
                .allMatch(ad -> ad.getEdcPrice().getPrice().compareTo(priceFrom) >= 0 && ad.getEdcPrice().getPrice().compareTo(priceTo) <= 0);
    }

    public boolean isCheckedAllParamPriceFilter(DataRealEstatePage priceFrom, DataRealEstatePage priceTo) {
        BigDecimal pf = new BigDecimal(priceFrom.getValue());
        BigDecimal pt = new BigDecimal(priceTo.getValue());
        logger.info("Checked header");
        logger.info("Checked count ads");
        logger.info("Checked list ads price range");
        return isCheckedHeader() && isCheckedCountAds() && isCheckedFilterPriceListAdsRealEstate(pf, pt);
    }


}
