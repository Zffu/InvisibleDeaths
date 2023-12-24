package net.zffu.invisibledeaths.utils;

import org.bukkit.event.entity.PlayerDeathEvent;

public class FormatParser {

    /**
     * Parses the raw messages with placeholder into a real string
     * @param msg the raw message
     * @param event the provided event to get the required data
     * @return the parsed message
     */
    public static String parseFormatMessage(String msg, PlayerDeathEvent event) {
        msg = msg.replaceAll("%player%", event.getEntity().getName());
        if(event.getEntity().getKiller() != null) msg = msg.replaceAll("%killer%", event.getEntity().getKiller().getName());
        return msg;
    }

}
