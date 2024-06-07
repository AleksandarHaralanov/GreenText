package me.beezle.greentext;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.ChatColor;

public class PlayerHandler implements Listener {

    @EventHandler
    public void onPlayerMessage(final PlayerChatEvent event) {
        if (event.getMessage().startsWith(">") && event.getPlayer().hasPermission("greentext.use")) {
            event.setMessage(ChatColor.GREEN + event.getMessage());
        }
    }
}