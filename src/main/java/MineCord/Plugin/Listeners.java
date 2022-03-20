package MineCord.Plugin;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.*;
import org.json.*;

import javax.imageio.ImageIO;
import javax.net.ssl.HttpsURLConnection;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;

public class Listeners implements Listener {

    private MessageChannel getChannel(GuildChannel c) {
        return (MessageChannel) c;
    }

    @EventHandler
    public void OnJoin(PlayerLoginEvent event) {
        if (Main.PlayerJoinLeave) {
            MessageEmbed Embed = new EmbedBuilder().setTitle("**" + event.getPlayer().getDisplayName() + "** joined the game").setColor(new Color(0xFBFB54)).build();
            getChannel(Main.bot.getGuildChannelById(Main.Channel)).sendMessageEmbeds(Embed).queue();
        }
//        if (Main.OnJoinLeave) {
//            JSONObject pos = new JSONObject().put("X", event.getPlayer().getLocation().getX()).put("Y", event.getPlayer().getLocation().getY()).put("Z", event.getPlayer().getLocation().getZ()).put("Dimension", event.getPlayer().getWorld().getEnvironment().name());
//            JSONObject player = new JSONObject().put("Name", event.getPlayer().getDisplayName()).put("UUID", event.getPlayer().getUniqueId());
//            String json = new JSONStringer()
//                    .object()
//                    .key("Event")
//                    .value("OnJoinLeave")
//                    .key("Log type")
//                    .value("Join")
//                    .key("Player")
//                    .value(player)
//                    .key("Position")
//                    .value(pos)
//                    .endObject()
//                    .toString();
//            Byte msg = Byte.parseByte(json);
//            try {
//                Websocket.client.write(msg);
//            } catch (IOException e) {
//                Main.server.getLogger().severe("[MineCord] Websocket failed to send, you may not have any clients connected.");
//            }
//        }
    }

    @EventHandler
    public void OnQuit(PlayerQuitEvent event) {
        if(Main.PlayerJoinLeave) {
            MessageEmbed Embed = new EmbedBuilder().setTitle("**"+event.getPlayer().getDisplayName()+"** left the game").setColor(new Color(0xFBFB54)).build();
            getChannel(Main.bot.getGuildChannelById(Main.Channel)).sendMessageEmbeds(Embed).queue();
        }
//        if(Main.OnJoinLeave) {
//            JSONObject pos = new JSONObject().put("X", event.getPlayer().getLocation().getX()).put("Y", event.getPlayer().getLocation().getY()).put("Z", event.getPlayer().getLocation().getZ()).put("Dimension", event.getPlayer().getWorld().getEnvironment().name());
//            JSONObject player = new JSONObject().put("Name", event.getPlayer().getDisplayName()).put("UUID",event.getPlayer().getUniqueId());
//            String json = new JSONStringer()
//                    .object()
//                    .key("Event")
//                    .value("OnJoinLeave")
//                    .key("Log type")
//                    .value("Leave")
//                    .key("Player")
//                    .value(player)
//                    .key("Position")
//                    .value(pos)
//                    .endObject()
//                    .toString();
//            Byte msg = Byte.parseByte(json);
//            try {
//                Websocket.client.write(msg);
//            } catch (IOException e) {
//                Main.server.getLogger().severe("[MineCord] Websocket failed to send, you may not have any clients connected.");
//            }
//        }
    }

