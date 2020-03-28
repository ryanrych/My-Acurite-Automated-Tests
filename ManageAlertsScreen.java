package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ManageAlertsScreen extends FieldLookupScreen {

    @AndroidFindBy(id = "com.pfoc.myacurite:id/toolbar_action")
    //add IOS ID
    public MobileElement createAlertButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.RelativeLayout[1]")
    //add IOS ID
    public MobileElement mostRecentAlert;

    public ManageAlertsScreen(AppiumDriver driver) {
        super(driver);
    }
}
