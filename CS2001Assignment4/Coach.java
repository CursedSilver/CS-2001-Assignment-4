
/**
 * Write a description of class Coach here.
 *
 * @author JohnRoss Gillespie &
 * @version 1
 */
public class Coach extends Person
{
    private String gender;

    /**
     * Constructor for objects of class Coach
     * 
     * @param name Name of the Coach
     * @param gender Gender  of the Coach
     */
    public Coach(String name, String gender)
    {
        super(name);
        
        this.gender = gender;
    }

    /**
     * Displays name and gender of the coach
     */
    public void display()
    {
        super.display();
        
        System.out.println("Gender: " + gender);
    }
}
