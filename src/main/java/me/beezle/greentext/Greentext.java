package me.beezle.greentext;

import org.bukkit.plugin.java.JavaPlugin;

public class Greentext extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerHandler(), this);
        System.out.print("[Greentext v1.0.0] Enabled.");
    }

    @Override
    public void onDisable() {
        System.out.print("[Greentext v1.0.0] Disabled.");
    }
}