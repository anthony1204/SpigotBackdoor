package com.antho.anthoanticheatbeta.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class mc implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        commandSender.sendMessage("Running §6AnthoAntiCheat§r-§abeta§r-2.5.5.");
        return true;
    }
}
