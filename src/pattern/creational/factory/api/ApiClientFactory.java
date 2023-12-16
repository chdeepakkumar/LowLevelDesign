package pattern.creational.factory.api;

public class ApiClientFactory {
    public static ApiClient getApiClient(String type) {
        switch (type) {
            case ApiConstants.API_KEY:
                return new KeyApiClient();
            case ApiConstants.ACCESS_TOKEN:
                return new TokenApiClient();
            case ApiConstants.ID_PASS:
                return new IdPassApiClient();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }
}
