import java.util.ArrayList;
/**
 * Write a description of class League here.
 *
 * @author JohnRoss Gillespie & Hussein AbdelRahman 
 * @version 1
 */
public class League
{
    // instance variables - replace the example below with your own
    private String leagueName;
    
    private ArrayList<Division> divisions;
    
    /**
     * Constructor for objects of class League
     */
    public League(String leagueName, ArrayList<Division> divisoins)
    {
        this.leagueName = leagueName;
        this.divisions = divisions;
        
    }
    
    
    /**
     * Adds Divisons to the League
     * @param DivisionName Name of the Divison
     * @param teams Teams in the division
     */
    public void addDivision(String DivisionName, ArrayList<Team> teams)
    {
        Division newDivision = new Division (DivisionName, teams);
        divisions.add(newDivision);
    }
 
    //TODO Remove a Divison
    //TODO Get Divison Standings

}
