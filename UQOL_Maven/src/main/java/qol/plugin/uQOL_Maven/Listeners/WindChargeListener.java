package qol.plugin.uQOL_Maven.Listeners;

import org.bukkit.entity.WindCharge;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.util.Vector;

public class WindChargeListener implements Listener {
    @EventHandler
    //Checks projectile launch
    public void onProjectileLaunch(ProjectileLaunchEvent event) {
        //Checks if the entity is a windcharge
        if (event.getEntity() instanceof WindCharge) {
            WindCharge charge = (WindCharge) event.getEntity();

            // Change speed of wind charge
            Vector velocity = charge.getVelocity().multiply(1.5);
            charge.setVelocity(velocity);

            // Set charge power (normally 3f, set to 4f)
            charge.setYield(4f);
        }
    }
}
