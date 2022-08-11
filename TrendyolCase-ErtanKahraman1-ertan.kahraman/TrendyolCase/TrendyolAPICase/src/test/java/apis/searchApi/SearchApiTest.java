package apis.searchApi;

import apis.searchApi.elements.HelperMethods;
import apis.searchApi.parameters.ResponseParameters;
import com.jayway.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchApiTest {
    ResponseParameters responseParameters = new ResponseParameters();
    HelperMethods helperMethods = new HelperMethods();

    String isSuccess;
    String targetUrlInResponse;
    String statusCode;
    String textNameInResponse;
    String resultInResponse;

    @Test(dataProvider = "allOfProductData", dataProviderClass = ApiDataProvider.class)
    public void checkIfTheReturnResponseIs200(String product) {
        statusCode = helperMethods.getResponseToString(product).substring(31, 34);
        isSuccess = helperMethods.getResponseToString(product).substring(13, 17);

        Assert.assertEquals(statusCode, "200", "Status code is not 200.");
        Assert.assertEquals(isSuccess, "true", "isSuccess is not true.");
    }

    @Test(dataProvider = "allOfProductData", dataProviderClass = ApiDataProvider.class)
    public void checkIfEmptyTargetURl(String product) {
        JsonPath jsonPath = new JsonPath(helperMethods.getResponseToString(product));
        targetUrlInResponse = jsonPath.getList(responseParameters.getProductTargetUrl()).toString();
        Assert.assertNotNull(targetUrlInResponse, "Target url is null.");
    }

    @Test(dataProvider = "validProductData", dataProviderClass = ApiDataProvider.class)
    public void checkIfContainsAProductWhenValidDataIsUsedAtSearchApi(String product) {
        JsonPath jsonPath = new JsonPath(helperMethods.getResponseToString(product));
        textNameInResponse = jsonPath.getList(responseParameters.getProductTextName()).toString();
        Assert.assertTrue(textNameInResponse.contains(product), "Product is not found.");
    }


    @Test(dataProvider = "invalidProductData", dataProviderClass = ApiDataProvider.class)
    public void checkIfContainsAProductWhenInvalidDataIsUsedAtSearchApi(String product) {
        JsonPath jsonPath = new JsonPath(helperMethods.getResponseToString(product));
        textNameInResponse = jsonPath.getList(responseParameters.getProductTextName()).toString();
        Assert.assertFalse(textNameInResponse.contains(product), "Product is found.");
    }

    @Test(dataProvider = "invalidProductData", dataProviderClass = ApiDataProvider.class)
    public void checkIfEmptyResult(String product) {
        JsonPath jsonPath = new JsonPath(helperMethods.getResponseToString(product));
        resultInResponse = jsonPath.getList(responseParameters.getProductResult()).toString();
        Assert.assertFalse(resultInResponse.contains(product), "Result is not empty.");
    }
}
