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
    public void clickabilityCategoryOnBulletinBoard() {
        Assert.assertTrue(bulletinBoardService.clickOnEachCategory(), "Category clickability failed!");
    }

    @Test
    public void expectedCategoriesHashMap() {
        bulletinBoardService.actualResult();
        Categories.getAllCategories();

    }
}
