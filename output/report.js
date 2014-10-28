$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("move_undo.feature");
formatter.feature({
  "line": 1,
  "name": "Move Undo",
  "description": "As a Tic-Tac-Toe player\nI want to be able to undo a move\nSo that I can make the correct move to win the game",
  "id": "move-undo",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Undo no moves",
  "description": "",
  "id": "move-undo;undo-no-moves",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "The game is running",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "The board should have no moves made",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Undo button should be inactive",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.gameSetup()"
});
formatter.result({
  "duration": 481981712,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.The_board_should_have_no_moves_made()"
});
formatter.result({
  "duration": 4652565,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.Undo_button_should_be_inactive()"
});
formatter.result({
  "duration": 93766,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "One move made",
  "description": "",
  "id": "move-undo;one-move-made",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "The game is running",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "One move is made",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Undo button should be active",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.gameSetup()"
});
formatter.result({
  "duration": 283861025,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.One_move_is_made()"
});
formatter.result({
  "duration": 82255346,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.Undo_button_should_be_active()"
});
formatter.result({
  "duration": 45903,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Undo one move",
  "description": "",
  "id": "move-undo;undo-one-move",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "The game is running",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "One move is made",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User has pressed \u0027Undo\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "The previous move should not be seen on the board",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "The board should have no moves made",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.gameSetup()"
});
formatter.result({
  "duration": 237455700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.One_move_is_made()"
});
formatter.result({
  "duration": 137422371,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.User_has_pressed_Undo()"
});
formatter.result({
  "duration": 69845411,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.The_previous_move_should_not_be_seen_on_the_board()"
});
formatter.result({
  "duration": 135850,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.The_board_should_have_no_moves_made()"
});
formatter.result({
  "duration": 34464,
  "status": "passed"
});
formatter.uri("new_game.feature");
formatter.feature({
  "line": 1,
  "name": "New Game Button",
  "description": "As a Tic-Tac-Toe player\nI want to be able to start a new game at any point\nSo that I can restart a bad game",
  "id": "new-game-button",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Press the \"new game\" button after a game has ended.",
  "description": "",
  "id": "new-game-button;press-the-\"new-game\"-button-after-a-game-has-ended.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "The game is running",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Player One wins",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The players start a new game",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "The board should have no moves made",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.gameSetup()"
});
formatter.result({
  "duration": 90149551,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.Player_One_wins()"
});
formatter.result({
  "duration": 832249514,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.The_players_start_a_new_game()"
});
formatter.result({
  "duration": 71169796,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.The_board_should_have_no_moves_made()"
});
formatter.result({
  "duration": 56102,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Press the \"new game\" button while a game is in progress.",
  "description": "",
  "id": "new-game-button;press-the-\"new-game\"-button-while-a-game-is-in-progress.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "The game is running",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "One move is made",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "The players start a new game",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "The board should have no moves made",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.gameSetup()"
});
formatter.result({
  "duration": 94727230,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.One_move_is_made()"
});
formatter.result({
  "duration": 112137427,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.The_players_start_a_new_game()"
});
formatter.result({
  "duration": 70373759,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.The_board_should_have_no_moves_made()"
});
formatter.result({
  "duration": 65950,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "When no player has moved, new move button should be inactive.",
  "description": "",
  "id": "new-game-button;when-no-player-has-moved,-new-move-button-should-be-inactive.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "The game is running",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "The board should have no moves made",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "\u0027New Game\u0027 button should be inactive",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.gameSetup()"
});
formatter.result({
  "duration": 112876751,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.The_board_should_have_no_moves_made()"
});
formatter.result({
  "duration": 40348,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.New_Game_button_should_be_inactive()"
});
formatter.result({
  "duration": 711007,
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertFalse(Assert.java:64)\n\tat org.junit.Assert.assertFalse(Assert.java:74)\n\tat stepdefs.New_Game_button_should_be_inactive(stepdefs.java:191)\n\tat ✽.Then \u0027New Game\u0027 button should be inactive(new_game.feature:21)\n",
  "status": "failed"
});
formatter.scenario({
  "line": 23,
  "name": "When a player has moved, new move button should be active.",
  "description": "",
  "id": "new-game-button;when-a-player-has-moved,-new-move-button-should-be-active.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "The game is running",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "One move is made",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "\u0027New Game\u0027 button should be active",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.gameSetup()"
});
formatter.result({
  "duration": 183374331,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.One_move_is_made()"
});
formatter.result({
  "duration": 161227801,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.New_Game_button_should_be_active()"
});
formatter.result({
  "duration": 51617,
  "status": "passed"
});
formatter.uri("score_keeping.feature");
formatter.feature({
  "line": 1,
  "name": "Score Keeping",
  "description": "As a Tic-Tac-Toe player\nI want to be able to see the score of the games played in this session\nSo that I can track performance versus my opponent",
  "id": "score-keeping",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "X and O each win a game (and thus each lose a game).",
  "description": "",
  "id": "score-keeping;x-and-o-each-win-a-game-(and-thus-each-lose-a-game).",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "The game is running",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Player One wins",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The players wait",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "The players start a new game",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#Note: Player one wins is run again because the players switch order (loser goes first)"
    }
  ],
  "line": 12,
  "name": "Player One wins",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "One win and one loss and no stalemates should be displayed for both players",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.gameSetup()"
});
formatter.result({
  "duration": 79749909,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.Player_One_wins()"
});
formatter.result({
  "duration": 813677317,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.The_players_wait()"
});
formatter.result({
  "duration": 1000162812,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.The_players_start_a_new_game()"
});
formatter.result({
  "duration": 73529210,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.Player_One_wins()"
});
formatter.result({
  "duration": 754532208,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.One_win_and_one_loss_should_be_displayed_for_both_players()"
});
formatter.result({
  "duration": 240651,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Player one and player two each win a game and tie.",
  "description": "",
  "id": "score-keeping;player-one-and-player-two-each-win-a-game-and-tie.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "The game is running",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Player One wins",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "The players wait",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "The players start a new game",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "The board is filled with no letter \u0027team\u0027 in a row",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "The players wait",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "The players start a new game",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Player Two Wins",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "One win and one loss and one stalemates should be displayed for both players",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.gameSetup()"
});
formatter.result({
  "duration": 99362622,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.Player_One_wins()"
});
formatter.result({
  "duration": 796624431,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.The_players_wait()"
});
formatter.result({
  "duration": 1000191166,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.The_players_start_a_new_game()"
});
formatter.result({
  "duration": 71567513,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.The_board_is_filled_with_no_letter_team_in_a_row()"
});
formatter.result({
  "duration": 1432021624,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.The_players_wait()"
});
formatter.result({
  "duration": 1000200748,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.The_players_start_a_new_game()"
});
formatter.result({
  "duration": 72001041,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.Player_Two_Wins()"
});
formatter.result({
  "duration": 921427784,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.One_win_and_one_loss_and_one_stalemates_should_be_displayed_for_both_players()"
});
formatter.result({
  "duration": 777999,
  "error_message": "java.lang.AssertionError: expected:\u003c1\u003e but was:\u003c0\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.failNotEquals(Assert.java:743)\n\tat org.junit.Assert.assertEquals(Assert.java:118)\n\tat org.junit.Assert.assertEquals(Assert.java:555)\n\tat org.junit.Assert.assertEquals(Assert.java:542)\n\tat stepdefs.One_win_and_one_loss_and_one_stalemates_should_be_displayed_for_both_players(stepdefs.java:111)\n\tat ✽.Then One win and one loss and one stalemates should be displayed for both players(score_keeping.feature:24)\n",
  "status": "failed"
});
formatter.uri("team_display.feature");
formatter.feature({
  "line": 1,
  "name": "Team Display",
  "description": "As a Tic-Tac-Toe player\nI want the current letter team displayed\nSo that I know whose turn it is",
  "id": "team-display",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "X\u0027s turn",
  "description": "",
  "id": "team-display;x\u0027s-turn",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "The game is running",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "It is team X\u0027s turn",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Display \u0027X goes next\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.gameSetup()"
});
formatter.result({
  "duration": 78815789,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.It_is_team_Xs_turn()"
});
formatter.result({
  "duration": 184891311,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.Display_X_goes_next()"
});
formatter.result({
  "duration": 103168,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "O\u0027s turn",
  "description": "",
  "id": "team-display;o\u0027s-turn",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "The game is running",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "It is team O\u0027s turn",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Display \u0027O goes next\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.gameSetup()"
});
formatter.result({
  "duration": 109068904,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.It_is_team_Os_turn()"
});
formatter.result({
  "duration": 258334045,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.Display_O_goes_next()"
});
formatter.result({
  "duration": 106176,
  "status": "passed"
});
formatter.uri("three_in_a_row.feature");
formatter.feature({
  "line": 1,
  "name": "Three in a row",
  "description": "As a Tic-Tac-Toe player\nI want to win when I put three of my letters in a row and no other time\nSo that the game will be fun",
  "id": "three-in-a-row",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Three X\u0027s in a row wins the game",
  "description": "",
  "id": "three-in-a-row;three-x\u0027s-in-a-row-wins-the-game",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "The game is running",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Player One wins",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "X wins should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.gameSetup()"
});
formatter.result({
  "duration": 84221806,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.Player_One_wins()"
});
formatter.result({
  "duration": 801211479,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.A_win_should_be_added_to_the_count_for_x()"
});
formatter.result({
  "duration": 92585,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Three O\u0027s in a row wins the game",
  "description": "",
  "id": "three-in-a-row;three-o\u0027s-in-a-row-wins-the-game",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "The game is running",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Player Two Wins",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "O wins should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.gameSetup()"
});
formatter.result({
  "duration": 78223954,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.Player_Two_Wins()"
});
formatter.result({
  "duration": 976054477,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.O_wins_should_be_displayed()"
});
formatter.result({
  "duration": 129087,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "No letters in a row results in a stalemate",
  "description": "",
  "id": "three-in-a-row;no-letters-in-a-row-results-in-a-stalemate",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "The game is running",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "The board is filled with no letter \u0027team\u0027 in a row",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Stalemate should be displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.gameSetup()"
});
formatter.result({
  "duration": 94444034,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.The_board_is_filled_with_no_letter_team_in_a_row()"
});
formatter.result({
  "duration": 1470863008,
  "status": "passed"
});
formatter.match({
  "location": "stepdefs.Stalemate_should_be_displayed()"
});
formatter.result({
  "duration": 61992,
  "status": "passed"
});
});