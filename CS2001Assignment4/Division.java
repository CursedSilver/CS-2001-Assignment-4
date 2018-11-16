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
        this.DivisionName = DivisionName;
        this.teamList = teams;
    }
    //TODO Get Divison Standings
    //TODO Remove a Team
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void AddTeam (String teamName, ArrayList<Player> players, String coachName, String gender)
    {
        Team newTeam = new Team(teamName, players, coachName, gender);
        teamList.add(newTeam);
    }
    
     /**
     * Adds a win result points to the teams current total
     * 
     * @param newMatchPoints Points scored from the current match
     */
    public void match(String Team1, String Team2, int goals1, int goals2)
    {  
     if(goals1 == goals2)
    {
            teamList.stream()
                         .filter(Team -> Team1.equals(Team.getName()))
                         .forEach(Team -> Team.addDraw());  
            teamList.stream()
                         .filter(Team -> Team2.equals(Team.getName()))
                         .forEach(Team -> Team.addDraw());
    }
        else{
            if(goals1 > goals2)
    {
        teamList.stream()
                         .filter(Team -> Team1.equals(Team.getName()))
                         .forEach(Team -> Team.addWin());
    }
    else
    {
        teamList.stream()
                         .filter(Team -> Team2.equals(Team.getName()))
                         .forEach(Team -> Team.addWin());        
    }
    }  
    }  
}


