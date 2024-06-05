package me.beezle.greentext;

import org.bukkit.plugin.java.JavaPlugin;

public class Greentext extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerHandler(), this);
        System.out.print("[Greentext] Enabled.");
    }

    @Override
    public void onDisable() {
        System.out.print("[Greentext] Disabled.");
    }
}