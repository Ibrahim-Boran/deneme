package apis.searchApi.parameters;

public class ResponseParameters {
    private String productTextName = "result.text";
    private String productTargetUrl = "result.targetUrl";
    private String productResult = "result";

    public String getProductTextName() {
        return productTextName;
    }

    public String getProductTargetUrl() {
        return productTargetUrl;
    }

    public String getProductResult() {
        return productResult;
    }
}
