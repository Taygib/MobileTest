package config.properties;

import org.aeonbits.owner.Config;

public interface DriverConfig extends Config {

    @Key("Browserstack")
    @DefaultValue("http://hub.browserstack.com/wd/hub")
    String urlBrowserstack();

    @Key("user")
    @DefaultValue("automationautoma_lxrP0g")
    String userBrowserstack();

    @Key("key")
    @DefaultValue("6p7oVykLsdXn3zYAyhCD")
    String keyBrowserstack();

    @Key("device")
    @DefaultValue("Google Pixel 3")
    String deviceBrowserstack();

    @Key("osVersion")
    @DefaultValue("9.0")
    String osVersionBrowserstack();
}