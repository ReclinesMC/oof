package me.reclines.oof;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {
    public static Main instance;

    @Override
    public void onEnable() {
        instance = this;
        this.getLogger().info("OOF plugin loaded!");
        Objects.requireNonNull(this.getCommand("oof")).setExecutor(new oofCommand());
        Bukkit.getServer().getPluginManager().registerEvents(new oofCommand(), this);
    }

    @Override
    public void onDisable() {
        this.getLogger().info("OOF died.");
    }

}
// testing the commit function
//testtttttttttttttttttttt
//1234455555555555555555
// haha black