package api;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import models.ShipsResponse;

import static io.restassured.RestAssured.given;

public class StarshipsRequest extends MainRequest {
    public ShipsResponse getStarship(int expectedCode) {
        RequestSpecification requestSpecification = given();
        Response response = get("starships/9/", requestSpecification, expectedCode);
        return gson.fromJson(response.asString(), ShipsResponse.class);
    }
}
