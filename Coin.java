import java.util.Random;
/**
 * Write a description of class Coin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coin
{
    // instance variables - replace the example below with your own
    private String side;
    private String colour;
    private int number;

    /**
     * Constructor for objects of class Coin
     */
    public Coin(String Colour)
    {
        // initialise instance variables
        Colour = colour;
        flip();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int flip()
    {
        //get random number which corrosponds to coin side
        Random rand = new Random();
        
        int number = rand.nextInt(2);
        return number;
    }
}
