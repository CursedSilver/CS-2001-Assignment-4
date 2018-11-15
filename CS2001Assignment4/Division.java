import java.util.ArrayList;
/**
 * Write a description of class Division here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Division
{
    // instance variables - replace the example below with your own
    private int x;
    private String DivisionName;
    private ArrayList<Team> teamList;  

    /**
     * Constructor for objects of class Division
     */
    public Division(String DivisonName, ArrayList<Team> teams)
    {
        // initialise instance variables
        this.DivisionName = DivisionName;
        this.teamList = teams;
        
    }
    //TODO Add a Team
    //TODO Get Divison Standings
    //TODO Remove a Team
    //TODO Change Divison name?
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void AddTeam (String teamName, ArrayList<Player> players, String coachName, String gender, int goalDifference )
    {
        // put your code here
        Team newTeam = new Team(teamName, players, coachName, gender, goalDifference);
        teamList.add(newTeam);
    }
}
