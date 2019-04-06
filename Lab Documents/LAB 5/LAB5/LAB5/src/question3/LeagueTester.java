//import java.util.ArrayList;
package question3;
public class LeagueTester {
public static void main(String args[]) {
    Team team1, team2;
    League aLeague = new League("");
    //Add a pile of teams to the league
    aLeague.addTeam(team1 = new Team("Chicago Bulls"));
    aLeague.addTeam(new Team("Detroit Pistons"));
    aLeague.addTeam(new Team("New Jersey Nets"));
    aLeague.addTeam(new Team("Toronto Raptors"));
    aLeague.addTeam(new Team("New York Knicks"));
    aLeague.addTeam(new Team("Atlanta Hawks"));
    aLeague.addTeam(new Team("Boston Celtics"));
    aLeague.addTeam(team2 = new Team("Indiana Pacers"));

    //Lets display things now
    System.out.println("Here is the League:");
    System.out.println(aLeague.toString());
    System.out.println("\nBefore the game starts, here are the teams:");
    aLeague.showTeams();

    //Now we'll record some games
    aLeague.recordWinAndLoss("Chicago Bulls", "Detroit Pistons");
    aLeague.recordWinAndLoss("New Jersey Nets", "Toronto Raptors");
    aLeague.recordTie(team1, team2);
    aLeague.recordWinAndLoss("Chicago Bulls", "New York Knicks");
    aLeague.recordWinAndLoss("Chicago Bulls", "Atlanta Hawks");
    aLeague.recordTie("Boston Celtics", "New York Knicks");
    aLeague.recordTie("Detroit Pistons", "Indiana Pacers");
    aLeague.recordWinAndLoss("Indiana Pacers", "New Jersey Nets");
    aLeague.recordWinAndLoss("Indiana Pacers", "Chicago Bulls");
    aLeague.recordWinAndLoss("Indiana Pacers", "Toronto Raptors");
    aLeague.recordWinAndLoss("Indiana Pacers", "Boston Celtics");

    //Now display the teams again
    System.out.println("\nAfter the game is over, here are the teams:");
    aLeague.showTeams();

    //Here are some statistics
    System.out.println("\nThe total number of games played is " + aLeague.totalGamesPlayed());
    System.out.println("\nThe first place team is " + aLeague.firstPlaceTeam());
    System.out.println("The last place team is " + aLeague.lastPlaceTeam());
    System.out.println("The team that played the most was "+ aLeague.teamMostPlayed());
    
    //STEP 2 Q#
    //Find undefeated teams 
    Team[] undefeated = aLeague.undefeatedTeams();
    System.out.println("\nThere are " +undefeated.length +" undeated teams are as follows");
    if(undefeated.length>0) 
    {
    	for(int i=0; i<undefeated.length; i++)
    	{
    		System.out.println("" +undefeated[i]);
    	}
    }
    
    //Step 3 q3
    
    aLeague.showTable();
    
    //Step 4
    
    System.out.println(aLeague.havePlayedTogether("Chicago Bulls", "Boston Celtics"));
    System.out.println(aLeague.havePlayedTogether("New York Knicks","Detroit Pistons"));
    System.out.println(aLeague.havePlayedTogether("Detroit Pistons","Atlanta Hawks"));
    System.out.println(aLeague.havePlayedTogether("Chicago Bulls", "New York Knicks"));
    System.out.println(aLeague.havePlayedTogether("Atlanta Hawks", "New York Knicks"));
    System.out.println(aLeague.havePlayedTogether("Indiana Pacers", "Boston Celtics"));
    System.out.println(aLeague.havePlayedTogether("Toronto Raptors", "New Jersey Nets"));
    System.out.println(aLeague.havePlayedTogether("New Jersey Nets", "New York Knicks"));
    System.out.println(aLeague.havePlayedTogether("Boston Celtics","Detroit Pistons"));
    System.out.println(aLeague.havePlayedTogether("Detroit Pistons", "New Jersey Nets"));
    System.out.println(aLeague.havePlayedTogether("I Love 2017", "Frank"));
    System.out.println(aLeague.havePlayedTogether("Chicago Bulls","Chicago Bulls"));


}
}