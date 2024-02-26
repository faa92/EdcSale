package service;

import data.Currency;
import data.DataRealEstatePage;
import data.FiltersSearchPanel;
import models.BlockShortAdModel;
import pages.realEstate.RealEstatePage;
import pages.realEstate.elements.BlockShortAd;

import java.util.List;
import java.util.stream.Collectors;

public class RealEstateService extends BaseService {
    private final RealEstatePage realEstatePage;

    public RealEstateService() {
        this.realEstatePage = new RealEstatePage();
    }


    public List<BlockShortAdModel> addToFavorites(List<Integer> numbers) {
        return numbers.stream().map(this::addFavorite).collect(Collectors.toList());
    }

    private BlockShortAdModel addFavorite(Integer number) {
        BlockShortAd ad = realEstatePage.getListAds().getAds().get(number);
        ad.getAddToFavoritesButton().clickButton();
        return getBlockShortAdModel(ad);
    }

    private BlockShortAdModel getBlockShortAdModel(BlockShortAd ad) {
        return new BlockShortAdModel(ad.getTitleAd().getText(),
                ad.getDescription().getText(),
                ad.getEdcPrice().getPrice(),
                ad.getCity().getText(),
                ad.getSubtitle().getText());
    }


    public boolean filtersSelectionAndTesting(FiltersSearchPanel filters) {
        switch (filters) {
            case WITH_PHOTO -> {
                realEstatePage.getSearchPanel().getCheckboxFilters().getPhotoCheckBox().clickCheckBox();
                logger.info("Select filter with photo");
                return isPhotoChecked();
            }

            case WITHOUT_INTERMEDIARIES -> {
                realEstatePage.getSearchPanel().getCheckboxFilters().getWithOutIntermediariesCheckBox().clickCheckBox();
                logger.info("Select filter without intermediaries");
                return isWithoutIntermediariesChecked();
            }

            case BUSINESS_ADS_ONLY -> {
                realEstatePage.getSearchPanel().getCheckboxFilters().getBusinessAdsOnlyCheckBox().clickCheckBox();
                logger.info("Select filter business ads only");
                return isBusinessAdsOnlyChecked();
            }
        }
        return false;
    }

    private boolean isBusinessAdsOnlyChecked() {
        logger.info("Filter selection check business ads only");
        return realEstatePage.getSearchPanel().getCheckboxFilters().getBusinessAdsOnlyCheckBox().isSelectedFilter();
    }

    private boolean isWithoutIntermediariesChecked() {
        logger.info("Filter selection check without intermediaries");
        return realEstatePage.getSearchPanel().getCheckboxFilters().getWithOutIntermediariesCheckBox().isSelectedFilter();
    }


    private boolean isPhotoChecked() {
        logger.info("Filter selection check with photo");
        return realEstatePage.getSearchPanel().getCheckboxFilters().getPhotoCheckBox().isSelectedFilter();
    }

    private void clickTheFilterPrice() {
        realEstatePage.getSearchPanel().getBlockPriceFilter().expand();
    }

    private void enterValuesForTheFilter(Integer priceFrom, Integer priceTo) {
        realEstatePage.getSearchPanel().getBlockPriceFilter().enterPriceFrom(priceFrom);
        realEstatePage.getSearchPanel().getBlockPriceFilter().enterPriceTo(priceTo);
    }

    private void setCurrency(Currency currency) {
        realEstatePage.getSearchPanel().getBlockPriceFilter().setCurrencySelection(currency);
    }

    private void applyFilter() {
        realEstatePage.getSearchPanel().getBlockPriceFilter().getButtonApply().clickButton();
    }

    public void filterByPrice(Currency currency, Integer priceFrom, Integer priceTo) {
        logger.info("Enter value by price filter");
        clickTheFilterPrice();
        logger.info("Enter price from: " + priceFrom + " Enter price to: " + priceTo);
        enterValuesForTheFilter(priceFrom, priceTo);
        logger.info("Set currency: " + currency.name());
        setCurrency(currency);
        logger.info("Filter apply");
        applyFilter();
    }

    public boolean isCheckedAllParamPriceFilter(Integer priceFrom, Integer priceTo) {
        logger.info("Checked header");
        logger.info("Checked count ads");
        logger.info("Checked list ads price range");
        return isCheckedHeader() && isCheckedCountAds() && isCheckedFilterPriceListAdsRealEstate(priceFrom, priceTo);
    }

    private boolean isCheckedHeader() {
        if (realEstatePage.getHeader().isDisplayed()) {
            return realEstatePage.getHeader().getText().contains(DataRealEstatePage.HEADER.toString());
        } else return false;
    }

    private boolean isCheckedCountAds() {
        return realEstatePage.getSortAds().getCountAds().isDisplayed();
    }

    private boolean isCheckedFilterPriceListAdsRealEstate(Integer priceFrom, Integer priceTo) {
        return realEstatePage
                .getListAds()
                .getAds()
                .stream()
                .allMatch(ad -> {
                    Integer adPrice = ad.getEdcPrice().getPrice();
                    return adPrice >= priceFrom && adPrice <= priceTo;
                });
    }
}
