import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import screens.AppHomeScreen;
import screens.MenuScreen;
import screens.ThemeScreen;

import java.net.MalformedURLException;

import static org.junit.Assert.*;

public class ThemeChangeTest {
    protected TestBase testBase = new TestBase();

    @Before
    public void setup() throws MalformedURLException, InterruptedException {
        testBase.setUp();
        testBase.login();
    }
    @Test
    public void test(){
        AppHomeScreen appHomeScreen = new AppHomeScreen(testBase.driver);
        appHomeScreen.alertsButton.click();
        appHomeScreen.menuButton.click();
        MenuScreen menuScreen = new MenuScreen(testBase.driver);
        menuScreen.settingsButton.click();
        menuScreen.themeSettingsButton.click();
        ThemeScreen themeScreen = new ThemeScreen(testBase.driver);
        assertTrue((themeScreen.darkButton.getAttribute("checked").equals("1")||themeScreen.lightButton.getAttribute("checked").equals("0")));
        themeScreen.lightButton.click();
        assertTrue((themeScreen.darkButton.getAttribute("checked").equals("0")||themeScreen.lightButton.getAttribute("checked").equals("1")));
    }

    @After
    public void end(){
        testBase.tearDown();
    }
}