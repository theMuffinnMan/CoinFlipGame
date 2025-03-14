
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class main
     */
    public static void main (String[] args)
    {
        // initialise instance variables
        Coin coin1 = new Coin("Gold ");
        Coin coin2 = new Coin("Silver ");
        
        System.out.println("Gold coin Vs. Silver coin \nFirst to 3 heads wins");
        
        while(coin1.getPoints() < 3 && coin2.getPoints() < 3){
            coin1.flip();
            coin2.flip();
            System.out.println("  GOLD COIN : " + coin1.getFaceValue());
            System.out.println("SIlVER COIN : " + coin1.getFaceValue());
            if(coin1.getPoints() == 3 && coin2.getPoints() < 3){
                System.out.println("Gold Coin wins");
            }
            else if(coin2.getPoints() == 3 && coin1.getPoints() < 3){
                System.out.println("Silver Coin wins");
            }
            else if(coin1.getPoints() == 3 && coin2.getPoints() == 3){
                System.out.println("Its a draw!");
            }
        }
    }

    /**
     * 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
