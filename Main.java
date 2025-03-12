import java.util.Random;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        Random rand = new Random();
        
        Dog dog = new Dog("Millie", "Chiuhuahua", 11, 4, "male",rand.nextInt(50, 100));
        Cat cat = new Cat("Minky", "Tabby", 2, "Long", "Female", rand.nextInt(50, 100));
        
        System.out.println(cat.getName() + " has " + cat.getHp() + " hp");
        System.out.println(dog.getName() + " has " + dog.getHp() + " hp");
        
        while (dog.isAlive() && cat.isAlive())
        {
            dog.attack(cat);
            cat.attack(dog);
            
            if (!cat.isAlive() && dog.isAlive())
            {
                System.out.println("The cat has been defeated");
                break;
            }
        
            else if (!dog.isAlive() && cat.isAlive())
            {
                System.out.println("The dog has been defeated");
                break;
            }
            
            else if(!cat.isAlive() && !dog.isAlive())
            {
                System.out.println("Its a tie, they are both dead!");
                break;
            }
        }
    }
}
