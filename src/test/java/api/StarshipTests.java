package api;

import models.ShipsResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StarshipTests extends ApiBaseTest {

    @Test(description = "Get the info about starship")
    protected void starship() {
        ShipsResponse shipsResponse = starshipsRequest.getStarship(HttpStatus.SC_OK);
        assertEquals(shipsResponse.getName(), "Death Star");
    }
}
