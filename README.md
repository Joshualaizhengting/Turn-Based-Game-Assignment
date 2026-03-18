# Turn-Based-Game-Assignment
Learning Outcomes 
• Design a non-trivial system using object-oriented programming principles. 
• Apply SOLID design principles with concrete evidence. 
• Document software design using UML class and sequence diagrams. 
• Implement an extensible and testable Java system.


2. Game Overview
Build a turn-based combat arena game that runs entirely in the command line (no GUI).
For experienced Java developers, a GUI-based version may be implemented and will be
accepted. However, no additional marks will be awarded, as this project places emphasis on
software design and object-oriented principles, rather than user interface complexity.A player
fights one or more enemies using Actions, Items, and Status Effects.

Game Flow
• The game proceeds in rounds.
• Each round, combatants act in a turn order determined by a TurnOrderStrategy.
• Player chooses an action via a text menu.
• Enemies perform BasicAttack.
• Win: all enemies defeated.
• Lose: player defeated.

Turn Order Strategy Flow
- In every game, there must be a clear ending, i.e. a winner and a loser
- There is no “draw” scenario
- In a turn, each entity takes one action. The order and sequence of actions depend on the
speed stat of the entity. Higher speed goes first.



