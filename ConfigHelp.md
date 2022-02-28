### This page is for troubleshooting the config file (`config.yml`) at `{Server Folder}/plugins/MineCord/config.yml`

This will run through every object in the file in finer detail than the provided descriptions

___

Bot Stuff

*The bot should have the following permissions to work properly*
- View Channels (For the channels correlating to `Channel` and `PostID`)
- Send Messages
- Embed
- Manage Webhooks
- Read Message History (For the channels correlating to `PostID`)
<br>
Bot Config
- BotToken:
  - String
  - The token for your Discord Bot-Client. Will be the client that the plugin runs through.

- ##### Channel:
  - Float
  - The ID of the channel that event messages from the plugin will be sent to. Not to be confused with `PsotID`.

- Role:
  - Float
  - The only role that can use all [Discord Commands](https://github.com/SleepyHead707/MineCord/blob/main/README.md) exept `/whitelist`.

- PostID: 
  - Float
  - The ID of the channel that `PostToDiscord` and `PostToMinecraft` use. Not to be confused with `Channel`. **Must be a basic guild text channel**

- PostToDiscord: 
  - Boolean
  - Any messages that are sent in the Minecraft server's chat will be sent to the channel selected in `PostID`.

- PostToMinecraft: 
  - Boolean
  - Any messages that are sent in the selected channel (`PostID`) will be printed in the Minecraft server's chat.

- DefaultAchieveOnly
  - Boolean
  - Only use the advancements from the Minecraft namespace.

___

Discord Message Returns

- PlayerJoinLeave:
  - Boolean
  - Send an embed to the Designated Discord Channel (`Channel`) when someone Joins or Quits.

- PlayerAchieve:
  - Boolean
  - Send an embed to the Designated Discord Channel (`Channel`) when a player gains an achievement.

- PlayerRecipe:
  - Boolean
  - Send an embed to the Designated Discord Channel (`Channel`) when a player learns a new recipe.

- PlayerDeath:
  - Boolean
  - Send an embed to the Designated Discord Channel (`Channel`) when a player dies.

- PlayerDeath:
  - Boolean
  - Send an embed to the Designated Discord Channel (`Channel`) when an entity dies.

- OnCommand:
  - Boolean
  - Send an embed to the Designated Discord Channel (`Channel`) when anyone attempts a command.

___

#### Websocket Config

- Port
  - Integer
  - The port the websocket is running on.

- OnJoinLeave
  - Boolean
  - Sends to the websocket when a player joins or leaves.

- PlayerMove:
  - Boolean
  - Sends to the websocket when a player's position is modified.

- RecipeGain:
  - Boolean
  - Sends to the websocket when player learns a recipe.

- AcheivementGain:
  - Boolean
  - Sends to the websocket when a player gains an acheivement.

- OnPlayerDeath:
  - Boolean
  - Sends to the websocket when a player dies.

- OnEntityDeath:
  - Boolean
  - Sends to the websocket when an entity dies.

- OnCommandRun:
  - Boolean
  - Send to the websocket when anyone attempts a command.
