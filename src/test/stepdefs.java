import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class stepdefs {
    public TicTacToe t3;

    public static final int sleepTime = 500;

    @Given("^The game is running$")
    public void gameSetup() throws Throwable {
        t3 = new TicTacToe(3);
    }

    @When("^Three X's get put in a row$")
    public void Three_x_s_get_put_in_a_row() throws Throwable {
        t3.pushButton(0, 0); //x
        Thread.sleep(500);
        t3.pushButton(0, 1); //o
        Thread.sleep(500);
        t3.pushButton(1, 0); //x
        Thread.sleep(500);
        t3.pushButton(2, 2); //o
        Thread.sleep(500);
        t3.pushButton(2, 0); //x
    }

    @Then("^X wins should be displayed$")
    public void A_win_should_be_added_to_the_count_for_x() throws Throwable {
        String observed = (t3.getMoveTxt());
        assertEquals(observed.compareToIgnoreCase("X wins!"),0);
    }

    @When("^Three O's get put in a row$")
    public void Three_O_s_get_put_in_a_row() throws Throwable {
        t3.pushButton(0, 1); //x
        Thread.sleep(500);
        t3.pushButton(0, 0); //o
        Thread.sleep(500);
        t3.pushButton(1, 2); //x
        Thread.sleep(500);
        t3.pushButton(1, 0); //o
        Thread.sleep(500);
        t3.pushButton(1, 1); //x
        Thread.sleep(500);
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
        Thread.sleep(500);
        t3.pushButton(0, 1); //o
        Thread.sleep(500);
        t3.pushButton(0, 2); //x
        Thread.sleep(500);
        t3.pushButton(1, 0); //o
        Thread.sleep(500);
        t3.pushButton(1, 2); //x
        Thread.sleep(500);
        t3.pushButton(1, 1); //o
        Thread.sleep(500);
        t3.pushButton(2, 1); //x
        Thread.sleep(500);
        t3.pushButton(2, 0); //o
        Thread.sleep(500);
        t3.pushButton(2, 2); //x
    }

    @Then("^Stalemate should be displayed.$")
    public void Stalemate_should_be_displayed() throws Throwable {
        String observed = (t3.getMoveTxt());
        System.out.println("observed");
        assertEquals(observed.compareToIgnoreCase("Stalemate!"),0);
    }
}