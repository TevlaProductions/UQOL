package qol.plugin.uQOL_Maven.Listeners;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityExplodeEvent;


public class endcrystal implements Listener {
    @EventHandler
    public void entitydamage(EntityDamageEvent event) {
        if (event.getEntity().getName().equals("Souliboi7")) {
            if (event.getCause() == EntityDamageEvent.DamageCause.ENTITY_EXPLOSION) {
                event.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void onExplosion(EntityExplodeEvent event){
        Location location = event.getLocation();
        //
        if (event.getEntityType().equals(EntityType.END_CRYSTAL)) {
            //Cancel the end crystal explosion
            event.setCancelled(true);
            //Makes a new explosion in the world position (explosion normally 6, now 4.8)
            World world = event.getEntity().getWorld();
            world.createExplosion(location, 4.8f, true, true);
        }
        if (event.getEntityType().equals(EntityType.TNT_MINECART)) {
            //Cancel the end crystal explosion
            event.setCancelled(true);

            //Makes a new explosion in the world position (explosion normally 2, now 1.37)
            World world = event.getEntity().getWorld();
            world.createExplosion(location, 300f, true, true);
        }
    }
}
