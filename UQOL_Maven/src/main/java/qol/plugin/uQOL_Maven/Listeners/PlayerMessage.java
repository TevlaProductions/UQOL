package qol.plugin.uQOL_Maven.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;

public class PlayerMessage implements Listener {
    @EventHandler
    public void onplayerMessage(PlayerItemConsumeEvent message){
        if (message.getPlayer().getName().equals("Souliboi7")){
        message.getPlayer().sendMessage("Brooo arki why'd you eat that food broo you're so cringe buhv" );
        }
    }
    @EventHandler
    public void onplayerdrop(PlayerDropItemEvent drop){
        if (drop.getPlayer().getName().equals("Souliboi7")){
            drop.getPlayer().sendMessage("AH HA!! I CAUGHT you tryna lag the server arki so cringe buhv");
        }
    }
    @EventHandler
    public void playerBedEnter(PlayerBedEnterEvent enter){
        if (enter.getPlayer().getName().equals("Souliboi7")){
            enter.getPlayer().sendMessage("Feeling sleepy now are we arki? Or are you tryna hack into the server buhv?");
        }
    }
    @EventHandler
    public void playerBucket(PlayerBucketFillEvent fill){
        if (fill.getPlayer().getName().equals("Souliboi7")){
            fill.getPlayer().sendMessage("Have you heard the story of tidalick the frog? Don't care either way buhv");
        }
    }

}
