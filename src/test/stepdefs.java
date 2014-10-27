import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefs {
    public TicTacToe t3;

    @Given("^The game is running$")
    public void gameSetup() throws Throwable {
        t3 = new TicTacToe(3);
    }

    @When("^Three x's get put in a row$")
    public void Three_x_s_get_put_in_a_row() throws Throwable {
        // Express the Regexp above with the code you wish you had
        t3.pushButton(0, 0);
        Thread.sleep(1000);
        t3.pushButton(0, 1);
        Thread.sleep(1000);
        t3.pushButton(1, 0);
        Thread.sleep(1000);
        t3.pushButton(2, 2);
        Thread.sleep(1000);
        t3.pushButton(2,0);
    }

    @Then("^A win should be added to the count for x$")
    public void A_win_should_be_added_to_the_count_for_x() throws Throwable {
        (t3.getMoveTxt());
    }
}