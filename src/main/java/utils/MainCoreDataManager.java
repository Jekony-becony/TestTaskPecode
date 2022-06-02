package utils;

public class MainCoreDataManager extends DataManager {
    private static CommonConfig deviceCommonConfig;
    private static AndroidDeviceConfig androidDeviceConfig;


    public static CommonConfig getDeviceCommonConfig() {
        return getConfigData(deviceCommonConfig, CommonConfig.class);
    }

    public static AndroidDeviceConfig getAndroidDeviceConfig() {
        return getConfigData(androidDeviceConfig, AndroidDeviceConfig.class);
    }
}

