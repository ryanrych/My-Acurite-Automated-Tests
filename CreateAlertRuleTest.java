import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class CreateAlertRuleTest {
    protected TestBase testBase = new TestBase();

    @Before
    public void setup() throws MalformedURLException, InterruptedException {
        testBase.setUp();
        testBase.login();
    }
    @Test
    public void test(){



    }

    @After
    public void end(){
        testBase.tearDown();
    }
}
