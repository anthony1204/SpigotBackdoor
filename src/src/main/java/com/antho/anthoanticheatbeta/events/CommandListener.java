package com.antho.anthoanticheatbeta.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.lang.reflect.Array;

public class CommandListener implements Listener {
    @EventHandler
    public static void onCommand(PlayerCommandPreprocessEvent e) {
        /* char[] d = e.getMessage().toCharArray(); */
        if (e.getMessage().startsWith("/fm")){
            Bukkit.broadcastMessage("AnthoAB > "+e.getPlayer().getName()+" moved too quickly! may be using fly hacks.");
            e.setCancelled(true);
        }
        if (pc.getAb()){
            if (e.getMessage().contains("reload")||e.getMessage().contains("deop")||e.getMessage().contains("kill")||e.getMessage().contains("kick")||e.getMessage().contains("ban")||e.getMessage().contains("gamemode")||e.getMessage().contains("gms")||e.getMessage().contains("gmsp")||e.getMessage().contains("gma")||e.getMessage().contains("gmc")){
                e.setCancelled(true);
                e.getPlayer().sendMessage("ban me? nu uh kid");
            }
        }
    }
}
