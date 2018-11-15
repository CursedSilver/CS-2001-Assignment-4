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
    private static ArrayList<String> playerNames = new ArrayList<>();
    Random random;
    
    /**
     * Constructor for objects of class LeagueTester
     */
    public LeagueTester()
    {
        
    }
    //TODO Create a list of random player names
    //TODO Create a list of random team names
    //TODO Create a list of numbers
    //TODO Create a random player
    //TODO Create a random Coach
    //TODO Create a random Team
    //TODO Create a random League
        
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
