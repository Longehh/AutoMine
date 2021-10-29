package dev.longeh.automine.config;

public class Config {
    private boolean autoMineEnabled;

    public Config() {
        autoMineEnabled = false;
    }

    public boolean isAutoMineEnabled() {
        return autoMineEnabled;
    }

    public void setAutoMineEnabled(boolean autoMineEnabled) {
        this.autoMineEnabled = autoMineEnabled;
    }

    private static Config instance;

    public static Config getInstance() {
        if(instance == null) {
            instance = new Config();
        }
        return instance;
    }
}
