Feature:Move Undo
As a Tic-Tac-Toe player
I want to be able to undo a move
So that I can make the correct move to win the game

Scenario:1
Given The game is running
Given The board should have no moves made
Then Undo button should be inactive

Scenario:2
Given The game is running
When One move is made
Then Undo button should be active

Scenario:3
Given The game is running
And One move is made
When User has pressed 'Undo'
Then The previous move should not be seen on the board
And The board should have no moves made


