package utils;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources({"file:~/target/classes/config.properties"})
public interface CommonConfig extends Config {
    @DefaultValue("http://127.0.0.1:4723/wd/hub")
    @Key("url")
    URL url();
}