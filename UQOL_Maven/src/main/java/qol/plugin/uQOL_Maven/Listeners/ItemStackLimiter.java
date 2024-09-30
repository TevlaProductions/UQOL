package qol.plugin.uQOL_Maven.Listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;




public class ItemStackLimiter implements Listener {
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        // Get the item being clicked
        ItemStack item = event.getCurrentItem();
        if (item != null) {
            // Check and limit stack size for End Crystals
            if (item.getType() == Material.END_CRYSTAL && item.getAmount() > 8) {
                limitStackSize(item, 8, event.getWhoClicked().getInventory());
            }
            // Check and limit stack size for Golden Apples
            else if (item.getType() == Material.GOLDEN_APPLE && item.getAmount() > 32) {
                limitStackSize(item, 32, event.getWhoClicked().getInventory());
            }
            // Check and limit stack size for wind Charges
            else if (item.getType() == Material.WIND_CHARGE && item.getAmount() > 16) {
                limitStackSize(item, 16, event.getWhoClicked().getInventory());
            }
        }
    }

    @EventHandler
    public void onPlayerPickupItem(EntityPickupItemEvent event) {
        // Get the item being picked up
        ItemStack item = event.getItem().getItemStack();
        if(event.getEntity() instanceof Player) {
            if (item.getType() == Material.END_CRYSTAL && item.getAmount() > 8) {
                limitStackSize(item, 8, ((Player) event.getEntity()).getPlayer().getInventory());
            } else if (item.getType() == Material.GOLDEN_APPLE && item.getAmount() > 32) {
                limitStackSize(item, 32, ((Player) event.getEntity()).getPlayer().getInventory());
            } else if (item.getType() == Material.WIND_CHARGE && item.getAmount() > 16) {
                limitStackSize(item, 16, ((Player) event.getEntity()).getPlayer().getInventory());
            }
        }
    }


    private void limitStackSize(ItemStack item, int maxSize, Inventory inventory) {
        int excess = item.getAmount() - maxSize;
        item.setAmount(maxSize);
        ItemStack excessStack = new ItemStack(item.getType(), excess);
        inventory.addItem(excessStack);
    }
}
