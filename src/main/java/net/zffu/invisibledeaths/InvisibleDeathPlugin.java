package net.zffu.invisibledeaths;

import org.bukkit.plugin.java.JavaPlugin;

public final class InvisibleDeathPlugin extends JavaPlugin {

    private static InvisibleDeathPlugin INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;

        saveDefaultConfig(); // Saves the config
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static InvisibleDeathPlugin getInstance() {
        return INSTANCE;
    }
}
