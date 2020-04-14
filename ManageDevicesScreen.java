package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ManageDevicesScreen extends FieldLookupScreen {

    @AndroidFindBy(id = "com.pfoc.myacurite:id/display_units_section")
    //add IOS ID
    public MobileElement displayUnitsSettingsButton;

    public ManageDevicesScreen(AppiumDriver driver) {
        super(driver);
    }
}
