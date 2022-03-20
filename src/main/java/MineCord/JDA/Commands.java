package MineCord.JDA;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.interactions.commands.Command;
import net.dv8tion.jda.api.utils.data.DataObject;
import net.dv8tion.jda.internal.JDAImpl;
import net.dv8tion.jda.internal.interactions.CommandInteractionImpl;
import org.jetbrains.annotations.NotNull;

public class Commands extends Command {

    public Commands(JDAImpl api, Guild guild, DataObject json) {
        super(api, guild, json);
    }
}
