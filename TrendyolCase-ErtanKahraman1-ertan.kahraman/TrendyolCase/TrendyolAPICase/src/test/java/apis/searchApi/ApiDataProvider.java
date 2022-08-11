package apis.searchApi;

import org.testng.annotations.DataProvider;

public class ApiDataProvider {

    @DataProvider(name = "allOfProductData")
    public static Object[][] allOfProductData() {
        return new Object[][]{
                {"sennheiser"},
                {"powerbank"},
                {"asdasddd"},
                {"aoıdjsaıa"},
                {"+%^%"}
        };
    }

    @DataProvider(name = "validProductData")
    public static Object[][] validProductData() {
        return new Object[][]{
                {"sennheiser"},
                {"powerbank"},
        };
    }

    @DataProvider(name = "invalidProductData")
    public static Object[][] invalidProductData() {
        return new Object[][]{
                {"asdasddd"},
                {"aoıdjsaıa"},
                {"+%^%"}
        };
    }
}
