package qol.plugin.uQOL_Maven.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerJoinEvent implements Listener {
    @EventHandler
    public void onplayerjoin(org.bukkit.event.player.PlayerJoinEvent player){
        if(player.getPlayer().getName().equals("Souliboi7")){
            player.setJoinMessage("Arki just joined... unfortunate....");
            player.getPlayer().setPortalCooldown(3);
            player.getPlayer().setPlayerListName("Arkier 2000");
        }
    }
}
