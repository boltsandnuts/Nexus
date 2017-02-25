# Nexus
Nexus is a Magic: The Gathering inspired Mod for minecraft (in lore and flavor mostly) that focuses around building and collecting mana resources of different types that generate in specific biomes. Once the multiblock focusing structure is built around the randomly generated manafont the latent energy can be amplified causing a lotus of that color to grow. The lotus is then placed in the mana font which allows it to then be harvested and relocated. The lotus/Manafont will continually produce mana in small amounts over time. The mana is then used as an energy source to fuel spell creation, crafting processess, to empower areas, to harvest blocks with its unique interactions with other fluids and fuel the creation of dimensions for boss fights and plane's walking.

##Overall Goals:	
* No Gui for most of the mod, and no “wand”, instead the user interacts with the mod directly using mouse gestures, the specific gestures are glyphs that will project from the corresponding mana crystals. (Tigram gesture inspired http://en.daoinfo.org/wiki/Finger_Gestures). Understanding not all players enjoy that sort of gesture based interaction there will also be a radial cast menu.
* Teleportation using leyline redirection interdimensionally and Nexus focal points for interdimensional rift creation (The rift must be formed in the target dimension, so a nexus must be created in each dimension at least once) Once the rift focus is attuned to that dimension it can then be linked to any number of other foci. Dimension Creation/PlanesWalking.
* Summoning System - Basically this would include some custom entities that appear as translucent entites that move with you. Different abilities will allow you to summon minions and they will attack or provide benefits. They can be equiped with gear and enchantments from the mod to further their abilities. They are unable to be attacked directly by anything other than another user of the mod employing mod abilities. A defender unit for example will automatically attempt to intercept damage, while a champion unit like the palladin of limdul will be granted bonuses against other minions etc. Minions will automatically target other minions and hostile monsters/players. They themselves cannot be targeted or aggroed directly however and players/mobs can walk right through them.
* Applied energistics style storage utilizing Mana crystal, crafting recipes, resource sinks and the mana power system. There will be a sort of channel system but instead of having actual cabling there will be linking nodes (similar to blood magic item routing system) and each routing node will allow a set amount of direct connections.
* Mana links at your base/nexus that you can “tap” to craft things, create effects, empower rituals, or use for inspiration researches
* Long term goal - Magical autocrafting requiring “upkeep”
* Leylines and Nexus have a set amount of Mana as part of the nbt data from the chunk they are generated in (randomly determined at worldgen) and recharge over time to their initial maximum. Recharging can be sped up via biome specific conditions. Green mana regen is sped up by growing plants nearby, red is sped up but fire etc, this encourages and requires interesting builds for each of your mana generators, that will incorporate with the multiblocks
* 3 tiers of multiblock mana pool first tier just a hole in the ground mana collects then a 5x5 (think Ars magica crafting altar) and final tier is a 13x13 structure
* A nexus is formed once all the mana colors are attuned to an inert crystal (A crystal placed in the world and then the linking gesture used from each mana source to the crystal). If a nexus is drained too low (<10%) it will start tearing up the land in a desperate attempt to sustain itself (Similar to a hungry node).
* If a nexus is completely drained it will become inert and need to be restored.
* Spell discovery via inspiration research
* Magic system that allows the player to bend, and break the laws of physics using the magic that connects and binds reality itself to obtain direct manipulation of the weave. Spells are cast by direct gesture OR by selecting the gesture from a radial menu and activating the keybind. 
* There should be around 20~30 spell effects but each player can only “equip” 7 at a time, reflective of the MTG need to strategize and limit your hand.
* To use the spells on a personal level you will need mana to fuel them, you can infuse up to 50 “buckets” of mana, the colors can be mixed to your liking. For instance if I want to focus on growth and fire (Green/red) magic I can infuse myself with 25 green and 25 red equally which would power the glyph’s I have prepared. 
* Rifts - Tears in reality - High end portion of the game, easier rifts can be created for just teleportation with difficulty similar to that of mystcraft, a single rift can also be linked to multiple rifts in this way to cycle through. A rift linked to multiple rifts will cycle its destination once every 2 seconds displaying a glyph representation of its target (or better an actual image similar to some CCTV mods, if this could be done without chunk loading every destination point) a rift stabilizer will allow you to lock onto a destination once a redstone signal is supplied. CC/OC integration here would be cool.
* Lots of fun PVP spells/effects and systems
* Focus on high utility and working with other mods
* Dimensional Folds - these are similar to rifts but the can’t link to multiple targets, each fold comes in a multiblock pair, this would allow for transdimensional transmission of anything passing through, the multiblock itself would allow for expandability of the rift to put more cabling/conduits/people etc through the rift. It would need to be the same size structure on both sides (ie 4x5 or w/e, 1x1 being the smallest) before it can be initialized. Dimensional Folds would support one to many connections so essentially our take on a tesseract.
* Needs ui display element for current/maximum mana capacities as well as your prepared spells


## MTG Inspired player abilities, abilities will be tier gated

## MTG Themed items

## Research system:
Learn by doing/experimentation. Mix and match combinations of elemental summons which are uncovered via exploration and trading with other players/villages. Primal Inspirations are color based white, black, red, blue, green. Using a combination of these runes (Up to 4) the player can design spells that are powered with Mana of the corresponding types and amounts. The amount of power put into a spell on cast (by channeling with right click after the gesture) determines magnitude, damage, duration and invokes extra effects depending on the spell, a full write up of intended spells and combinations will follow in the future as well as proper naming.


##Worldgen:
Randomly generated nbt data for chunks determining the maximum mana that it may contain. High concentration areas will spawn small mana pools (4-5 source blocks). Very high concentration areas will create a permenant mana font that will contiually replenish the mana over time. High mana concetration allows a font to generte more quickly than another. If the concetration is too high (May be increased later artificially) the manafont will begin to cause magic contamination in the area. 

Each biome will have a very low chance of a randomly generated mana pool, visiting these naturally occurring mana pools will trigger inspiration for that type of primal mana allowing the users to begin working with them. The worldgen pools are used in the research system as each provides an inspiration for its corresponding type. The inspiration can also be written down in a book for crafting or can be traded. ie If I travel for a few thousand meters and collect 4 Black inspirations, Red Inspirations and a White Inspiration I can inscribe one of my inspirations into a condensed orb at a small mana cost and trade that to another player. I lose one of my stored inspirations in the process but will gain the one they trade me after using the orb they give me. At high progression you begin to have a chance to inscribe inspirations without losing your own, but to prevent hoarding you can only have a maximum of 4 of each type at any given time. Mana pools should be no closer together than 2 chunks an attune to a mana pool that is too close to another will give an error and disallow linking.Near mana sources a lotus of the appropriate time will sometimes grow. This lotus can be harvested with shears and planted/cultivated for crafting components. Muticolor mana nodes will need to be setup on chunk’s bordering two appropriate biomes. If this proves to difficulty to find there is alternaives farther in the progression path utilizing colorless mana from the void (end) which can be shifted with some of the mod blocks. 
