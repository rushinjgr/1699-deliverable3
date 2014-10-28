Feature:The game keeps the score of both players for the session in terms of wins, losses, and stalemates. The game displays this for the users.

  Scenario: Player one and player two each win a game.
    Given The game is running
    When Player One wins
    And The players wait
    And The players start a new game
    And Player One wins
    Then One win and one loss and no stalemates should be displayed for both players