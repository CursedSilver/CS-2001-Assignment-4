import java.util.ArrayList;

/**
 * Write a description of class Division here.
 *
 * @author JohnRoss Gillespie & Hussein AbdelRahman 
 * @version 1
 */
public class Division
{
    // instance variables - replace the example below with your own
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
     * Adds a team to the division
     *
     * @param  teamName Team's Name
     * @param  players players in the team
     * @param  coachName Name of team's coach
     * @param  gender Coach's gender
     * 
     * 
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
      teamList.stream()
                         .filter(Team -> Team1.equals(Team.getName()))
                         .forEach(Team -> Team.addGoals(goals1));  
      teamList.stream()
                         .filter(Team -> Team2.equals(Team.getName()))
                         .forEach(Team -> Team.addGoals(goals2));
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
    
    /**
     * Sorts teams according to points and displays their standing
     * 
     * 
     */
    public void getStanding()
    {
       
        
        
         
    }
}


