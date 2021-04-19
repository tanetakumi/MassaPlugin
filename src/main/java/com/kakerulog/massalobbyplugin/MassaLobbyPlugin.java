package com.kakerulog.massalobbyplugin;

import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class MassaLobbyPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this,this);
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Location loc = new Location(e.getPlayer().getWorld(),0.5,45,-0.5,0,0);
        e.getPlayer().teleport(loc);
    }
}
