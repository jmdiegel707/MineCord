package MineCord.JDA;

import MineCord.Plugin.Main;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Bot {
    public static JDA bot;
    public static JDA Build() throws LoginException {
        bot = JDABuilder.createDefault(Main.BotToken).setActivity(Activity.playing("Minecraft")).build();
        bot.addEventListener(new msgRecive());

        return bot;
    }
}
