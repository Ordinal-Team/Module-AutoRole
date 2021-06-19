package fr.ordinalteam.bot.autorole;

import fr.ordinalteam.bot.api.plugin.Plugin;
import fr.ordinalteam.bot.autorole.listener.GuildJoinListener;

/**
 * Create by Arinonia 18/06/2021
 */
public class Main extends Plugin {
    @Override
    public void onEnable() {
        System.out.println("Register du plugin auto role");
        this.getJDAListenerManager().registerJDAListener(new GuildJoinListener());
    }
}
