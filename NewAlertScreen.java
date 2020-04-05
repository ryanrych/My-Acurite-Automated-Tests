package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class NewAlertScreen extends FieldLookupScreen {

    @AndroidFindBy(id = "com.pfoc.myacurite:id/alert_value_entry")
    //add IOS ID
    public MobileElement humidityField;

    @AndroidFindBy(id = "com.pfoc.myacurite:id/add_alert_button")
    //add IOS ID
    public MobileElement createButton;

    @AndroidFindBy(id = "com.pfoc.myacurite:id/alert_condition_spinner")
    //add IOS ID
    public MobileElement alertConditionSpinner;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Spinner/android.widget.TextView")
    //add IOS ID
    public MobileElement alertConditionSpinnerText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
    //add IOS ID
    public MobileElement humidityBelowCondition;

    @AndroidFindBy(id = "com.pfoc.myacurite:id/toolbar_action")
    //add IOS ID
    public MobileElement deleteAlertButton;

    @AndroidFindBy(id = "android:id/button1")
    //add IOS ID
    public MobileElement confirmDeleteButton;

    public NewAlertScreen(AppiumDriver driver) {
        super(driver);
    }
}