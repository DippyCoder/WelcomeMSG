package com.dippycoder.welcomeMSG;

import com.dippycoder.welcomeMSG.commands.WMSG;
import com.dippycoder.welcomeMSG.commands.fakeJoin;
import com.dippycoder.welcomeMSG.commands.fakeQuit;
import com.dippycoder.welcomeMSG.events.LeaveEvent;
import com.dippycoder.welcomeMSG.events.WelcomeEvent;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public static FileConfiguration config;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        config = getConfig();
        getServer().getPluginManager().registerEvents(new WelcomeEvent(), this);
        getServer().getPluginManager().registerEvents(new LeaveEvent(), this);
        getCommand("fakejoin").setExecutor(new fakeJoin());
        getCommand("fakequit").setExecutor(new fakeQuit());
        getCommand("wmsg").setExecutor(new WMSG());
        getLogger().info("[WelcomeMSG] --------WelcomeMSG--------");
        getLogger().info("[WelcomeMSG]");
        getLogger().info("[WelcomeMSG] Loaded WelcomeMSG");
        getLogger().info("[WelcomeMSG] Version: 1.0.0");
        getLogger().info("[WelcomeMSG] Plugin by DippyCoder");
        getLogger().info("[WelcomeMSG]");
        getLogger().info("[WelcomeMSG] --------WelcomeMSG--------");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
