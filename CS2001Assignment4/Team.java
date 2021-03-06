import java.util.ArrayList;
import java.util.Iterator;
/**
 * Keeps a roster of players and a coach. 
 * Also tracks match wins & loses and goals scored.
 *
 * @author JohnRoss Gillespie & Hussein AbdelRahman 
 * @version 1
 */
public class Team
{
    private String teamName;
    private Coach teamCoach;
    private ArrayList<Player> roster;
    private int goals;
    private int matchPoints;   

    /**
     * Constructor for objects of class Team
     */
    public Team(String teamName, ArrayList<Player> players, String coachName, String gender)
    {
        this.teamName = teamName;
        this.roster = players;
        Coach teamCoach = new Coach(coachName, gender);
        goals = 0;
        matchPoints = 0;
    }
    
    /**
     * Displays the team's coach and roster
     */
    public void display()
    {
        
        Iterator iterator = roster.iterator(); 
        
        System.out.println("Current Roster for " + teamName + ":");
        System.out.println("Coach: ");
        teamCoach.display();
        System.out.println("Players: ");
        while (iterator.hasNext())
            System.out.println(iterator.next() + " ");
        
    }

    /**
     * Adds goals of new match
     * 
     * @param newGoals Goals scored in current Match
     */
    public void addGoals(int newGoals)
    {
        goals = goals + newGoals;
    }
    
    /**
     * Adds a win result points to the teams current total
     * 
     * @param newMatchPoints Points scored from the current match
     */
    public void addWin()
    {
        matchPoints = matchPoints + 3;
    }
    
     /**
     * Adds a win result points to the teams current total
     * 
     * @param newMatchPoints Points scored from the current match
     */
    public void addDraw()
    {
        matchPoints = matchPoints + 1;
    }
    
    /**
     * Adds a player to the Roster
     * 
     * @param playerName Player's name
     * @param playerNumber Player's number
     */
    public void addPlayer(String playerName, String playerNumber)
    {
        if (roster.size() < 22){
            Player player = new Player(playerName, playerNumber);
            roster.add(player);
        }
    }
    
    /**
     * Removes match points from the teams current total
     * 
     * @param newMatchPoints
     */
    public void removeMatchPoints(int newMatchPoints)
    {
        if(matchPoints > 0){
            matchPoints = matchPoints - newMatchPoints;
        }
    }
    
    /**
     * Checks if the number is used by another player on the team.
     * 
     * @param player The player in question
     */
    public boolean numberCheck(Player player)
    {
        if(roster.contains(player.getNumber())){
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * returns the name of the team
     */
    public String getName()
    {
        return teamName;
    }

    /**
     * returns the current points of the team
     */
    public int getPoints()
    {
        return matchPoints;    
    
    }
    
    /**
     * returns the current points of the team
     */
    public int getGoals()
    {
        return goals;    
    
    }



}

