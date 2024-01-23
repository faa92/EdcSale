import org.testng.annotations.Listeners;
import service.BulletinBoardService;
import service.RealEstateService;
import util.MyTestListener;

@Listeners(MyTestListener.class)
public class RealEstateTest extends BaseTest {
    BulletinBoardService boardService = new BulletinBoardService();
    RealEstateService realEstateService = new RealEstateService();

//    @Test
//    public void goToTheRealEstateCategory() {
//        boardService.selectMainCategory(Categories.REAL_ESTATE);
//        Assert.assertTrue(realEstateService.isLoadedCorrectSearchContainer());
//    }
//
//    @Test
//    public void checkingTheAllCategoriesDropDownMenu() {
//       Assert.assertTrue(realEstateService.isDisplayedElementsDropDownMenu());
//    }


}