    @EventHandler
    public void OnKick(PlayerKickEvent event) {
        if(Main.PlayerJoinLeave) {
            MessageEmbed Embed = new EmbedBuilder().setTitle("**"+event.getPlayer().getDisplayName()+"** left the game").setColor(new Color(0xFBFB54)).build();
            getChannel(Main.bot.getGuildChannelById(Main.Channel)).sendMessageEmbeds(Embed).queue();
        }
//        if(Main.OnJoinLeave) {
//            JSONObject pos = new JSONObject().put("X", event.getPlayer().getLocation().getX()).put("Y", event.getPlayer().getLocation().getY()).put("Z", event.getPlayer().getLocation().getZ()).put("Dimension", event.getPlayer().getWorld().getEnvironment().name());
//            JSONObject player = new JSONObject().put("Name", event.getPlayer().getDisplayName()).put("UUID",event.getPlayer().getUniqueId());
//            String json = new JSONStringer()
//                    .object()
//                    .key("Event")
//                    .value("OnJoinLeave")
//                    .key("Log type")
//                    .value("Kick")
//                    .key("Player")
//                    .value(player)
//                    .key("Position")
//                    .value(pos)
//                    .endObject()
//                    .toString();
//            Byte msg = Byte.parseByte(json);
//            try {
//                Websocket.client.write(msg);
//            } catch (IOException e) {
//                Main.server.getLogger().severe("[MineCord] Websocket failed to send, you may not have any clients connected.");
//            }
//        }
    }

    @EventHandler
    public void EntityDeath(EntityDeathEvent event) {
        if(Main.EntityDeath) {
            if(!(event.getEntity() instanceof Player)) {
                String name;
                if(event.getEntity().getCustomName() != null) {
                    name = new String(" named ").join(event.getEntity().getCustomName());
                } else { name = " without a name"; }
                String killer = "";
                if(!(event.getEntity().getKiller() == null)) {
                    killer = new String("\nKiller: ").join(event.getEntity().getKiller().getDisplayName());
                }
                MessageEmbed Embed = new EmbedBuilder().setTitle("A "+event.getEntity().getType().getKey().getKey()+name+" died").setDescription("UUID: "+event.getEntity().getUniqueId()+killer).setColor(new Color(0xB21C1C)).build();
                getChannel(Main.bot.getGuildChannelById(Main.Channel)).sendMessageEmbeds(Embed).queue();
            }
        }
//        if(Main.OnEntityDeath) {
//            JSONObject pos = new JSONObject().put("X", event.getEntity().getLocation().getX()).put("Y", event.getEntity().getLocation().getY()).put("Z", event.getEntity().getLocation().getZ()).put("Dimension", event.getEntity().getWorld().getEnvironment().name());
//            JSONObject entity = new JSONObject().put("UUID",event.getEntity().getUniqueId()).put("Entity Type", event.getEntity().getType().toString());
//            String json = new JSONStringer()
//                    .object()
//                    .key("Event")
//                    .value("EntityDeath")
//                    .key("Entity")
//                    .value(entity)
//                    .key("Position")
//                    .value(pos)
//                    .endObject()
//                    .toString();
//            Byte msg = Byte.parseByte(json);
//            try {
//                Websocket.client.write(msg);
//            } catch (IOException e) {
//                Main.server.getLogger().severe("[MineCord] Websocket failed to send, you may not have any clients connected.");
//            }
//        }
    }

