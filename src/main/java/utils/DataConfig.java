package utils;

import org.aeonbits.owner.Config;


@Config.Sources({"classpath:data.properties"})
public interface DataConfig extends Config {

    @DefaultValue("defaultUsername")
    @Key("username")
    String username();

    @DefaultValue("defaultPassword")
    @Key("password")
    String password();
}