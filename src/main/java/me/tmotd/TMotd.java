package me.tmotd;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class TMotd extends JavaPlugin implements Listener{

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(this, this);
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "[TMotd] Plugin habilitado");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPing(ServerListPingEvent e){
        e.setMotd("\u00a7b\u25a0\u25a0\u25a0\u25a0\u25a0\u25a0\u25a0\u25a0\u25a0\u25a0\u25a0 \u00a76\u1d0a\u1d0f\u0262\u1d00\u0280.\u00a7e\u00a7lMCCBRASIL\u00a76.\u0274\u1d07\u1d1b \u00a7b\u25a0\u25a0\u25a0\u25a0\u25a0\u25a0\u25a0\u25a0\u25a0\u25a0\u25a0\u00a7r\n\u00a78v0.0.1\u00a7f \u25cf \u00a7a\u00a7l\u0299\u1d07\u1d1b\u1d00 \ua730\u1d07\u1d04\u029c\u1d00\u1d05\u1d0f \u25cf \u00a7b\u1d07\u0274\u1d1b\u0280\u1d07 \u1d07\u1d0d \u00a7e\u1d0d\u1d04\u1d04\u0299\u0280\u1d00s\u026a\u029f.\u0274\u1d07\u1d1b");
    }
}
