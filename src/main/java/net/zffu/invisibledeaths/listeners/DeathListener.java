package net.zffu.invisibledeaths.listeners;

import net.zffu.invisibledeaths.InvisibleDeathPlugin;
import net.zffu.invisibledeaths.utils.FormatParser;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.potion.PotionEffectType;

public class DeathListener implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {

        // If the killer is invisible
        if(event.getEntity().getKiller() != null && event.getEntity().getKiller().hasPotionEffect(PotionEffectType.INVISIBILITY)) {
            String deathMsgFormat = InvisibleDeathPlugin.getInstance().getConfig().getString("invisible-killer-message-format");

            if(!deathMsgFormat.isEmpty()) {
                event.setDeathMessage(FormatParser.parseFormatMessage(deathMsgFormat, event));
            }
        }
        else {
            String deathMsgFormat = InvisibleDeathPlugin.getInstance().getConfig().getString("visible-killer-message-format");

            if(!deathMsgFormat.isEmpty()) {
                event.setDeathMessage(FormatParser.parseFormatMessage(deathMsgFormat, event));
            }
        }
    }

}
