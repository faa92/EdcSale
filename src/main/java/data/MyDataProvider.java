package data;

import org.testng.annotations.DataProvider;

public class MyDataProvider {

    @DataProvider(name = "categoriesProvider")
    public static Object[] testDataCategories() {
        return Categories.values();
    }

    @DataProvider(name = "currencyProvider")
    public static Object[] testDataCurrency() {
        return Currency.values();
    }

    @DataProvider(name = "filtersProvider")
    public static Object[] testDataFilters() {
        return FiltersSearchPanel.values();
    }


}
