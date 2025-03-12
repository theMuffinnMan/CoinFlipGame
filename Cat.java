
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat
{
    // instance variables - replace the example below with your own
    private String name;
    private String colour;
    private int age;
    private String breed;
    private String sex;
    private int health;

    /**
     * Constructor for objects of class Cat
     */
    public Cat(String nm, String color, int years, String bd, String sx, int hp){
    
        // initialise instance variables
        name = nm;
        colour = color;
        age = years;
        breed = bd;
        sex = sx;
        health = hp;
    }

    /**
     * make the cat bark
     */
    public void bark (){
        System.out.println(name + " Bark");
    }
    
    /**
     * the cat says its age
     */
    public void sayAge (){
        System.out.println("i am " + age + " years old");
    }
    /*
     * convert human years to cat years
     */
    public double humanToCatYears(){
        double catYears;
        if(age == 1){
            catYears = 15;
            
        }else if(age == 2){
            catYears = 24;
        }else{
            catYears = (age - 2) * 4 + 24;
        }
        return catYears;
    }
    
    /*
     * Attack a dog, dealing a fixed amount of damage
     * 
     * @param cat the Dog object to attack
     */
    public void attack(Dog dog)
    { 
        int damage = 15; //dealt by the cat
        System.out.println(name + " attack " + dog.getName() + " for " + damage + " damage!");
        dog.getDamage(damage);
    }
    
    public void getDamage(int damage){
            health -= damage;
            if (health < 0){
            health = 0;
        }
        System.out.println(name + " has " + health + " HP left.");
    }
    
    /*
    * check if hte cat is still alive
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
    * hp getter
    */
    public int getHp(){
        return health;
    }
}
