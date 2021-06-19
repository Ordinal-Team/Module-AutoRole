package fr.ordinalteam.bot.autorole.listener;

import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

/**
 * Create by Arinonia 18/06/2021
 */
public class GuildJoinListener extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(@NotNull GuildMemberJoinEvent event) {
        Role memberRole = event.getGuild().getRoleById(654047191395991561L);
        if (memberRole != null) {
            event.getGuild().addRoleToMember(event.getMember().getId(), memberRole).queue();
        } else {
            System.err.println("role is null");
        }
    }
}
