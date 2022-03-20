package MineCord.JDA;

import MineCord.Plugin.Main;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;

public class msgRecive extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if(Main.PostToMinecraft) {
            if(!(event.getAuthor().isBot() && event.getAuthor().isSystem() && event.isWebhookMessage() && event.isFromGuild() && event.isFromThread())) {
                if(event.getChannel().getIdLong()==Main.PostID) {
                    Bukkit.broadcastMessage(ChatColor.WHITE+"<"+event.getAuthor().getAsTag()+"> "+event.getMessage().getContentRaw());
                }
            }
        }
    }
}