Feature:Pressing the "new game" button starts a new game when a game has ended or if a game is in progress.

  Scenario:Press the "new game" button after a game has ended.
    Given The game is running
    When Player One wins
    And The players start a new game
    Then The board should have no moves made

  Scenario:Press the "new game" button while a game is in progress.
    Given The game is running
    When One move is made
    And The players start a new game
    Then The board should have no moves made