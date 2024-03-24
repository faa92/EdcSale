package util;

import data.Categories;
import data.Currency;
import data.FiltersSearchPanel;
import org.testng.annotations.DataProvider;

import java.util.Arrays;
import java.util.Random;

public class MyDataProvider {

    @DataProvider(name = "categories")
    public static Object[] testDataCategories() {
        return Arrays.stream(Categories.values())
                .map(filter -> new Object[]{filter})
                .toArray(Object[][]::new);
    }

    @DataProvider(name = "currency")
    public static Object[][] testDataCurrency() {
        return Arrays.stream(Currency.values())
                .map(filter -> new Object[]{filter})
                .toArray(Object[][]::new);
    }

    @DataProvider(name = "filters")
    public static Object[][] testDataFilters() {
        return Arrays.stream(FiltersSearchPanel.values())
                .map(filter -> new Object[]{filter})
                .toArray(Object[][]::new);
    }

    @DataProvider(name = "currencyAndRandomPrice")
    public static Object[][] getCurrencyAndRandomPriceData() {
        Random random = new Random();
        int minPrice = 1000;
        int maxPrice = 100000;
        Currency[] currencies = Currency.values();

        Object[][] data = new Object[currencies.length][3];

        for (int i = 0; i < currencies.length; i++) {
            Currency currency = currencies[i];
            int from = minPrice + random.nextInt(maxPrice + 1);
            int to = from + random.nextInt(maxPrice + from + 1);

            data[i] = new Object[]{currency, from, to};
        }

        return data;
    }

}
