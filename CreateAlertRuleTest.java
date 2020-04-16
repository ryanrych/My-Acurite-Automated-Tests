import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import screens.*;

import java.net.MalformedURLException;

import static junit.framework.TestCase.assertTrue;

public class CreateAlertRuleTest {
    protected TestBase testBase = new TestBase();

    //Same code as the test, used as @Before code for other tests
    public void createHighAlert(TestBase testBase) throws MalformedURLException, InterruptedException{
        AppHomeScreen appHomeScreen = new AppHomeScreen(testBase.driver);
        appHomeScreen.menuButton.click();
        MenuScreen menuScreen = new MenuScreen(testBase.driver);
        menuScreen.alertsButton.click();
        AlertsScreen alertsScreen = new AlertsScreen(testBase.driver);
        NewAlertScreen newAlertScreen = new NewAlertScreen(testBase.driver);
        alertsScreen.moreOptionsButton.click();
        alertsScreen.createAlertButton.click();
        AlertTypeListScreen alertTypeListScreen = new AlertTypeListScreen(testBase.driver);
        alertTypeListScreen.humidityButton.click();
        try {
            newAlertScreen.humidityField.sendKeys("100");
            newAlertScreen.createButton.click();
        }catch (Exception e){
            alertsScreen.moreOptionsButton.click();
            alertsScreen.createAlertButton.click();
            alertTypeListScreen.humidityButton.click();
            newAlertScreen.humidityField.sendKeys("100");
            newAlertScreen.createButton.click();
        }
        appHomeScreen.menuButton.click();
        menuScreen.dashboardButton.click();
    }

    public void createLowAlert(TestBase testBase) throws MalformedURLException, InterruptedException{
        AppHomeScreen appHomeScreen = new AppHomeScreen(testBase.driver);
        appHomeScreen.menuButton.click();
        MenuScreen menuScreen = new MenuScreen(testBase.driver);
        menuScreen.alertsButton.click();
        AlertsScreen alertsScreen = new AlertsScreen(testBase.driver);
        NewAlertScreen newAlertScreen = new NewAlertScreen(testBase.driver);
        alertsScreen.moreOptionsButton.click();
        alertsScreen.createAlertButton.click();
        AlertTypeListScreen alertTypeListScreen = new AlertTypeListScreen(testBase.driver);
        alertTypeListScreen.humidityButton.click();
        try {
            newAlertScreen.humidityField.sendKeys("0");
            newAlertScreen.alertConditionSpinner.click();
            newAlertScreen.humidityBelowCondition.click();
            newAlertScreen.createButton.click();
        }catch (Exception e){
            alertsScreen.moreOptionsButton.click();
            alertsScreen.createAlertButton.click();
            alertTypeListScreen.humidityButton.click();
            newAlertScreen.humidityField.sendKeys("0");
            newAlertScreen.alertConditionSpinner.click();
            newAlertScreen.humidityBelowCondition.click();
            newAlertScreen.createButton.click();
        }
        appHomeScreen.menuButton.click();
        menuScreen.dashboardButton.click();
    }


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
        menuScreen.alertsButton.click();
        AlertsScreen alertsScreen = new AlertsScreen(testBase.driver);
        NewAlertScreen newAlertScreen = new NewAlertScreen(testBase.driver);
        alertsScreen.moreOptionsButton.click();
        alertsScreen.createAlertButton.click();
        AlertTypeListScreen alertTypeListScreen = new AlertTypeListScreen(testBase.driver);
        alertTypeListScreen.humidityButton.click();
        try {
            newAlertScreen.humidityField.sendKeys("100");
            newAlertScreen.createButton.click();
        }catch (Exception e){
            alertsScreen.moreOptionsButton.click();
            alertsScreen.createAlertButton.click();
            alertTypeListScreen.humidityButton.click();
            newAlertScreen.humidityField.sendKeys("100");
            newAlertScreen.createButton.click();
        }
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
        ManageAlertsScreen manageAlertsScreen = new ManageAlertsScreen(testBase.driver);
        manageAlertsScreen.mostRecentAlert.click();
        assertTrue(newAlertScreen.humidityField.getText().equals("100") && newAlertScreen.alertConditionSpinnerText.getText().equals("Above"));
    }

    @After
    public void end(){
        testBase.tearDown();
    }
}
