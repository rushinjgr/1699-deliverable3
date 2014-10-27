//TPlayer class stores name and stats for both players

public class TPlayer
{
	private String name;
	private int wins;
	private int loss;
	private int stale;
	
	public TPlayer(String n)
	{
		name = n;
		wins = 0;
		loss = 0;
		stale = 0;
	}
	
	public void addWins()
	{
		wins++;
	}
	
	public void addLoss()
	{
		loss++;
	}
	
	public void addStale()
	{
		stale++;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getWins()
	{	
		return wins;
	}
	
	public int getLoss()
	{
		return loss;
	}
	
	public int getStale()
	{
		return stale;
	}
	
	public String toString()
	{
		String s = "Wins: " + wins + " \nLosses: " + loss + " \nStalemates: " + stale;
		return s;
	}
}