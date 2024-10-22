package com.dippycoder.welcomeMSG.commands;

import com.dippycoder.welcomeMSG.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class WMSG implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender.hasPermission(Main.config.getString("wmsg.permission")))
        {
            sender.sendMessage(Main.config.getString("prefix") + "--------WelcomeMSG--------");
            sender.sendMessage(Main.config.getString("prefix"));
            sender.sendMessage(Main.config.getString("prefix") + "Version: 1.0.0");
            sender.sendMessage(Main.config.getString("prefix") + "Plugin by DippyCoder");
            sender.sendMessage(Main.config.getString("prefix"));
            sender.sendMessage(Main.config.getString("prefix") + "--------WelcomeMSG--------");
        }
        return true;
    }
}
