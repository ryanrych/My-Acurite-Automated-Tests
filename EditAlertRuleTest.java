import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import screens.*;

import java.net.MalformedURLException;

import static junit.framework.TestCase.assertTrue;

public class EditAlertRuleTest {
    protected TestBase testBase = new TestBase();
    protected  CreateAlertRuleTest createAlert = new CreateAlertRuleTest();

    @Before
    public void setup() throws MalformedURLException, InterruptedException {
        testBase.setUp();
        testBase.login();
        createAlert.createAlert();
    }
    @Test
    public void test(){
        AppHomeScreen appHomeScreen = new AppHomeScreen(testBase.driver);
        MenuScreen menuScreen = new MenuScreen((testBase.driver));
        NewAlertScreen newAlertScreen = new NewAlertScreen(testBase.driver);
        ManageAlertsScreen manageAlertsScreen = new ManageAlertsScreen(testBase.driver);

        appHomeScreen.menuButton.click();
        try {
            menuScreen.settingsButton.click();
        }catch (Exception e){
            menuScreen.closeDrawerButton.click();
            appHomeScreen.menuButton.click();
            menuScreen.alertsButton.click();
            appHomeScreen.menuButton.click();
            menuScreen.settingsButton.click();
        }
        menuScreen.manageAlertsButton.click();
        manageAlertsScreen.mostRecentAlert.click();
        newAlertScreen.humidityField.sendKeys("0");
        newAlertScreen.alertConditionSpinner.click();
        newAlertScreen.humidityBelowCondition.click();
        newAlertScreen.createButton.click();
        manageAlertsScreen.mostRecentAlert.click();
        assertTrue(newAlertScreen.humidityField.getText().equals("100") && newAlertScreen.alertConditionSpinnerText.getText().equals("Below"));
    }

    @After
    public void end(){
        testBase.tearDown();
    }
}
