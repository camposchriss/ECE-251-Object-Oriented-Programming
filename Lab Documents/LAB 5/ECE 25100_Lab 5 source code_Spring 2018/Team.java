public class Team {
    //These are the instance variables
    private String name;
    private int  wins, losses, ties; 
    //These are the get and set methods
    public String getName() { return name; }
    public int    getWins() { return wins; }
    public int    getLosses() { return losses; }
    public int    getTies() { return ties; }
    
    public void   setName(String aName) { name = aName; }
    public void   setWins(int numWins) { wins = numWins; }
    public void   setLosses(int numLosses) { losses = numLosses; }
    public void   setTies(int numTies) { ties = numTies; }

    //This is the constructor
    public Team(String aName) {
        name = aName;
        wins = losses = ties = 0;
    }

    //This is the toString method that specifies the appearance of the Team
    public String toString() {
        return("The " + name + " have " + wins + " wins, " + losses +
               " losses and " + ties + " ties.");
    }

    //This returns the total number of points for the team
    public int totalPoints() {
        return (wins * 2 + ties);
    }

    //This returns the total number of games played by the team
    public int gamesPlayed() {
        return (wins + losses + ties);
    }
    

}

