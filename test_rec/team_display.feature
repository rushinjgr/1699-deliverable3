Feature:As a Tic-Tac-Toe player
  I want the current letter team displayed
  So that I know whose turn it is

  Scenario 1:
    Given The game is running
    When It is team X's turn
    Then Display 'X goes next'
  Scenario 2:
    Given The game is running
    When It is team O's turn
    Then Display 'O goes next'