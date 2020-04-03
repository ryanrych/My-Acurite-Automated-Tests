import com.gargoylesoftware.htmlunit.javascript.host.Touch;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import screens.AppHomeScreen;
import screens.LoginScreen;
import screens.WelcomeScreen;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.junit.Assert.assertTrue;

//import java.time.chrono.ChronoLocalDate;

import static org.junit.Assert.fail;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    protected AppiumDriver driver;
    
    //@Before
    public void setUp() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        //File Paths for different users
        String connorFilePath = "C:/Users/chutson/Desktop/MyAcuRite-integration-debug.apk";
        String ryanFilePath = "C:/Users/ryanj/..PROGRAMS/Java/Primex/AppiumCodeForAndroid/AppiumAutomation/MAR.apk";
        String macFilePath = "";
        //If running the test locally uncomment the appropriate sections

        // ### --Android Local Configuration--
        desiredCapabilities.setCapability("platform", "Android");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appWaitActivity", ".onboard.OnBoardActivity");

        //Replace these with the correct values for your emulator and app path
        desiredCapabilities.setCapability("platformVersion", "10");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("app", ryanFilePath);
        desiredCapabilities.setCapability("avd","Pixel_2_API_29");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        // ### --End Android Config--

        // ### --iOS Local Configuration--
        // ### --End iOS Configuration--

        // ### --AWS Device Farm Configuration--

        // String environment = System.getenv("DEVICEFARM_DEVICE_PLATFORM_NAME");
        // System.out.println("Environment: " + environment);
        
        // if( environment != null ) {
        //     if( environment.equalsIgnoreCase("Android") ) {
        //         System.out.println("Running Android Tests");
        //         desiredCapabilities.setCapability("appWaitActivity", ".onboard.OnBoardActivity");
        //         driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        //     } else if( environment.equalsIgnoreCase("iOS") ) {

        //     } else {
        //         fail("Unable to detect platform to run on");
        //     }
        // } else {
        //     fail("Unable to read platform name variable");
        // }
        // ### --End AWS Device Farm Config Branch--
    }

    //Same code as the test, used as @Before code for other tests
    public void login() {

        //Click on the welcome screen first.
        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        welcomeScreen.loginButton.click();

        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.emailField.sendKeys("benbrosius@gmail.com");
        loginScreen.passwordField.sendKeys("Abcd123");
        loginScreen.loginButton.click();

        AppHomeScreen appHomeScreen = new AppHomeScreen(driver);

        int x = 0;
        int triesToFindElement = 0;
        boolean foundDashboard = false;
        while(x < 1){
            if (driver.findElements(By.id("com.pfoc.myacurite:id/smart_hub_page_content")).size()>0) {
                //System.out.println("FOUND");
                foundDashboard = true;
                x++;
            }
            else if (triesToFindElement > 10){
                //System.out.println(triesToFindElement);
                //System.out.println("FAIL -- Tries tp find element (" + triesToFindElement + ") Passed 10");
                x++;
            }
            else {
                //System.out.println("NOT FOUND!");
                triesToFindElement++;
            }

        }

    }

    @Test
    public void loginTest() {

       //Click on the welcome screen first.
       WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
       welcomeScreen.loginButton.click();

       LoginScreen loginScreen = new LoginScreen(driver);
       loginScreen.emailField.sendKeys("benbrosius@gmail.com");
       loginScreen.passwordField.sendKeys("Abcd123");
       loginScreen.loginButton.click();

       AppHomeScreen appHomeScreen = new AppHomeScreen(driver);

       int x = 0;
       int triesToFindElement = 0;
       boolean foundDashboard = false;
       while(x < 1){
           if (driver.findElements(By.id("com.pfoc.myacurite:id/smart_hub_page_content")).size()>0) {
               //System.out.println("FOUND");
               foundDashboard = true;
               x++;
           }
           else if (triesToFindElement > 10){
               //System.out.println(triesToFindElement);
               //System.out.println("FAIL -- Tries tp find element (" + triesToFindElement + ") Passed 10");
               x++;
           }
           else {
               //System.out.println("NOT FOUND!");
               triesToFindElement++;
           }

       }

       assertTrue(foundDashboard);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}



//driver.findElements(By.id("com.pfoc.myacurite:id/smart_hub_page_content")
//appHomeScreen.SmartHubPageContent.isDisplayed()