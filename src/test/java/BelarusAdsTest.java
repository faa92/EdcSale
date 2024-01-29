import data.Categories;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.BelarusAdsService;
import service.BulletinBoardService;

public class BelarusAdsTest extends BaseTest {

    BelarusAdsService belarusAdsService = new BelarusAdsService();
    BulletinBoardService bulletinBoardService = new BulletinBoardService();

    @Test(description = "Проверка кнопки поиска без ввода запроса")
    public void TestingTheSearchButtonWithoutEnteringQuery() {
        bulletinBoardService.clickTheSearchButton();
        Assert.assertTrue(belarusAdsService.isDisplayedHeader());
        Assert.assertTrue(belarusAdsService.IsDisplayListCategories());
        Assert.assertTrue(belarusAdsService.isCategoryCorrect(Categories.values()));
    }
}
