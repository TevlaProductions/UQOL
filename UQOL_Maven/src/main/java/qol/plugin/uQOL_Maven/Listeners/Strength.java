package qol.plugin.uQOL_Maven.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Strength implements Listener{
    
    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        Entity damager = event.getDamager();
        if (damager instanceof Player) {
            Player player = (Player) damager;
            double damage = event.getDamage();
            for (PotionEffect effect : player.getActivePotionEffects()) {
                if (effect.getType().equals(PotionEffectType.STRENGTH)) {
                    int amplifier = effect.getAmplifier();
                    if (amplifier == 0) { // Strength I
                        event.setDamage(damage * 0.7);
                    } else if (amplifier == 1) { // Strength II
                        event.setDamage(damage * 0.7);
                    }
                }
            }
        }
    }
}
