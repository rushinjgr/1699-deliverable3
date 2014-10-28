import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class stepdefs {
    public TicTacToe t3;

    public static final int sleepTime = 100;

    @Given("^The game is running$")
    public void gameSetup() throws Throwable {
        t3 = new TicTacToe(3);
    }

    @When("^Player One wins$")
    public void Player_One_wins() throws Throwable {
        t3.pushButton(0, 0); //x
        Thread.sleep(sleepTime);
        t3.pushButton(0, 1); //o
        Thread.sleep(sleepTime);
        t3.pushButton(1, 0); //x
        Thread.sleep(sleepTime);
        t3.pushButton(2, 2); //o
        Thread.sleep(sleepTime);
        t3.pushButton(2, 0); //x
    }

    @Then("^X wins should be displayed$")
    public void A_win_should_be_added_to_the_count_for_x() throws Throwable {
        String observed = (t3.getMoveTxt());
        assertEquals(observed.compareToIgnoreCase("X wins!"),0);
    }

    @When("^Player Two Wins$")
    public void Player_Two_Wins() throws Throwable {
        t3.pushButton(0, 1); //x
        Thread.sleep(sleepTime);
        t3.pushButton(0, 0); //o
        Thread.sleep(sleepTime);
        t3.pushButton(1, 2); //x
        Thread.sleep(sleepTime);
        t3.pushButton(1, 0); //o
        Thread.sleep(sleepTime);
        t3.pushButton(1, 1); //x
        Thread.sleep(sleepTime);
        t3.pushButton(2, 0); //o
    }

    @Then("^O wins should be displayed$")
    public void O_wins_should_be_displayed() throws Throwable {
        String observed = (t3.getMoveTxt());
        assertEquals(observed.compareToIgnoreCase("O wins!"),0);
    }

    @When("^The board is filled with no letter 'team' in a row$")
    public void The_board_is_filled_with_no_letter_team_in_a_row() throws Throwable {
        t3.pushButton(0, 0); //x
        Thread.sleep(sleepTime);
        t3.pushButton(0, 1); //o
        Thread.sleep(sleepTime);
        t3.pushButton(0, 2); //x
        Thread.sleep(sleepTime);
        t3.pushButton(1, 0); //o
        Thread.sleep(sleepTime);
        t3.pushButton(1, 2); //x
        Thread.sleep(sleepTime);
        t3.pushButton(1, 1); //o
        Thread.sleep(sleepTime);
        t3.pushButton(2, 1); //x
        Thread.sleep(sleepTime);
        t3.pushButton(2, 0); //o
        Thread.sleep(sleepTime);
        t3.pushButton(2, 2); //x
    }

    @Then("^Stalemate should be displayed.$")
    public void Stalemate_should_be_displayed() throws Throwable {
        String observed = (t3.getMoveTxt());
        assertEquals(observed.compareToIgnoreCase("Stalemate!"), 0);
    }

    @Then("^One win and one loss and no stalemates should be displayed for both players$")
    public void One_win_and_one_loss_should_be_displayed_for_both_players() throws Throwable {
        String check[] = t3.getScore();
        assertTrue(check.length == 2);
        assertEquals(check[0].compareToIgnoreCase("Wins: 1 \n" + "Losses: 1 \n" + "Stalemates: 0"), 0);
        assertEquals(check[1].compareToIgnoreCase("Wins: 1 \n" + "Losses: 1 \n" + "Stalemates: 0"), 0);
    }

    @And("^The players wait$")
    public void The_players_wait() throws Throwable {
        Thread.sleep(1000);
    }

    @And("^The players start a new game$")
    public void The_players_start_a_new_game() throws Throwable {
        t3.newGame();
    }

    @Then("^One win and one loss and one stalemates should be displayed for both players$")
    public void One_win_and_one_loss_and_one_stalemates_should_be_displayed_for_both_players() throws Throwable {
        String check[] = t3.getScore();
        assertTrue(check.length==2);
        System.out.println(check[0]);
        assertEquals(check[0].compareToIgnoreCase("Wins: 1 \n" + "Losses: 1 \n" + "Stalemates: 1"), 0);
        assertEquals(check[1].compareToIgnoreCase("Wins: 1 \n" + "Losses: 1 \n" + "Stalemates: 1"), 0);
    }

    @When("^One move is made$")
    public void One_move_is_made() throws Throwable {
        t3.pushButton(0,0);
    }

    @Then("^The board should have no moves made$")
    public void The_board_should_have_no_moves_made() throws Throwable {
        assertEquals(t3.getMovesMade(),0);
    }

    @Then("^The board should have one move made$")
    public void The_board_should_have_one_move_made() throws Throwable {
        assertEquals(t3.getMovesMade(),1);
    }
    
    @When("^When no moves have been made$")
    public void When_no_moves_have_been_made() throws Throwable {
        throw new NoSuchMethodException();
    }
    
    @Then("^Undo button should be inactive$")
    public void Undo_button_should_be_inactive() throws Throwable {
        assertFalse(t3.getUndoButtonActive());
    }
    
    @When("^When a move has been made$")
    public void When_a_move_has_been_made() throws Throwable {
        throw new NoSuchMethodException();
    }
    
    @Then("^Undo button should be active$")
    public void Undo_button_should_be_active() throws Throwable {
        assertTrue(t3.getUndoButtonActive());
    }

    @When("^User has made a move$")
    public void User_has_made_a_move() throws Throwable {
        throw new NoSuchMethodException();
    }

    @And("^User has pressed 'Undo'$")
    public void User_has_pressed_Undo() throws Throwable {
        throw new NoSuchMethodException();
    }

    @Then("^Previous move should not be seen on the board$")
    public void Previous_move_should_not_be_seen_on_the_board() throws Throwable {
        throw new NoSuchMethodException();
    }

    @When("^It is team X's turn$")
    public void It_is_team_Xs_turn() throws Throwable {
        if(t3.getMovesMade() == 0){
            t3.pushButton(1,1);
            t3.pushButton(2,2);
        }
        if(t3.getPlayerX()) { //if it is x's turn

        }
        else{ //if it is team o's turns
            t3.pushButton(0,0);
        }
    }
    
    @Then("^Display 'X goes next'$")
    public void Display_X_goes_next() throws Throwable {
        System.out.println(t3.getMoveTxt());
        assertEquals(t3.getMoveTxt().compareToIgnoreCase("X goes next"),0);
    }

    @When("^It is team O's turn$")
    public void It_is_team_Os_turn() throws Throwable {
        if(t3.getMovesMade() == 0){
            t3.pushButton(1,1);
            t3.pushButton(2,2);
        }
        if(t3.getPlayerX()) { //if it is x's turn
            t3.pushButton(0,0);
        }
        else{ //if it is team o's turns

        }
    }
    
    @Then("^Display 'O goes next'$")
    public void Display_O_goes_next() throws Throwable {
        assertEquals(t3.getMoveTxt().compareToIgnoreCase("O goes next"),0);
    }
    
    @When("^Neither player has made a move$")
    public void Neither_player_has_made_a_move() throws Throwable {
        throw new NoSuchMethodException();
    }

    @Then("^'New Game' button should be active$")
    public void New_Game_button_should_be_active() throws Throwable {
        assertTrue(t3.getNewGameButtonActive());
    }
    
    //@When("^A move has been made$")
    
    @Then("^'New Game' button should be inactive$")
    public void New_Game_button_should_be_inactive() throws Throwable {
        assertFalse(t3.getNewGameButtonActive());
    }
    
    //@When("^'New Game' is clicked$")
    
   // @Then("^The board is cleared$")
    
    //@And("^It is the turn of whichever team went first$")
}
