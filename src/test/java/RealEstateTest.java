import data.Categories;
import data.Currency;
import data.FiltersSearchPanel;
import models.BlockShortAdModel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import service.BulletinBoardService;
import service.FavoritesAdsService;
import service.RealEstateService;
import util.MyDataProvider;
import util.MyTestListener;

import java.util.List;

@Listeners(MyTestListener.class)
public class RealEstateTest extends BaseTest {
    BulletinBoardService boardService = new BulletinBoardService();
    RealEstateService realEstateService = new RealEstateService();
    FavoritesAdsService favoritesAdsService = new FavoritesAdsService();

    @Test(description = "Проверка чек-бокс фильтров", dataProvider = "filters", dataProviderClass = MyDataProvider.class)
    public void checkingAllCheckbox(FiltersSearchPanel filter) {
        boardService.selectMainCategory(Categories.REAL_ESTATE);
        Assert.assertTrue(realEstateService.filtersSelectionAndTesting(filter));
    }

    @Test(description = "Проверка фильтра по цене в разделе «Недвижимость»", dataProvider = "currencyAndRandomPrice", dataProviderClass = MyDataProvider.class)
    public void checkingTheFilterByPriceInTheRealEstateSection(Currency currency, int from, int to) {
        boardService.selectMainCategory(Categories.REAL_ESTATE);
        realEstateService.filterByPrice(currency, from, to);
        Assert.assertTrue(realEstateService.isCheckedAllParamPriceFilter(from, to));
    }

    @Test(description = "Проверка добавления объявлений в раздел «Избранные»")
    public void checkingFavoritesAds() {
        boardService.selectMainCategory(Categories.REAL_ESTATE);
        List<BlockShortAdModel> listFavorites = realEstateService.addToFavorites(List.of(1, 2, 3));
        Assert.assertTrue(favoritesAdsService.isCheckAds(listFavorites));
    }

}



