Feature:Three in a row
  As a Tic-Tac-Toe player
  I want to win when I put three of my letters in a row and no other time
  So that the game will be fun

Scenario:Three X's in a row wins the game
  Given The game is running
  When Player One wins
  Then X wins should be displayed

Scenario:Three O's in a row wins the game
  Given The game is running
  When Player Two Wins
  Then O wins should be displayed

Scenario:No letters in a row results in a stalemate
  Given The game is running
  When The board is filled with no letter 'team' in a row
  Then Stalemate should be displayed.