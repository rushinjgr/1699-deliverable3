import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
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
        assertTrue(check.length==2);
        System.out.println(check[0]);
        assertEquals(check[0].compareToIgnoreCase("Wins: 1 \n" + "Losses: 1 \n" + "Stalemates: 0"), 0);
        assertEquals(check[1].compareToIgnoreCase("Wins: 1 \n" + "Losses: 1 \n" + "Stalemates: 0"), 0);
    }

    @And("^The players wait$")
    public void The_players_wait() throws Throwable {
        Thread.sleep(3000);
    }

    @And("^The players start a new game$")
    public void The_players_start_a_new_game() throws Throwable {
        t3.newGame();
    }
}