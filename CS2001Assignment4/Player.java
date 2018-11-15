
/**
 * A player of a team, has a name and number.
 *
 * @author JohnRoss Gillespie
 * @version 1
 */
public class Player extends Person
{
    // instance variables - replace the example below with your own
    private String number;
    /**
     * Constructor for objects of class Player
     */
    public Player(String name, String number)
    {
        // initialise instance variables
        super(name);
        this.number = number;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void display()
    {
        super.display();
        
        System.out.println("Number: " + number);
    }
}
