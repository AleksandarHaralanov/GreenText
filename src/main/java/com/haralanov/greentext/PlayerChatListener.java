package com.haralanov.greentext;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.ChatColor;

public class PlayerChatListener implements Listener {

    @EventHandler
    public void onPlayerMessage(final PlayerChatEvent event) {
        if (event.getMessage().startsWith(">")) {
            if (event.getPlayer().hasPermission("greentext.write") || event.getPlayer().isOp())
                event.setMessage(ChatColor.translateAlternateColorCodes('&',
                        String.format("&a%s", event.getMessage())));
        }
    }
}