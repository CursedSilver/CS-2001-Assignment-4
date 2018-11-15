import java.util.ArrayList;
import java.util.Iterator;
/**
 * Keeps a roster of players and a coach. 
 * Also tracks match wins & loses and goals scored.
 *
 * @author JohnRoss Gillespie &
 * @version 1
 */
public class Team
{
    // instance variables - replace the example below with your own
    private String teamName;
    private Coach teamCoach;
    private int points;
    private ArrayList<Player> Roster;

    /**
     * Constructor for objects of class Team
     */
    public Team(String teamName, ArrayList<Player> players, String coachName, String gender)
    {
        this.teamName = teamName;
        this.Roster = players;
        Coach teamCoach = new Coach(coachName, gender);
        
    }
    
    public void display()
    {
        
        
        Iterator iterator = Roster.iterator(); 
        
    }
    //TODO Add goals
    //TODO Remove player
    //TODO Add match points
    //TODO Remove match points
    /**
     * 
     */
    public void addPlayer(String playerName, int playerNumber)
    {
        // put your code here
        
    }
}
