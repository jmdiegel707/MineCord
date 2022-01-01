###  Websocket JSON Reference

Reference for json messages the websocket server sends on different events.

Setup different options to configure the websocket in the [Config File (`config.yml`)](https://github.com/SleepyHead707/MineCord/blob/main/ConfigHelp.md#websocket-config).

___

#### Event Data

See the [Config File (`config.yml`)](https://github.com/SleepyHead707/MineCord/blob/main/ConfigHelp.md#websocket-config) for details about each event. These datasets are *event based* and will be sent when the event occurs.

**Players Leave or Join**  
Socket Type: `OnJoinLeave`
- Ex: `{"Event": "OnJoinLeave", "Log type": "<Join/Leave>", "Player":{"Name":"<Player Name>","UUID":"<Player UUID>"}}`

**Block Changes**  
Socket Type: `BlockUpdate`
- Ex: `{"Event": "BlockUpdate", "Block": "<Block Name>", "Update":"<Place/Break/Upadate>"}`

**Player Position Update**  
Socket Type: `PlayerMove`
- Ex: `{"Event": "PlayerMove", "Player":"<Player Name>","Position":{ "X":<X Coord>, "Y":<Y Coord> "Z":<Z Coord>}, "Dimension": <Dimension Name>}`

**Entity Position Update**  
Socket Type: `EntityMove`
- Ex: `{"Event": "PlayerMove", "Entity":{"UUID": "<Entity UUID>", "Entity Type": "<Entity Type>"},"Position":{ "X":<X Coord>, "Y":<Y Coord> "Z":<Z Coord>}, "Dimension": <Dimension Name>}`

**Player Learns Recipe**  
Socket Type: `RecipeGain`
- Ex: `{"Event": "RecipeGain", "Player": "<Player Name>", "Recipe": "<namespace>:<item>"}`

**Player Gains an Achievement**  
Socket Type: `AchievementGain`
- Ex: `{"Event": "AchievementGain", "Player": "<Player Name>", "Achievement": "<path>/<achievement>"}`

**Player Dies**  
Socket Type: `PlayerDeath`
- Ex: `{"Event": "PlayerKill", "Player": "<Player Name>", "Killer": {"UUID": "<Entity UUID>", "Entity Type": "<Entity Type>", IF KILLER IS PLAYER "Player": "<Player Name>"}, "Death Message": "<Death Message>"}`

**Entity Dies**  
Socket Type: `EntityDeath`
- Ex: `{"Event": "EntityDeath", "Entity":{"UUID": "<Entity UUID>", "Entity Type": "<Entity Type>"}, "Death Message": "<Death Message>"}`

**Player Attempts Running Command**  
Socket Type: `OnCommandRun`
- Ex: `{"Event": "OnCommandRun", "Player": "<Player Name>", "Command": "<Command>"}`
