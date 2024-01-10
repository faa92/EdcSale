
import org.testng.Assert;
import org.testng.annotations.Test;
import service.SearchHeaderService;

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

}
