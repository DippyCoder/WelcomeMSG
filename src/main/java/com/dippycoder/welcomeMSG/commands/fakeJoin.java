package com.dippycoder.welcomeMSG.commands;

import com.dippycoder.welcomeMSG.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class fakeJoin implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(Main.config.getBoolean("fake-join.enabled") == true) {
            if (sender.hasPermission(Main.config.getString("fake-join.permission"))) {

                if (sender instanceof Player) {
                    Player p = (Player) sender;

                    if (args.length == 1) {
                        String fname = args[0];
                        Bukkit.broadcastMessage(Main.config.getString("prefix") + Main.config.getString("player-join.text-start") + fname + Main.config.getString("player-join.text-end"));
                    } else {
                        p.sendMessage(Main.config.getString("prefix") + "§cUsage: /fakejoin <name>");
                    }
                }
            } else {
                Player p = (Player) sender;
                p.sendMessage(Main.config.getString("prefix") + Main.config.getString("no-permission"));
            }
        } else {
            Player p = (Player) sender;
            p.sendMessage(Main.config.getString("prefix") + Main.config.getString("disabled-command"));
        }
        return true;
    }
}
