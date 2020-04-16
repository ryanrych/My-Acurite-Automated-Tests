package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MenuScreen extends FieldLookupScreen {

    @AndroidFindBy(xpath = "//*[@text=\"Dashboard\"]")
    //add IOS ID
    public MobileElement dashboardButton;

    //@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]")
    @AndroidFindBy(xpath = "//*[@text=\"Settings\"]")
    //add IOS ID
    public MobileElement settingsButton;

    @AndroidFindBy(xpath = "//*[@text=\"Manage Alerts\"]")
    //add IOS ID
    public MobileElement manageAlertsButton;

    @AndroidFindBy(xpath = "//*[@text=\"Theme Options\"]")
    //add IOS ID
    public MobileElement themeSettingsButton;

    @AndroidFindBy(xpath = "//*[@text=\"Alerts\"]")
    //add IOS ID
    public MobileElement alertsButton;

    @AndroidFindBy(xpath = "//*[@text=\"Manage Alerts\"]")
    //add IOS ID
    public MobileElement manageDevicesButton;

    @AndroidFindBy(accessibility = "Close navigation drawer")
    //add IOS ID
    public MobileElement closeDrawerButton;

    public MenuScreen(AppiumDriver driver) {
        super(driver);
    }
}