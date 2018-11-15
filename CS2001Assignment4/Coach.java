
/**
 * Write a description of class Coach here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coach extends Person
{
    // instance variables - replace the example below with your own
    private String gender;

    /**
     * Constructor for objects of class Coach
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
