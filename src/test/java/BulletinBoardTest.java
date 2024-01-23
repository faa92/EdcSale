import data.Categories;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import service.BulletinBoardService;
import util.MyTestListener;

@Listeners(MyTestListener.class)
public class BulletinBoardTest extends BaseTest {
    BulletinBoardService bulletinBoardService = new BulletinBoardService();

    @Test
    public void expectedCategoriesList() {
        Assert.assertTrue(bulletinBoardService.isCategoriesCorrect(Categories.values()));
    }

    @Test
    public void checkingTheAllCategoriesDropdownMenu() {
        bulletinBoardService.extendDropdownMenuAllCategories();
        Assert.assertTrue(bulletinBoardService.isPresentMenu());
        Assert.assertTrue(bulletinBoardService.isCorrectLoadedAllElementsMenu());
    }

    @Test
    public void checkingTheDropDownListOfAdsInTheSearchBar() {
        int expectedValue = 5;
        bulletinBoardService.enterRequest();
        Assert.assertTrue(bulletinBoardService.waitDisplayedAdsBlock(wait));
        Assert.assertEquals(bulletinBoardService.countAds(), expectedValue);
        Assert.assertTrue(bulletinBoardService.isMatchesTheRequest());
    }


}
