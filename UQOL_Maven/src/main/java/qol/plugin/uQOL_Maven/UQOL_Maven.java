package qol.plugin.uQOL_Maven;


import org.bukkit.plugin.java.JavaPlugin;
import qol.plugin.uQOL_Maven.Listeners.*;
public final class UQOL_Maven extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        //Says Hi to hudson
        System.out.println("Ultimate Quality of Life Plugin Started. Hello Hudson...");
        getServer().getPluginManager().registerEvents(new endcrystal(), this);
        getServer().getPluginManager().registerEvents(new WindChargeListener(), this);
        getServer().getPluginManager().registerEvents(new Strength(), this);
        getServer().getPluginManager().registerEvents(new Gapples(), this);
        getServer().getPluginManager().registerEvents(new ItemStackLimiter(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        //Says bye to hudson.
        System.out.println("Goodbye, hudson...");
    }
}