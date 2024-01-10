import org.testng.Assert;
import org.testng.annotations.Test;
import service.BulletinBoardService;

public class BulletinBoardTest extends  BaseTest{
    BulletinBoardService bulletinBoardService = new BulletinBoardService();
    @Test
    public void clickabilityCategoryOnBulletinBoard(){
        Assert.assertTrue(bulletinBoardService.clickOnEachCategory(), "Category clickability failed!");
    }



}
