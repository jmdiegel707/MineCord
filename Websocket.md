### Websocket json returns

Reference for json packages the websocket returns on different events.  
Setup different options to confuigure the websocket in the [Config File (`config.yml`)](https://github.com/SleepyHead707/MineCord/blob/main/ConfigHelp.md#websocket-config).

___

**Non-Event Data**
The first three events (Online, Stats, Positions) are not events and are repositories of data that will send only on the set [interval timer](https://github.com/SleepyHead707/MineCord/blob/main/ConfigHelp.md#intervals).

- Online:
  - This returns data on what players are online. To allow the websocket to return when a player joins or leaves the server, turn on `OnJoinLeave`
  - Ex: `{OnlinePlayers:[{"Player":"<Player Name>"},{"Player":"<Player Name>"},etc]}`

- Stats:
  - This returns data *about* what players are online. Data includes the Player's health, armor, hunger, etc.
  - Ex: `{Players:[{"Player":"<Player Name>", "Health":<Player Health>, "Hunger":<Player Hunger>, Attributes:[`<[Player Attributes](https://minecraft.fandom.com/wiki/Attribute)>`]}]}`

- Postitions:
  - This returns the coordinates and what dimention all online players are in.
  - Ex: `{Players:[{"Player":"<Player Name>", "Xpos":<X Coord>, "Ypos":<Y Coord> "Zpos":<Z Coord>, "Dimention", <Dimention Name>}]}`

**Event Data**
See the [Config File (`config.yml`)](https://github.com/SleepyHead707/MineCord/blob/main/ConfigHelp.md#websocket-config) for details about each event.

- OnJoinLeave:
  - Ex: `{"Event": OnJoinLeave, "Log type": "<Join/Leave>", "Player":[{"Name":"<Player Name>"},{"UUID":"<Player UUID>"}]}`

- BlockUpdate:
  - Ex: `{"Event": BlockUpdate, "Block": "<Block Name>": }`

