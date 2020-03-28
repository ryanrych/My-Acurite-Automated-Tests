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

    public NewAlertScreen(AppiumDriver driver) {
        super(driver);
    }
}