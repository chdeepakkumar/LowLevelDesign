package pattern.creational.factory;

import pattern.creational.factory.api.ApiClient;
import pattern.creational.factory.api.ApiClientFactory;
import pattern.creational.factory.api.ApiConstants;


public class Driver {

    // We have an API and it can be connected in 3 different ways
    // 1. User id and password
    // 2. API key
    // 3. Auth token based
    public static void main(String[] args) {
        ApiClient keyApiClient = ApiClientFactory.getApiClient(ApiConstants.API_KEY);
        ApiClient idPassApiClient = ApiClientFactory.getApiClient(ApiConstants.ID_PASS);
        ApiClient tokenApiClient = ApiClientFactory.getApiClient(ApiConstants.ACCESS_TOKEN);
    }
}
