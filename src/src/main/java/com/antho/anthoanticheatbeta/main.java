package com.antho.anthoanticheatbeta;

import com.antho.anthoanticheatbeta.commands.mc;
import com.antho.anthoanticheatbeta.events.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.ArrayList;

import static org.bukkit.Bukkit.getConsoleSender;
import static org.bukkit.Bukkit.getServer;

public final class main extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(ChatColor.BLUE+"AnthoAntiCheatBeta ENABLED! debug mode is off. please report problems to https://anthoweb.onthewifi.com/codingclub!");
        Bukkit.getPluginManager().registerEvents(new pc(),this);
        getCommand("aac").setExecutor(new mc());
        Bukkit.getPluginManager().registerEvents(new CommandListener(), this);
        Bukkit.getPluginManager().registerEvents(new MoveListener(), this);
        Bukkit.getPluginManager().registerEvents(new ConsoleCommandListener(), this);
        Bukkit.getPluginManager().registerEvents(new JoinListener(),this);
    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("AnthoAntiCheatBeta disabled. status: 0");
    }


}
