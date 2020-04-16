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
        createAlert.createHighAlert(testBase);
    }
    @Test
    public void test(){
        System.out.println("NOW!");

        AppHomeScreen appHomeScreen = new AppHomeScreen(testBase.driver);
        appHomeScreen.menuButton.click();
        MenuScreen menuScreen = new MenuScreen(testBase.driver);
        menuScreen.settingsButton.click();
        menuScreen.manageAlertsButton.click();
        ManageAlertsScreen manageAlertsScreen = new ManageAlertsScreen(testBase.driver);
        testBase.driver.getPageSource();
        manageAlertsScreen.mostRecentAlert.click();
        NewAlertScreen newAlertScreen = new NewAlertScreen(testBase.driver);
        System.out.println("1");
        newAlertScreen.humidityField.clear();
        System.out.println("2");
        newAlertScreen.humidityField.sendKeys("0");
        System.out.println("3");

        newAlertScreen.alertConditionSpinner.click();
        newAlertScreen.humidityBelowCondition.click();
        newAlertScreen.createButton.click();
        manageAlertsScreen.mostRecentAlert.click();
        assertTrue(newAlertScreen.humidityField.getText().equals("0") && newAlertScreen.alertConditionSpinnerText.getText().equals("Below"));
    }

    @After
    public void end(){
        testBase.tearDown();
    }
}
