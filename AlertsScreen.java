package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AlertsScreen extends FieldLookupScreen {

    @AndroidFindBy(accessibility = "More options")
    //add IOS ID
    public MobileElement moreOptionsButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout")
    //add IOS ID
    public MobileElement createAlertButton;

    public AlertsScreen(AppiumDriver driver) {
        super(driver);
    }
}