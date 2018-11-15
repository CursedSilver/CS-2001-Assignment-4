
/**
 * A player of a team, has a name and number.
 *
 * @author JohnRoss Gillespie
 * @version 1
 */
public class Player extends Person
{
    private String number;
    /**
     * Constructor for objects of class Player
     * 
     * @param name Name of the player
     * @param number Number of the player
     */
    public Player(String name, String number)
    {
        // initialise instance variables
        super(name);
        this.number = number;
    }

    /**
     * Displays player's name and number
     */
    public void display()
    {
        super.display();
        
        System.out.println("Number: " + number);
    }
}
