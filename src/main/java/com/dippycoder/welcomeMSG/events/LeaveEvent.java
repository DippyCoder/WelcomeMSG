package com.dippycoder.welcomeMSG.events;

import com.dippycoder.welcomeMSG.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeaveEvent implements Listener {
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        if(Main.config.getBoolean("player-quit.enabled") == true) {
            event.setQuitMessage(Main.config.getString("player-quit.text-start") + event.getPlayer().getName() + Main.config.getString("player-quit.text-end"));
        }
        else {
            event.setQuitMessage("");
        }
    }
}
