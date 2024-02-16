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

//    @DataProvider(name = "priceAndCurrency")  //todo
//    public static Object[][] testDataPriceFromAndCurrency() {
//        return Price.values(), Currency.values();
//    }

//    @DataProvider(name = "priceAndCurrency")  //todo
//    public static Object[][] testDataPriceFromAndCurrency1() {
//        Price[] prices = Price.values();
//        Currency[] currencies = Currency.values();
//        Object[][] data = new Object[prices.length][2];
//
//        for (int i = 0; i < prices.length; i++) {
//            data[i][0] = prices[i];
//            data[i][1] = currencies[i];
//        }
//        return data;
//    }


}
