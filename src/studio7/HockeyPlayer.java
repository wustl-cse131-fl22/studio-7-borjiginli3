package studio7;

public class HockeyPlayer {
	
	private String name;
	private int number;
	private String hand;
	public int goals;
	public int assists;
	public int points;
	public int games;
	
	public void gameFinish(int gamesPlayed, int goalsScored, int assistsHad) {
		games = games + gamesPlayed;
		goals = goals + goalsScored;
		assists = assists + assistsHad;
		points = points + goalsScored + assistsHad;
	}

}
