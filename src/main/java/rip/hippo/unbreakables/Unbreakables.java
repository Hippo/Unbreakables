package rip.hippo.unbreakables;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Hippo
 */
public final class Unbreakables extends JavaPlugin implements Listener {

  @Override
  public void onEnable() {
    Bukkit.getPluginManager().registerEvents(this, this);
  }

  @EventHandler
  public void onItemDamage(PlayerItemDamageEvent playerItemDamageEvent) {
    playerItemDamageEvent.setCancelled(true);
    ItemStack itemStack = playerItemDamageEvent.getItem();
    ItemMeta itemMeta = itemStack.getItemMeta();
    itemMeta.spigot().setUnbreakable(true);
    itemStack.setItemMeta(itemMeta);
  }
}
