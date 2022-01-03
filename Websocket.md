###  Websocket JSON Reference

Reference for json messages the websocket server sends on different events.

Setup different options to configure the websocket in the [Config File (`config.yml`)](https://github.com/SleepyHead707/MineCord/blob/main/ConfigHelp.md#websocket-config).

___

#### Event Data

See the [Config File (`config.yml`)](https://github.com/SleepyHead707/MineCord/blob/main/ConfigHelp.md#websocket-config) for details about each event. These datasets are *event based* and will be sent when the event occurs.

**Players Leave or Join**  
Socket Type: `OnJoinLeave`
- Ex: `{"Event": "OnJoinLeave", "Log type": "<Join/Leave>", "Player":{"Name":"<Player Name>","UUID":"<Player UUID>"}, "Position":{ "X":<X Coord>, "Y":<Y Coord> "Z":<Z Coord>, "Dimension": <Dimension Name>}}`

**Player Position Update**  
Socket Type: `PlayerMove`
- Ex: `{"Event": "PlayerMove", "Player":{"Name":"<Player Name>","UUID":"<Player UUID>"}, "Position":{ "X":<X Coord>, "Y":<Y Coord> "Z":<Z Coord>, "Dimension": <Dimension Name>}}`

**Player Learns Recipe**  
Socket Type: `RecipeGain`
- Ex: `{"Event": "RecipeGain", "Player":{"Name":"<Player Name>","UUID":"<Player UUID>"}, "Recipe": "<namespace>:<item>"}`

**Player Gains an Achievement**  
Socket Type: `AchievementGain`
- Ex: `{"Event": "AchievementGain", "Player":{"Name":"<Player Name>","UUID":"<Player UUID>"}, "Achievement": "<path>/<achievement>"}`

**Player Dies**  
Socket Type: `PlayerDeath`
- Ex: `{"Event": "PlayerKill", "Player":{"Name":"<Player Name>","UUID":"<Player UUID>"}, "Killer": {"Player": "<Player Name>", "UUID": "<Entity UUID>"}, "Death Message": "<Death Message>", "Position":{ "X":<X Coord>, "Y":<Y Coord> "Z":<Z Coord>, "Dimension": <Dimension Name>}}`

**Entity Dies**  
Socket Type: `EntityDeath`
- Ex: `{"Event": "EntityDeath", "Entity":{"UUID": "<Entity UUID>", "Entity Type": "<Entity Type>"}, "Position":{ "X":<X Coord>, "Y":<Y Coord> "Z":<Z Coord>, "Dimension": <Dimension Name>}}`

**Player Attempts Running Command**  
Socket Type: `OnCommandRun`
- Ex: `{"Event": "OnCommandRun", "Player":{"Name":"<Player Name>","UUID":"<Player UUID>"}, "Command": "<Command>"}`
