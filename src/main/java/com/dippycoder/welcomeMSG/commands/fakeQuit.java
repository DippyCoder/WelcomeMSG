package com.dippycoder.welcomeMSG.commands;

import com.dippycoder.welcomeMSG.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class fakeQuit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender.hasPermission(Main.config.getString("fake-quit.permission"))) {

            if (sender instanceof Player) {
                Player p = (Player) sender;

                if (args.length == 1) {
                    String fname = args[0];
                    Bukkit.broadcastMessage(Main.config.getString("player-quit.text-start") + fname + Main.config.getString("player-quit.text-end"));
                } else {
                    p.sendMessage(Main.config.getString("prefix") + "§cUsage: /fakequit <name>");
                }
            }
        } else {
            Player p = (Player) sender;
            p.sendMessage(Main.config.getString("prefix") + Main.config.getString("no-permission"));
        }
        return true;
    }
}
