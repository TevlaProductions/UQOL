package qol.plugin.uQOL_Maven.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;


public class Gapples implements Listener {
    @EventHandler
    public void health(EntityRegainHealthEvent food){
        if (food.getRegainReason() == EntityRegainHealthEvent.RegainReason.MAGIC_REGEN){
            double newHealth = food.getAmount() * 0.75;
            food.setAmount(newHealth);
        }
    }
}
