package com.antho.anthoanticheatbeta.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {
    @EventHandler
    public void PlayerJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        for (int i = 0; i < pc.v.size(); i++){
            p.hidePlayer(pc.v.get(i));
        }
    }


}
