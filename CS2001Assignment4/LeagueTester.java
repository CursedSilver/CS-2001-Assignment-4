import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class LeagueTester here.
 *
 * @author JohnRoss Gillespie &
 * @version 1
 */
public class LeagueTester
{
    // instance variables - replace the example below with your own
    private String leagueName;
    private ArrayList<String> coachNames = new ArrayList<>();
    private ArrayList<String> playerNames = new ArrayList<>();
    private ArrayList<String> teamNames = new ArrayList<>();
    private ArrayList<String> divisionNames = new ArrayList<>();
    private ArrayList<String> leagueNames = new ArrayList<>();
    Random random;
    
    /**
     * Constructor for objects of class LeagueTester
     */
    public LeagueTester()
    {
        coachNames.add("Mr. Meesiks"); coachNames.add("Bird Person"); coachNames.add("Jerry");
        coachNames.add("Ralph"); coachNames.add("Micheal"); coachNames.add("Eric"); 
        coachNames.add("Brendan"); coachNames.add("Devin"); coachNames.add("Karl");
        
        playerNames.add("John"); playerNames.add("Paul"); playerNames.add("Dawn");
        playerNames.add("Shawn"); playerNames.add("Jake"); playerNames.add("Chris");
        playerNames.add("David"); playerNames.add("Ben"); playerNames.add("Ross");
        playerNames.add("Greg"); playerNames.add("Klean"); playerNames.add("Tim");
        
        teamNames.add("Ninja's"); teamNames.add("Subs"); teamNames.add("Tat Army");
        teamNames.add("Morty's Smashers"); teamNames.add("Rick's Boys"); teamNames.add("Stark Army");
        teamNames.add("The Infamous"); teamNames.add("The Swift"); teamNames.add("The Dapper Marines");
        teamNames.add("The Grand Moons"); teamNames.add("The Fearless"); teamNames.add("The Sparks");
        
        divisionNames.add("Martell"); divisionNames.add("Baratheon"); divisionNames.add("Tyrell");
        divisionNames.add("GreyJoy"); divisionNames.add("Lannister"); divisionNames.add("Targaryen");
        
        leagueNames.add("Champion's League"); leagueNames.add("MLS"); leagueNames.add("FIFA"); 
        leagueNames.add("USSF"); leagueNames.add("We Can't Agree"); leagueNames.add("Team Redundant Team");
        
        
    }
    //TODO Create a random player
    //TODO Create a random Coach
    //TODO Create a random Team
    //TODO Create a random League
    private Coach randomCoach()
    {
    }
    private Player randomPlayer()
    {
    }
    private Team randomTeam(int numPlayers)
    {
    }
    private League createLeague(int numDivisons, int numTeams, int numPlayers)
    {
        return new League(leagueName, divisions);
    }
    public League leagueSetup()
    {
        this.random = new Random();
        return createLeague(4, 6, 22);
    }
}
