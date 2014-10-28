Feature:As a Tic-Tac-Toe player
  I want to be able to start a new game at any point
  So that I can restart a bad game

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

  Scenario:When no player has moved, new move button should be inactive.
    Given The game is running
    When Neither player has made a move
    Then 'New Game' button should be inactive

  Scenario:When a player has moved, new move button should be active.
    Given The game is running
    When One move is made
    Then 'New Game' button should be active