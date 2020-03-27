package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.apache.xpath.XPath;

public class AppHomeScreen extends FieldLookupScreen {

    @AndroidFindBy(id = "com.pfoc.myacurite:id/smart_hub_page_content")
    //@iOSFindBy(accessibility = "home_sign_in") //needs proper apple element ID
    public MobileElement SmartHubPageContent;

    @AndroidFindBy(id = "com.pfoc.myacurite:id/forecast_spinner")
    //add IOS ID
    public MobileElement forecastDropdown;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")
    //add IOS ID
    public MobileElement weekForecast;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
    //add IOS ID
    public MobileElement dayForecast;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]")
    //add IOS ID
    public MobileElement forecastLabel;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")
    //add IOS ID
    public MobileElement statusButton;

    @AndroidFindBy(id = "com.pfoc.myacurite:id/device_status_title")
    //add IOS ID
    public MobileElement statusTitle;

    @AndroidFindBy(id ="com.pfoc.myacurite:id/toolbar_action_text")
    //add IOS ID
    public MobileElement alertsButton;

    @AndroidFindBy(accessibility = "Open navigation drawer")
    //add IOS ID
    public MobileElement menuButton;



    public AppHomeScreen(AppiumDriver driver) {
        super(driver);
    }
}