    @EventHandler
    public void PlayerDeath(PlayerDeathEvent event) {
        if(Main.PlayerDeath) {
            String killer = "";
            if(!(event.getEntity().getKiller() == null)) {
                killer = new String("\nKiller: ").join(event.getEntity().getKiller().getDisplayName());
            }
            MessageEmbed Embed = new EmbedBuilder().setTitle("**"+event.getEntity().getDisplayName()+"** died").setDescription("UUID: "+event.getEntity().getUniqueId()+killer+"\nDeath Message: "+event.getDeathMessage()).setColor(new Color(0xB21C1C)).build();
            getChannel(Main.bot.getGuildChannelById(Main.Channel)).sendMessageEmbeds(Embed).queue();
        }
//        if(Main.OnJoinLeave) {
//            JSONObject pos = new JSONObject().put("X", event.getEntity().getLocation().getX()).put("Y", event.getEntity().getLocation().getY()).put("Z", event.getEntity().getLocation().getZ()).put("Dimension", event.getEntity().getWorld().getEnvironment().name());
//            JSONObject entity = new JSONObject().put("Name", event.getEntity().getDisplayName()).put("UUID",event.getEntity().getUniqueId());
//            JSONObject killer = new JSONObject().put("Name", event.getEntity().getKiller().getDisplayName()).put("UUID", event.getEntity().getKiller().getUniqueId().toString());
//            String json = new JSONStringer()
//                    .object()
//                    .key("Event")
//                    .value("PlayerKill")
//                    .key("Player")
//                    .value(entity)
//                    .key("Killer")
//                    .value(killer)
//                    .key("Death Message")
//                    .value(event.getDeathMessage())
//                    .key("Position")
//                    .value(pos)
//                    .endObject()
//                    .toString();
//            Byte msg = Byte.parseByte(json);
//            try {
//                Websocket.client.write(msg);
//            } catch (IOException e) {
//                Main.server.getLogger().severe("[MineCord] Websocket failed to send, you may not have any clients connected.");
//            }
//        }
    }

    @EventHandler
    public void OnMsgSend(AsyncPlayerChatEvent event) throws IOException {
        if(Main.PostToDiscord) {
            TextChannel channel = (TextChannel) getChannel(Main.bot.getGuildChannelById(Main.PostID));
            channel.sendMessage(event.getPlayer().getDisplayName()+" said:\n"+event.getMessage()).queue();
        }
    }

    @EventHandler
    public void OnCmdSend(PlayerCommandPreprocessEvent event) {
        if(Main.OnCommand) {
            MessageEmbed Embed = new EmbedBuilder().setTitle("**" + event.getPlayer().getDisplayName() + "** tried command:").setDescription(event.getMessage()).setColor(new Color(0xFFFFFF)).build();
            getChannel(Main.bot.getGuildChannelById(Main.Channel)).sendMessageEmbeds(Embed).queue();
        }
//        if(Main.OnJoinLeave) {
//            JSONObject player = new JSONObject().put("Name", event.getPlayer().getDisplayName()).put("UUID",event.getPlayer().getUniqueId());
//            String json = new JSONStringer()
//                    .object()
//                    .key("Event")
//                    .value("OnCommandRun")
//                    .key("Player")
//                    .value(player)
//                    .key("Command")
//                    .value(event.getMessage())
//                    .key("Not Successful")
//                    .value(event.isCancelled())
//                    .endObject()
//                    .toString();
//            Byte msg = Byte.parseByte(json);
//            try {
//                Websocket.client.write(msg);
//            } catch (IOException e) {
//                Main.server.getLogger().severe("[MineCord] Websocket failed to send, you may not have any clients connected.");
//            }
//        }
    }

