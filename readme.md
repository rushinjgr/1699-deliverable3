CS 1699 Software Testing Deliverable 3
Automated BDD w/ Cucumber
Tic Tac Toe
Neha Abraham
Justin Rushin III

Changes thus far to original program:


-Removed name setting functionality

-Added public button push method for testing

-Added getter method for last move

Project Structure


src/TicTacToe.java

src/TPlayer.java

src/test/Runner.java    This is the test runner. Run this file as a junit test and it will run the cucumber tests.

src/test/stepdefs.java  Step definitions go here. We can consider making another file for them if we get too many but it would be simpler to have them in one file.

test_rec/       This is where feature files will go.

test_rec/three_in_a_row.feature     Only when three letters get placed in a row does the game display a winner.