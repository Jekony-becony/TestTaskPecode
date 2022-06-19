package utils;

public class MainCoreDataManager extends DataManager {
    private static DataConfig DataConfig;


    public static DataConfig getDataConfig() {
        return getConfigData(DataConfig, DataConfig.class);
    }

}


