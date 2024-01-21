import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import service.SearchHeaderService;
import util.MyTestListener;

@Listeners(MyTestListener.class)
public class SearchHeaderTest extends  BaseTest {
    SearchHeaderService searchHeaderService = new SearchHeaderService();

    @Test
    public void searchField() {
        Assert.assertTrue(searchHeaderService.isWorkTheSearchField(), "Search field not work");
    }

    @Test
    public void displayedCategories() {
        Assert.assertTrue(searchHeaderService.isDisplayedAllCategories(), "Not all categories are displayed!");
    }

    @Test
    public void checkingSearchByUrl() {
        Assert.assertNotEquals(driver.getCurrentUrl(), searchHeaderService.urlAfterSearch());
    }

}
