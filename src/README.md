Problem 5. **Football Team Generator
A football team has variable number of players, a name and a rating.
Team
-	name: String
-	players: List<Player> 
+ 	Team (String)
-	setName(String) : void
+	getName(): String``
+	addPlayer(Player) : void
+	removePlayer(String) : void
+	getRating() : double

A player has a name and stats which are the basis for his skill level. The stats a player has are endurance, sprint, dribble, passing and shooting. Each stat can be in the range [0..100]. The overall skill level of a player is calculated as the average of his stats. Only the name of a player and his stats should be visible to all of the outside world. Everything else should be hidden.
Player
-	name: String
-	endurance:  int
-	sprint:  int
-	dribble: int  
-	passing: int
-	shooting: int 
+ 	Player (String, int, int, int, int, int)
-	setName(String) : void
+	getName(): String
-	setEndurance (int) : void
-	setSprint (int) : void
-	setDribble (int) : void
-	setPassing (int) : void
-	setShooting (int) : void
+	overallSkillLevel() : double

A team should expose a name, a rating (calculated by the average skill level of all players in the team) and methods for adding and removing players.
Your task is to model the team and the players following the proper principles of Encapsulation. Expose only the fields that needs to be visible and validate data appropriately.
