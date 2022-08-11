package apis.searchApi.elements;

import apis.searchApi.Urls;
import apis.searchApi.parameters.RequestParameters;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;

public class HelperMethods {
    RequestParameters requestParameters = new RequestParameters();
    Urls urls = new Urls();

    public String getResponseToString(String product) {
        Response response = given().
                pathParam(requestParameters.getText(), product).
                when().
                get(urls.getSearchURL());
        return response.asString();
    }
}
