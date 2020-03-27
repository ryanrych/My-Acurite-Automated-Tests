import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import screens.AppHomeScreen;

import java.net.MalformedURLException;

import static org.junit.Assert.*;

public class StatusCheckTest {
    protected TestBase testBase = new TestBase();

    @Before
    public void setup() throws MalformedURLException, InterruptedException {
        testBase.setUp();
        testBase.login();
    }
    @Test
    public void test(){
        AppHomeScreen appHomeScreen = new AppHomeScreen(testBase.driver);
        appHomeScreen.statusButton.click();
        assertTrue(appHomeScreen.statusTitle.isDisplayed());
        try{Thread.sleep(4000);}
        catch (Exception e){System.out.println("Error in sleep");}
        try{assertFalse(appHomeScreen.statusTitle.isDisplayed());}
        catch (Exception e) {}//This means it couldn't find the item, therefore the test passes
    }

    @After
    public void end(){
        testBase.tearDown();
    }
}
