Feature:The game keeps the score of both players for the session in terms of wins, losses, and stalemates. The game displays this for the users.

  Scenario: X and O each win a game (and thus each lose a game).
    Given The game is running
    When Player One wins
    And The players wait
    And The players start a new game
    #Note: Player one wins is run again because the players switch order (loser goes first)
    And Player One wins
    Then One win and one loss and no stalemates should be displayed for both players

  Scenario: Player one and player two each win a game and tie.
    Given The game is running
    When Player One wins
    And The players wait
    And The players start a new game
    And The board is filled with no letter 'team' in a row
    And The players wait
    And The players start a new game
    And Player Two Wins
    Then One win and one loss and one stalemates should be displayed for both players