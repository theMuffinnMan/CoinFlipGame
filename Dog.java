import java.util.Random;
/**
 * Dog has a breed, hairlength, age, sex, and name.
 * it can bark, and it can say its age.
 *
 * @author Fleur
 * @version 20/2/2025
 */
public class Dog
{
    // instance variables - feilds
    private String name;
    private String breed;
    private String sex;
    private int age;
    private double hairlength;
    private int health;

    /**
     * Constructor for objects of class Dog
     */
    public Dog(String nm, String bd, double hair, int years, String gender, int hp)
    {
        // initialise instance variables (INITIALISATION)
        name = nm;
        breed = bd;
        hairlength = hair;
        age = years;
        sex = gender;
        health = hp;
    }

    /**
     * make the dog bark
     */
    public void bark (){
        System.out.println(name + " Mong Mong");
    }
    
    public void  getAge(){
        System.out.println(name + " is " + age + " years old");
    }
    
    /*
     * convert human years to dog years
     */
    public double humanTDogYears(){
        double dogYears;
        if(age <=2){
            dogYears = age * 10.5;
            
        }else{
            dogYears = (age - 2) * 4 + 21;
        }
        return dogYears;
    }
    
    /*
     * Attack a cat, dealing a fixed amount of damage
     * 
     * @param cat the Cat object to attack
     */
    public void attack(Cat cat)
    { 
        int damage = 15; //dealt by the dog
        System.out.println(name + " attack " + cat.getName() + " for " + damage + " damage!");
        cat.getDamage(damage);
    }
    
    public void getDamage(int damage){
            health -= damage;
            if (health < 0){
            health = 0;
        }
        System.out.println(name + " has " + health + " HP left.");
    }
    /*
    * check if hte dog is still alive
    */
     public boolean isAlive()
    {
        return health > 0;
    }
    
    /*
    * name getter
    */
    public String getName(){
        return name;
    }

    
    /*
     * main function
     */
    public static void main(String[] args){
        Dog dog1 = new Dog("Edwin", "Border Collie", 0.4, 7, "Male", 87);
        
        dog1.bark();
        dog1.getAge();
        dog1.humanTDogYears();
        System.out.println(dog1.name + " is " + dog1.humanTDogYears() + " dog years old ");
    }
    
    /*
    * hp getter
    */
    public int getHp(){
        return health;
    }
}
