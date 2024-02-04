import data.Categories;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import service.BulletinBoardService;
import util.MyTestListener;

@Listeners(MyTestListener.class)
public class BulletinBoardTest extends BaseTest {
    BulletinBoardService bulletinBoardService = new BulletinBoardService();

    @Test(description = "Проверка перечня категорий на домашней странице")
    public void expectedCategoriesList() {
        bulletinBoardService.extendDropdownMenuAllCategories();
        Assert.assertTrue(bulletinBoardService.isCategoriesCorrect(Categories.values()));
    }

    @Test(description = "Проверка выпадающего меню  «Все категории»")
    public void checkingTheAllCategoriesDropdownMenu() {
        bulletinBoardService.extendDropdownMenuAllCategories();
        Assert.assertTrue(bulletinBoardService.isCheckedDropDownMenuAndAllElements());
    }

    @Test(description = "Проверка выпадающего списка объявлений в строке поиска после ввода запроса")
    public void checkingTheDropDownListOfAdsInTheSearchBar() {
        int expectedValue = 5; //todo
        bulletinBoardService.enterRequest("Автомобиль BMW");              //todo каждый раз сохдавать Енам с одним значением? или свалка в одном енаме?
        Assert.assertTrue(bulletinBoardService.waitDisplayedAdsBlock());
        Assert.assertEquals(bulletinBoardService.countAds(), expectedValue);
        Assert.assertTrue(bulletinBoardService.isMatchesTheRequest("BMW")); //todo
    }

}
