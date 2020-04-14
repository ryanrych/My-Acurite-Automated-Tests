package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SetDisplayUnitsScreen extends FieldLookupScreen {

    @AndroidFindBy(id = "com.pfoc.myacurite:id/temperature_switch")
    //add IOS ID
    public MobileElement temperatureInTenthsButton;

    @AndroidFindBy(id = "com.pfoc.myacurite:id/sample_number_tenths")
    //add IOS ID
    public MobileElement tenthsExample;

    public SetDisplayUnitsScreen(AppiumDriver driver) {
        super(driver);
    }
}
