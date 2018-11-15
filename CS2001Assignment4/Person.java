
/**
 * The description of a person. 
 *
 * @author JohnRoss Gillepsie &
 * @version 1
 */
public class Person
{
    private String name;

    /**
     * Creates a person object
     * 
     * @param name Name of the person
     */
    public Person(String name)
    {
        // initialise instance variables
        this.name = name;
    }

    /**
     * Displays the name of the the person
     */
    public void display()
    {
        System.out.println("Name:" + name);
    }
}
