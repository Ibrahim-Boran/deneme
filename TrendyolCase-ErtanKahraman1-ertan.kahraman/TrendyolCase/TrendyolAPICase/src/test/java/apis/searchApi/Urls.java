package apis.searchApi;

public class Urls {
    private String searchURL = "https://public.trendyol.com/discovery-web-searchgw-service/api/suggestions/v3?text={product}&storefrontId=1&culture=tr-TR";

    public String getSearchURL() {
        return searchURL;
    }
}