public class League {
    private String name;
    private int    teamCount;
    private Team[] teams; 
   
    public String getName() { return(name); }
    public Team[] getTeams() { return(teams); }
    public void   setName(String aName) { name = aName; }

    public League(String aName) {
        name = aName;
        teamCount = 0;
        teams = new Team[8]; //This does not actually make any Team objects
    }

    //This is the toString method that specifies the appearance of the League
    public String toString() {
        return("The " + name + " league with " + teamCount + " teams.");
    }
    
    
    //This method adds a new team to the league
    public int addTeam(Team aTeam) {
    if (teamCount < 8) {
        teams[teamCount++] = aTeam;
        return teamCount;
    }
    return -1;
} 
 
//This method prints out all of the teams
    public void showTeams() {
    for(int i=0; i<teamCount; i++)
        System.out.println(teams[i].toString());
} 

    
    /******************   For LeagueTester1       *******************************/

//Record Win and Loss
public void recordWinAndLoss(Team winner, Team loser) {
    winner.setWins(winner.getWins() + 1);
    loser.setLosses(loser.getLosses() + 1);
} 
//Record a Tie game
public void recordTie(Team teamA, Team teamB) {
    teamA.setTies(teamA.getTies() + 1);
    teamB.setTies(teamB.getTies() + 1);
}



//Find the team with the given name.  If none exists, return null
public Team teamWithName(String aName) {
    for(int i=0; i<teamCount; i++) {
        if (teams[i].getName().equals(aName))
        return teams[i];
    }
    return null;
} 


//Record Win and Loss
public void recordWinAndLoss(String winner, String loser) {
    Team winningTeam, losingTeam; 
    if ((winningTeam = this.teamWithName(winner)) == null) {
        System.out.println("Invalid Team name: " + winner);
        return;
    }
    if ((losingTeam = this.teamWithName(loser)) == null) {
        System.out.println("Invalid Team name: " + loser);
        return;
    }
    recordWinAndLoss(winningTeam, losingTeam);
}

//Record a Tie game
public void recordTie(String teamAName, String teamBName) {
    Team teamA, teamB;

    if ((teamA = this.teamWithName(teamAName)) == null) {
        System.out.println("Invalid Team name: " + teamAName);
        return;
    }
    if ((teamB = this.teamWithName(teamBName)) == null) {
        System.out.println("Invalid Team name: " + teamBName);
        return;
    }
    recordTie(teamA, teamB);
}


//Return the total number of games played in the League
public int totalGamesPlayed() {
    int  total=0;
    for (int i=0; i<teamCount; i++)
        total += teams[i].gamesPlayed();
    return total/2;
} 
//Return the team with the most points
public Team firstPlaceTeam() {
    Team best;
    if (teamCount == 0)
        return null;//If there are no teams, then no team is in first place
    best = teams[0];
    for (int i=1; i<teamCount; i++) {
        if (best.totalPoints() < teams[i].totalPoints())
           best = teams[i];
    }
    return best;
}

//Return the team with the least points
public Team lastPlaceTeam() {
    Team worst;
    if (teamCount == 0)
        return null;//If there are no teams, then no team is in last place
    worst = teams[0];
    for (int i=1; i<teamCount; i++) {
        if (worst.totalPoints() > teams[i].totalPoints())
            worst = teams[i];
    }
    return worst;
}




}

