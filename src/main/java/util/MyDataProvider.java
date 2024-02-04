package util;

import data.Categories;
import data.Currency;
import data.FiltersSearchPanel;
import org.testng.annotations.DataProvider;

public class MyDataProvider {

    @DataProvider(name = "categories")
    public static Object[] testDataCategories() {
        return Categories.values();
    }

    @DataProvider(name = "currency")
    public static Object[] testDataCurrency() {
        return Currency.values();
    }

    @DataProvider(name = "filters")
    public static Object[] testDataFilters() {
        return FiltersSearchPanel.values();
    }

//    @DataProvider(name = "priceFrom")                           todo как добавлять в параметры теста несколько датапровайдеров?
//    public static Object[] testDataPriceFrom() {
//        return Price.values();
//    }


}
