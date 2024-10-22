package com.dippycoder.welcomeMSG.events;

import com.dippycoder.welcomeMSG.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class WelcomeEvent implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        if(Main.config.getBoolean("player-join.enabled") == true) {
            event.setJoinMessage(Main.config.getString("prefix") + Main.config.getString("player-join.text-start") + event.getPlayer().getName() + Main.config.getString("player-join.text-end"));
        }
        else {
            event.setJoinMessage("");
        }
        if(Main.config.getBoolean("player-msg.enabled") == true) {
            event.getPlayer().sendMessage(Main.config.getString("prefix") + Main.config.getString("player-msg.text-start") + event.getPlayer().getName() + Main.config.getString("player-msg.text-end"));
        }
    }
}
