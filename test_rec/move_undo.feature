Feature:
As a Tic-Tac-Toe player
I want to be able to undo a move
So that I can make the correct move to win the game

Scenario 1:
Given The game is running
When no moves have been made
Then Undo button should be inactive

Scenario 2:
Given The game is running
When One move is made
Then Undo button should be inactive

Scenario 3:
Given The game is running
And One move is made
When User has pressed 'Undo'
Then the previous move should not be seen on the board

Scenario 4:
Given The game is running
When n number of moves have been made
Then the undo button should be active for n Undo’s
