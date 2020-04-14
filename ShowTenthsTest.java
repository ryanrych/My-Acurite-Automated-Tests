import io.appium.java_client.TouchAction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import screens.AppHomeScreen;
import screens.ManageDevicesScreen;
import screens.MenuScreen;
import screens.SetDisplayUnitsScreen;

import java.net.MalformedURLException;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ShowTenthsTest {
    protected TestBase testBase = new TestBase();

    @Before
    public void setup() throws MalformedURLException, InterruptedException {
        testBase.setUp();
        testBase.login();
    }
    @Test
    public void test(){
        AppHomeScreen appHomeScreen = new AppHomeScreen(testBase.driver);
        appHomeScreen.menuButton.click();

        MenuScreen menuScreen = new MenuScreen(testBase.driver);
        try {
            menuScreen.settingsButton.click();
        }catch (Exception e){
            menuScreen.closeDrawerButton.click();
            appHomeScreen.menuButton.click();
            menuScreen.alertsButton.click();
            appHomeScreen.menuButton.click();
            menuScreen.settingsButton.click();
        }
        menuScreen.manageDevicesButton.click();

        ManageDevicesScreen manageDevicesScreen = new ManageDevicesScreen(testBase.driver);
        manageDevicesScreen.displayUnitsSettingsButton.click();

        SetDisplayUnitsScreen setDisplayUnitsScreen = new SetDisplayUnitsScreen(testBase.driver);
        if (setDisplayUnitsScreen.temperatureInTenthsButton.getAttribute("checked").equals("true")){
            setDisplayUnitsScreen.temperatureInTenthsButton.click();
        }
        try{
            setDisplayUnitsScreen.tenthsExample.getAttribute("text");
            assertTrue(1==0);
        }catch (Exception e){

        }

        appHomeScreen.menuButton.click();
        menuScreen.dashboardButton.click();



    }

    @After
    public void end(){
        testBase.tearDown();
    }
}