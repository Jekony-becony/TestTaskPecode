package utils;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({"classpath:android.properties"})
public interface AndroidDeviceConfig extends Config {
    @Key("device_name")
    String deviceName();

    @Key("platform_Version")
    String platformVersion();

    @Key("avd_Android")
    String avdAndroid();

    @Key("automation_name")
    String automationName();

    @Key("platform_name")
    String platformName();
}
