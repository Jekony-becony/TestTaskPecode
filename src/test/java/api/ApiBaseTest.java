package api;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.BeforeTest;

@Slf4j
public abstract class ApiBaseTest {
    protected StarshipsRequest starshipsRequest;

    @BeforeTest
    public void setUpApi() {
        starshipsRequest = new StarshipsRequest();
    }
}
