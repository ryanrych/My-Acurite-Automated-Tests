import io.appium.java_client.TouchAction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import screens.AppHomeScreen;

import java.net.MalformedURLException;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ForecastChangeTest {
    protected TestBase testBase = new TestBase();

    @Before
    public void setup() throws MalformedURLException, InterruptedException {
        testBase.setUp();
        testBase.login();
    }
    @Test
    public void test(){
        AppHomeScreen appHomeScreen = new AppHomeScreen(testBase.driver);
        Dimension windowSize = testBase.driver.manage().window().getSize();
        testBase.driver.swipe(windowSize.width/2,1757,windowSize.width/2,324,250);
        String original=appHomeScreen.forecastLabel.getText();
        appHomeScreen.forecastDropdown.click();
        appHomeScreen.dayForecast.click();
        assertTrue(!(original.equals(appHomeScreen.forecastLabel.getText())));
    }

    @After
    public void end(){
        testBase.tearDown();
    }
}
