Feature:Three in a row of any letter wins the game; nothing else results in a win.

Scenario:Three X's in a row wins the game
  Given The game is running
  When Three X's get put in a row
  Then X wins should be displayed

Scenario:Three O's in a row wins the game
  Given The game is running
  When Three O's get put in a row
  Then O wins should be displayed

Scenario:No letters in a row results in a stalemate
  Given The game is running
  When The board is filled with no letter 'team' in a row
  Then Stalemate should be displayed.