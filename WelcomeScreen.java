package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class WelcomeScreen extends FieldLookupScreen {

    @AndroidFindBy(id = "com.pfoc.myacurite:id/welcome_log_in_button")
    @iOSFindBy(accessibility = "home_sign_in")
    public MobileElement loginButton;

    public WelcomeScreen(AppiumDriver driver) {
        super(driver);
    }
}