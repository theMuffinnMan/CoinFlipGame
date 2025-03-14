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
    private int faceValue;
    private int points;
    private String face;

    /**
     * Constructor for objects of class Coin
     */
    public Coin(String Colour)
    {
        // initialise instance variables
        Colour = colour;
        points = 0;
        flip();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void flip()
    {
        //get random number which corrosponds to coin side
        Random rand = new Random();
        
        faceValue = rand.nextInt(0,1);
        if (faceValue == 0){
            awardPoints();
        }
    }
    
    /**
     * faceValue getter
     */
    public String getFaceValue(){
        if(faceValue == 0){
            return "HEADS";
        }
        else{
            return "TAILS";
        }
    }
    
    /**
     * COLOUR GETTER getter
     */
    public String getColour(){
        return colour;
    } 
    
    /**
     * points getter
     */
    public int getPoints(){
        return points;
    }

    /**
     * points awarding
     */
    public void awardPoints(){
        points += 1;
    }
}
