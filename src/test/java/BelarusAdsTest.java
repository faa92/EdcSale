import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import service.BelarusAdsService;
import service.BulletinBoardService;
import util.MyTestListener;

@Listeners(MyTestListener.class)
public class BelarusAdsTest extends BaseTest {

    BelarusAdsService belarusAdsService = new BelarusAdsService();
    BulletinBoardService bulletinBoardService = new BulletinBoardService();

    @Test(description = "Проверка кнопки поиска без ввода запроса")
    public void TestingTheSearchButtonWithoutEnteringQuery() {
        bulletinBoardService.clickTheSearchButton();
        Assert.assertTrue(belarusAdsService.isCheckHeaderAndCategories());
    }
}
