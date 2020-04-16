import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import screens.*;

import java.net.MalformedURLException;

import static junit.framework.TestCase.assertTrue;

public class DeleteAlertRuleTest {
    protected TestBase testBase = new TestBase();
    protected CreateAlertRuleTest createAlert = new CreateAlertRuleTest();

    @Before
    public void setup() throws MalformedURLException, InterruptedException {
        testBase.setUp();
        testBase.login();
        createAlert.createLowAlert(testBase);
        createAlert.createHighAlert(testBase);
    }
    @Test
    public void test(){
        AppHomeScreen appHomeScreen = new AppHomeScreen(testBase.driver);
        MenuScreen menuScreen = new MenuScreen((testBase.driver));
        NewAlertScreen newAlertScreen = new NewAlertScreen(testBase.driver);
        ManageAlertsScreen manageAlertsScreen = new ManageAlertsScreen(testBase.driver);

        appHomeScreen.menuButton.click();
        menuScreen.settingsButton.click();
        menuScreen.manageAlertsButton.click();
        testBase.driver.getPageSource();
        String mostRecent=manageAlertsScreen.mostRecentAlert.getAttribute("Text");
        manageAlertsScreen.mostRecentAlert.click();
        newAlertScreen.deleteAlertButton.click();
        newAlertScreen.confirmDeleteButton.click();
        assertTrue(!manageAlertsScreen.mostRecentAlert.getAttribute("Text").equals(mostRecent));
    }

    @After
    public void end(){
        testBase.tearDown();
    }
}
