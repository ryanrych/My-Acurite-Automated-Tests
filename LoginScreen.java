package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginScreen extends FieldLookupScreen {

    @AndroidFindBy(id = "com.pfoc.myacurite:id/email_entry")
    @iOSFindBy(accessibility = "login_email")
    public MobileElement emailField;

    @AndroidFindBy(id = "com.pfoc.myacurite:id/password_entry")
    @iOSFindBy(accessibility = "login_password")
    public MobileElement passwordField;

    @AndroidFindBy(id = "com.pfoc.myacurite:id/log_in_button")
    @iOSFindBy(accessibility = "login_button")
    public MobileElement loginButton;

    public LoginScreen(AppiumDriver driver) {
        super(driver);
    }
}