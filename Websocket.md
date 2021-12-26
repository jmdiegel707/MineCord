###  Websocket JSON Reference

Reference for json messages the websocket server sends on different events.

Setup different options to configure the websocket in the [Config File (`config.yml`)](https://github.com/SleepyHead707/MineCord/blob/main/ConfigHelp.md#websocket-config).

___

#### Non-Event Data

These datasets are **not** events and will only be sent on the set  [interval timer](https://github.com/SleepyHead707/MineCord/blob/main/ConfigHelp.md#intervals).

**Online**  
Socket Type: `OnJoinLeave`
- This returns data on what players are online. 

- Ex: `{OnlinePlayers:[{"Player":"<Player Name>"},{"Player":"<Player Name>"},etc]}`

**Stats**  
Socket Type: `PlayerStats`
- This returns data *about* what players are online. Data includes the Player's health, armor, hunger, etc.

- Ex: `{Players:[{"Player":"<Player Name>", "Health":<Player Health>, "Hunger":<Player Hunger>, Attributes:[`<[Player Attributes](https://minecraft.fandom.com/wiki/Attribute)>`]}]}`

**Positions**  
Socket Type: `Position`
- This returns the coordinates and what dimension all online players are in.

- Ex: `{Players:[{"Player":"<Player Name>","Position":{ "X":<X Coord>, "Y":<Y Coord> "Z":<Z Coord>}, "Dimension": <Dimension Name>}]}`
---
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

**Right Click while Holding Item**  
Socket Type: `ItemUse`
- Ex: `{"Event": "ItemUse", "Player": "<Player Name", "Item": "<namespace>:<item>"}`

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
