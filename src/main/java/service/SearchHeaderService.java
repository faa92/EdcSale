package service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.SearchHeader;
import data.Categories;


public class SearchHeaderService extends BaseService {
    private final SearchHeader searchHeader;
    public SearchHeaderService() {
        super(SearchHeaderService.class);
        this.searchHeader = new SearchHeader();
    }

    public boolean isWorkTheSearchField() {
        try {
            if (searchHeader.getSearchField().isDisplayed() && searchHeader.getSearchButton().isDisplayed()) {
                logger.info("Search field and search button is displayed");
                searchHeader.getSearchField().click();
                logger.info("Write search text");
                searchHeader.getSearchField().sendKeys("BMW");
                logger.info("Click search button");
                searchHeader.getSearchButton().click();
            } else return false;

        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean isDisplayedAllCategories() {
        try {
            searchHeader.getAllCategories().click();
            if (searchHeader.getDropDownMenu().isDisplayed()) {
                logger.info("Menu is displayed");

                boolean allCategories = true;

                for (Categories category : Categories.values()) {
                    WebElement categoryElement = searchHeader
                            .getDropDownMenu()
                            .findElement(By.xpath(
                                    "//span[contains(text(), '" + category + "')]"));
                    logger.info("Category " + category + " displayed");

                    if (!categoryElement.isDisplayed()) {
                        allCategories = false;
                        break;
                    }
                }
                if (allCategories) {
                    logger.info("All categories are displayed");
                } else {
                    logger.info("Not all categories are displayed");
                }
            } else {
                logger.info("The menu with categories is not displayed");
            }
            return true;
        } catch (Exception e) {
            return  false;
        }
    }

}
