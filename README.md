## MineCord for Spigot

MineCord is a plugin that integrates data directly from your Minecraft server to a [specified channel](https://github.com/SleepyHead707/MineCord/blob/main/ConfigHelp.md#channel) in your Discord server.  
It also has more advanced functionality for use with [WebSockets](https://www.wallarm.com/what/a-simple-explanation-of-what-a-websocket-is), [confugurable in `config.yml` of the plugin's folder](https://github.com/SleepyHead707/MineCord/blob/main/ConfigHelp.md#channel).

___

### Discord Commands:
MineCord uses Discord's "Bot" feature to send stuff to your Discord Server. If you don't know how to set up a Bot, you can use [**This tutorial**](https://www.youtube.com/watch?v=nW8c7vT6Hl4) to set up a Bot. Don't create any commands, just set up the token. [Drop the token in `config.yml`](https://github.com/SleepyHead707/MineCord/blob/main/ConfigHelp.md#channel).  
All commands are integrated slash commands.

- Announce
  - `/announce [Message] [Use json]`
  - Tells raw text to all online players. `Use json` is a true/false statement to say if `Message` [is raw json text format](https://minecraft.fandom.com/wiki/Raw_JSON_text_format)

- Whitelist
  - `/whitelist [Minecraft Username}`
  - Will add the MC User to the MC Server's Whitelist. This command will always be functional, though you can turn off the whitelist in `server.properties`.

- RunCMD
  - `/runcmd [Minecraft Command]`
  - Will run a command from the MC Server's console.

- Get
  - `/get [Player]`
  - Prints an embed to the [Specified Channel](https://github.com/SleepyHead707/MineCord/blob/main/ConfigHelp.md#channel) with details of the chosen player, if that player is online.

___

### Minecraft Commands:
MineCord also has some Minecraft commands.

- Announce
  - `/announce "[Messsage]"`
  - Sends a basic embed to the [Specified Discord Channel](https://github.com/SleepyHead707/MineCord/blob/main/ConfigHelp.md#channel).

- Get
  - `/get [Player]`
  - Get same as the Discord `get` commands, but sends details of desired player to the user who ran it in-game.

___

##### For help with `config.yml`,
head to [the Config Help Page](https://github.com/SleepyHead707/MineCord/blob/main/ConfigHelp.md).

##### The reference for websocket data
[Go here](https://github.com/SleepyHead707/MineCord/blob/main/Websocket.md)
