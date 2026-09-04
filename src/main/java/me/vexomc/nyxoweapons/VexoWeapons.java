package me.vexomc.nyxoweapons;

import org.bukkit.plugin.java.JavaPlugin;

public class VexoWeapons extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("VexoWeapons enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("VexoWeapons disabled!");
    }
}
