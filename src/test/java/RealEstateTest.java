import data.Categories;
import data.Currency;
import data.FiltersSearchPanel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import service.BulletinBoardService;
import service.RealEstateService;
import util.MyTestListener;

@Listeners(MyTestListener.class)
public class RealEstateTest extends BaseTest {
    BulletinBoardService boardService = new BulletinBoardService();
    RealEstateService realEstateService = new RealEstateService();

    @Test(description = "Проверка чек-бокса «Только бизнес объявления»")
    public void checkingBusinessCheckbox() {
        boardService.selectMainCategory(Categories.REAL_ESTATE);
        realEstateService.selectFilter(FiltersSearchPanel.WITH_PHOTO);
        Assert.assertTrue(realEstateService.isPhotoChecked());       //todo
    }

    @Test(description = "Проверка фильтра по цене в разделе «Недвижимость»")  //todo
    public void checkingTheFilterByPriceInTheRealEstateSection() {
        boardService.selectMainCategory(Categories.REAL_ESTATE);
        realEstateService.filterByPrice(1000, 2000, Currency.MDL);
    }


}



