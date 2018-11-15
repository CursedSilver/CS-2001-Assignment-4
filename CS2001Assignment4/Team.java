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
        
        System.out.println("Current Roster for " + teamName + ":");
        System.out.println("Coach: ");
        teamCoach.display();
        System.out.println("Players: ");
        while (iterator.hasNext())
            System.out.println(iterator.next() + " ");
        
        
    }
    //TODO Add goals
    //TODO Remove player
    //TODO Add match points
    //TODO Remove match points
    /**
     * Adds a player to the Roster
     */
    public void addPlayer(String playerName, String playerNumber)
    {
        // put your code here
        Player player = new Player(playerName, playerNumber);
        Roster.add(player);
    }
}
