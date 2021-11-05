import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.fail;

@SpringBootTest
public class IntegrationTest {

    @Autowired
    TaxService taxService = new TaxService();

@Test
    public void test(){
        taxService.someMethod();
    }
}
