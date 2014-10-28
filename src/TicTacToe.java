// Neha Abraham
// CS0401 Ramirez
// Assignment 4

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class TicTacToe extends JFrame
{
	private JFrame theWindow;
	private JButton [][] theButtons;
	private JButton newg, undo;
	private JPanel gamePanel;
	private JPanel optionsPanel;
	private JPanel playerPanel;
	private JPanel statPanel;
	private JLabel move;
	private JLabel P1, P2, S1, S2;
	private ArrayList moveList;
	private boolean playerX, firstX;
	private TPlayer pX, pO;
	private int num, moves;
	private int pXw, pOw, pXl, pOl, pXs, pOs;
	
	public TicTacToe(int n)
	{
		num = n;
		moves = 0;
		playerX = true;
		firstX = true;
		moveList = new ArrayList();
		
		theWindow = new JFrame("Tic Tac Toe");
		theWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//set the panels to the desired size of the game
		gamePanel = new JPanel();
		gamePanel.setLayout(new GridLayout(num, num));
		
		//create all the buttons and corresponding ActionListners
		theButtons = new JButton[num][num];
		for (int i = 0; i < theButtons.length; i++)
		{
			for(int k = 0; k < theButtons[i].length; k++)
			{
				theButtons[i][k] = new JButton();
				theButtons[i][k].putClientProperty("row", i);
				theButtons[i][k].putClientProperty("col", k);
				theButtons[i][k].setText(" ");
				theButtons[i][k].addActionListener(new ButtonListener());
				gamePanel.add(theButtons[i][k]);
			}
		}
		
		//create the bottom panel for options and turns
		optionsPanel = new JPanel();
		optionsPanel.setLayout(new GridLayout(1, 3));
		
		//create the new game button and its action listener
		newg = new JButton("New Game");
		newg.addActionListener(new gameListener());
		optionsPanel.add(newg);
		
		//create the undo button and its action listener
		undo = new JButton("Undo Move");
		undo.setEnabled(false);
		undo.addActionListener(new gameListener());
		optionsPanel.add(undo);
		
		//create a JLabel that displays the turn
		move = new JLabel("X goes first");
		move.setHorizontalAlignment(SwingConstants.CENTER);
		optionsPanel.add(move);
		
		//player information panel
		playerPanel = new JPanel();
		playerPanel.setLayout(new GridLayout(2, 2));
		
		String pXname;// = JOptionPane.showInputDialog("What is Player X's name? ");
		String pOname;// = JOptionPane.showInputDialog("What is Player O's name? ");
		pXname = "neha";
        pOname = "justin";
		//create the two player objects
		pX = new TPlayer(pXname);
		pO = new TPlayer(pOname);
		
		P1 = new JLabel(pX.getName());
		P1.setHorizontalAlignment(SwingConstants.CENTER);
		P2 = new JLabel(pO.getName());
		P2.setHorizontalAlignment(SwingConstants.CENTER);
		
		playerPanel.add(P1);
		playerPanel.add(P2);
		
		
		S1 = new JLabel(pX.toString());
		S2 = new JLabel(pO.toString());
		S1.setHorizontalAlignment(SwingConstants.CENTER);
		S2.setHorizontalAlignment(SwingConstants.CENTER);
		
		playerPanel.add(S1);
		playerPanel.add(S2);
		
		//create the game window
		theWindow.setLayout(new GridLayout(3,1));
		theWindow.add(gamePanel);
		theWindow.add(optionsPanel);
		theWindow.add(playerPanel);
		
		theWindow.pack();
		theWindow.setVisible(true);
		
	}

    class ButtonListener implements ActionListener
	{
		private int r;
		private int c;
		
		public void actionPerformed(ActionEvent e)
		{
			JButton b = (JButton) e.getSource();
			//determine which button was clicked
			r = (int) b.getClientProperty("row");
			c = (int) b.getClientProperty("col");
			
			//add the moves to the beginning of the list of moves
			moveList.add(0, c);
			moveList.add(0, r);
			
			String btxt = b.getText();
		
			//only change the text if there isn't already text
			if (!(btxt.equals("X") || (btxt.equals("O"))))
			{
				if(playerX)
				{
					b.setText("X");
					moves++;
					move.setText("O goes next");
					
				}
				else
				{
					b.setText("O");
					moves++;
					move.setText("X goes next");
					
				}
			}
			else
				playerX = !playerX;
				
			undo.setEnabled(true);
			
			if(moves >= ((2*num) - 1))
			{
				//check for a win
				boolean winr = false;
				boolean winc = false;
				boolean wind = false;
				boolean indiag = false;
				
				String check;
				if(playerX)
					check = "X";
				else
					check = "O";
					
				//check for a row win
				for(int i = 0; i < num; i++)
				{
					if(theButtons[r][i].getText().equals(check))
						winr = true;
					else
					{
						winr = false;
						break;
					}
				}
				
				//check for a column win
				for(int i = 0; i < num; i++)
				{
					if(theButtons[i][c].getText().equals(check))
						winc = true;
					else
					{
						winc = false;
						break;
					}
				}
				
				//check if the position is in a diagonal
				if((r == c) || (r+c) == num-1)
					indiag = true;
				
				if (indiag)
				{
					//top right to bottom left diagonal
					for(int i = 0; i < num; i++)
					{
						if(theButtons[i][i].getText().equals(check))
							wind = true;
						else
						{
							wind = false;
							break;
						}
					}
					
					if(!wind)
					{
						//bottom right to top left diagonal
						int k = 0;
						for(int i = (num - 1); i >= 0; i--)
						{
							if(theButtons[i][k].getText().equals(check))
								wind = true;
							else
							{
								wind = false;
								break;
							}
							
							k++;
						}
					}
				}
				
				//System.out.println("Row: " + winr);
				//System.out.println("Col: " + winc);
				//System.out.println("Diag: " + wind);
				
				if(winr || winc || wind)
				{
					if(playerX)
					{
						move.setText("X wins!");
						pX.addWins();
						pO.addLoss();
					}
					else
					{
						move.setText("O wins!");
						pO.addWins();
						pX.addLoss();
					}

					//disable the buttons
					for (int i = 0; i < theButtons.length; i++)
					{
						for(int k = 0; k < theButtons[i].length; k++)
						{
							theButtons[i][k].setEnabled(false);
						}
					}		
				
					//disable the undo button
					undo.setEnabled(false);
				}
				
				S1.setText(pX.toString());
				S2.setText(pO.toString());

				
				//check for a stalemate
				boolean stale = false;
				if (moves == num*num)
				{
					for (int i = 0; i < theButtons.length; i++)
					{
						for(int k = 0; k < theButtons[i].length; k++)
						{
							if (theButtons[i][k].getText().equals("X") || theButtons[i][k].getText().equals("O"))
								stale = true;
							else
							{
								stale = false;
								break;
							}
						}
					}
				}
				
				if (stale)
				{
					move.setText("Stalemate!");
					
					for (int i = 0; i < theButtons.length; i++)
					{
						for(int k = 0; k < theButtons[i].length; k++)
						{
							theButtons[i][k].setEnabled(false);
						}
					}
					
					undo.setEnabled(false);
					pX.addStale();
					pO.addStale();
					S1.setText(pX.toString());
					S2.setText(pO.toString());

				}
			}
			
			playerX = !playerX;
		
		}
	}
	
	class gameListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JButton b = (JButton) e.getSource();
			if (b == newg)
			{

				//reset all the buttons to display no text
				for (int i = 0; i < theButtons.length; i++)
				{
					for(int k = 0; k < theButtons[i].length; k++)
					{
						theButtons[i][k].setEnabled(true);
						theButtons[i][k].setText(" ");
						
					}
				}
				
				//clear all moves
				moveList.clear();
				moves = 0;
				
				//disable the undo button
				undo.setEnabled(false);
				
				//alternate whether X or O goes first
				firstX = !firstX;
				if (firstX)
				{
					move.setText("X goes first");
					playerX = true;
				}	
				else
				{
					move.setText("O goes first");
					playerX = false;
				}
			}
					
			if (b == undo)
			{
				//undo the last move
				if(moves > 0)
				{
					
					int r = (int) moveList.get(0);
					int c = (int) moveList.get(1);
					
					theButtons[r][c].setText(" ");
					playerX = !playerX;
					if (playerX)
					{
						move.setText("X goes next");
					}
					else
						move.setText("O goes next");
					
					moveList.remove(0);
					moveList.remove(0);
					
					moves--;
					if (moves == 0)
						undo.setEnabled(false);
				}
				else
				{
					undo.setEnabled(false);
				}
			}
		}
	}

	public static void main(String[] args)
	{
		//int n = Integer.parseInt(args[0]);
		//new TicTacToe(n);
	}

    //method added for testing
    public boolean pushButton(int x, int y){
        theButtons[x][y].doClick();
        return true;
    }

    public String getMoveTxt(){
        return(move.getText());
    }

    public String[] getScore() {
        return new String[] {S1.getText(), S2.getText()};
    }

    public void newGame(){
        newg.doClick();
    }

    public TPlayer[] getPlayers(){
        return new TPlayer[] {pX,pO};
    }
}