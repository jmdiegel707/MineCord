#### This page is for troubleshooting the config file (`config.yml`) at `{Server Folder}/plugins/MineCord/config.yml`

This will run through every object in the file in finer detail than the provided descriptions

___

Bot Stuff

- BotToken:
  - String
  - The token for your Discord Bot-Client. Will be the client that the plugin runs through.

- Channel:
  - Float
  - The ID of the channel that all messages from the plugin will be sent to.

- Role:
  - Float
  - The only role that can use all [Discord Commands](https://github.com/SleepyHead707/MineCord/blob/main/README.md) exept `/whitelist`.

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
  - Send an embed to the Designated Discord Channel (`Channel`) when a player dies of natural causes.

- PlayerKill:
  - Boolean
  - Send an embed to the Designated Discord Channel (`Channel`) when a player is killed by another player.

___

Websocket Config

- Port
  - Integer
  - The port the websocket is running on.

- Intervals
  - Integer
  - The intervals between sending non-event based data.

- Online
  - Boolean
  - Sends what players are online when the "Interval" timer goes off.

- Stats
  - Boolean
  - Sends data like hearts and armor when the "Interval" timer goes off. 

- Positions:
  - Boolean
  - Sends the coords and dementions of online players.

- BlockUpdate:
  - Boolean
  - Sends to the websocket when a block is placed, broken, or updated.

- PlayerMove:
  - Boolean
  - Sends to the websocket when a player's position is modified.

- EntityMove:
  - Boolean
  - Sends to the websocket when any entity's position is modified.

- ItemUse:
  - Boolean
  - Sends to the websocket when someone uses or atttempts to use an item.

- RecipeGain:
  - Boolean
  - Sends to the websocket when player learns a recipe.

- AcheivementGain:
  - Boolean
  - Sends to the websocket when a player gains an acheivement.

- OnPlayerDeath:
  - Boolean
  - Sends to the websocket when a player dies of natural causes.

- OnPlayerKill:
  - Boolean
  - Sends to the websocket when a player is killed by another player.

- OnEntityDeath:
  - Boolean
  - Sends to the websocket when an entity dies.