    @EventHandler
    public void OnAdvance(PlayerAdvancementDoneEvent event) {
        if(Main.DefaultAchieveOnly) {
            if(event.getAdvancement().getKey().getNamespace().equals("minecraft")) {
                if(!(event.getAdvancement().getKey().getKey().contains("recipe"))) {
                    if (Main.AcheivementGain) {
                        MessageEmbed Embed = new EmbedBuilder().setTitle("**" + event.getPlayer().getDisplayName() + "** finished the Advancement: " + event.getAdvancement().getKey().getKey()).setColor(new Color(0x54FB54)).build();
                        getChannel(Main.bot.getGuildChannelById(Main.Channel)).sendMessageEmbeds(Embed).queue();
                    }
                }
//                if(Main.OnJoinLeave) {
//                   JSONObject player = new JSONObject().put("Name", event.getPlayer().getDisplayName()).put("UUID",event.getPlayer().getUniqueId());
//                   String json = new JSONStringer()
//                           .object()
//                           .key("Event")
//                           .value("AchievementGain")
//                           .key("Player")
//                           .value(player)
//                           .key("Achievement")
//                           .value(event.getAdvancement().toString())
//                           .endObject()
//                           .toString();
//                   Byte msg = Byte.parseByte(json);
//                   try {
//                       Websocket.client.write(msg);
//                   } catch (IOException e) {
//                       Main.server.getLogger().severe("[MineCord] Websocket failed to send, you may not have any clients connected.");
//                   }
//                }
            }
        } else if(!(event.getAdvancement().getKey().getKey().contains("recipe"))) {
            if(Main.AcheivementGain) {
                MessageEmbed Embed = new EmbedBuilder().setTitle("**"+event.getPlayer().getDisplayName()+"** finished the Advancement: "+event.getAdvancement().getKey().getKey()).setColor(new Color(0x54FB54)).build();
                getChannel(Main.bot.getGuildChannelById(Main.Channel)).sendMessageEmbeds(Embed).queue();
            }
//                if(Main.OnJoinLeave) {
//                   JSONObject player = new JSONObject().put("Name", event.getPlayer().getDisplayName()).put("UUID",event.getPlayer().getUniqueId());
//                   String json = new JSONStringer()
//                           .object()
//                           .key("Event")
//                           .value("AchievementGain")
//                           .key("Player")
//                           .value(player)
//                           .key("Achievement")
//                           .value(event.getAdvancement().toString())
//                           .endObject()
//                           .toString();
//                   Byte msg = Byte.parseByte(json);
//                   try {
//                       Websocket.client.write(msg);
//                   } catch (IOException e) {
//                       Main.server.getLogger().severe("[MineCord] Websocket failed to send, you may not have any clients connected.");
//                   }
//                }
        }
    }


    @EventHandler
    public void OnRecipe(PlayerRecipeDiscoverEvent event) {
        if(Main.RecipeGain) {
            MessageEmbed Embed = new EmbedBuilder().setTitle("**"+event.getPlayer().getDisplayName()+"** learned the Recipe: "+event.getRecipe().getKey()).setColor(new Color(0x54FB54)).build();
            getChannel(Main.bot.getGuildChannelById(Main.Channel)).sendMessageEmbeds(Embed).queue();
        }
//        if(Main.OnJoinLeave) {
//            JSONObject player = new JSONObject().put("Name", event.getPlayer().getDisplayName()).put("UUID",event.getPlayer().getUniqueId());
//            String json = new JSONStringer()
//                    .object()
//                    .key("Event")
//                    .value("RecipeGain")
//                    .key("Player")
//                    .value(player)
//                    .key("Recipe")
//                    .value(event.getRecipe().getKey())
//                    .endObject()
//                    .toString();
//            Byte msg = Byte.parseByte(json);
//            try {
//                Websocket.client.write(msg);
//            } catch (IOException e) {
//                Main.server.getLogger().severe("[MineCord] Websocket failed to send, you may not have any clients connected.");
//            }
//        }
    }

    @EventHandler
    public void PlayerMove(PlayerMoveEvent event) {
//        if(Main.OnJoinLeave) {
//            JSONObject pos = new JSONObject().put("X", event.getPlayer().getLocation().getX()).put("Y", event.getPlayer().getLocation().getY()).put("Z", event.getPlayer().getLocation().getZ()).put("Dimension", event.getPlayer().getWorld().getEnvironment().name());
//            JSONObject player = new JSONObject().put("Name", event.getPlayer().getDisplayName()).put("UUID", event.getPlayer().getUniqueId());
//            String json = new JSONStringer()
//                    .object()
//                    .key("Event")
//                    .value("PlayerMove")
//                    .key("Player")
//                    .value(player)
//                    .key("Position")
//                    .value(pos)
//                    .endObject()
//                    .toString();
//            Byte msg = Byte.parseByte(json);
//            try {
//                Websocket.client.write(msg);
//            } catch (IOException e) {
//                Main.server.getLogger().severe("[MineCord] Websocket failed to send, you may not have any clients connected.");
//            }
//        }
    }
}