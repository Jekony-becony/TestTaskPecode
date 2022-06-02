package utils;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

public abstract class DataManager {
    protected static <T extends Config> T getConfigData(T configObject, Class<T> c) {
        if (configObject == null) {
            configObject = ConfigFactory.create(c, System.getProperties());
        }
        return configObject;
    }
}