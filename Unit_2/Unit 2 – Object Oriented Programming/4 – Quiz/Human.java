/**
* Name: Lucas Lu and mohsen Ameli
* Date: Feb 28, 2022
* Description: In this Human class, I will create a contrustor, several attributes, Accessors include getName(), getWeight()
* getEnergyLvl(), getSex(), getAge(), and several Mutators include setEneregyLvl, sleep, run and toString method. In main method, I 
* will reate two Human objects and assign some values to it, then test all the methods, accessors and mutators
* attention: in this program, the energy level always greater than 0% and lower than 100%
*/

public class Human {
    /*
    Attributes
    */
    
    /** Name of the human */
    private String name;
    /** Weight in kilograms */
    private double weight;
    /** Energy level from 0-100 */
    private int energyLvl;

    /** 
     * Constructor
     */

    /**
     * Default human constructor
     */
    public Human() {
        this.name       = "";
        this.weight     = -1;
        this.energyLvl  = -1;
    }
    /**
     * create a human constructor with several paramters
     * @param name String type the name of the human
     * @param weight Double type the weight of the human
     * @param energyLvl the energy level of the human
     */
    public Human(String name, double weight, int energyLvl) {
        this.name       = name;
        this.weight     = weight;
        this.energyLvl  = energyLvl;
    }

    /*
    * Accessors
    */

    /** gets the name of the current human
     * @return the name of the human
     */
    public String getName() {
        return this.name;
    }
    /** gets the weight of the current human
     * @return the weight of the human
     */
    public double getWeight() {
        return this.weight;
    }
    /** gets the energyLvl of the current human
     * @return the energyLvl of the human
     */
    public int getEnergyLvl() {
        return this.energyLvl;
    }


    /**
     * Methods
     */

    /**
     * making restrictions to energylevel to make sure it is limited between 0-100%
     * @param energy the new energy level
     */
    public void setEneregyLvl(int energy) {
        if (energy > 100) { // user inputed a value greater than 100
            this.energyLvl = 100;
        } else if (energy < 0) { // user inputed a value less than 0
            this.energyLvl = 0;
        } else { // setting user's new energy level
            this.energyLvl = energy;
        }
    }

    /**
     * calculate the energy level with the sleep hours
     * @param hrs int type hours of sleep
     */
    public void sleep(int hrs) {
        // increasing the energy level by 10% per hour
        double new_energy = hrs * 0.1; //calculate how many percentages should be boost
        this.energyLvl = (int) (this.energyLvl * (1 + new_energy)); //calculate the final energy Level
        
        // checking the energy level so it's always inside the boundary 0-100%
        setEneregyLvl(this.energyLvl); 
    }
    
    /**
     * after running n km, the person will lose 0.001kg in weight, and 3% of their energy
     * @param km distance in which the human runs for
     */
    public void run(double km) {
        double energy = 3 * this.energyLvl / 100; // 3% of human's energy level
        this.energyLvl = this.energyLvl - (int) (energy * km); // decreasing energy level

        // checking the energy level so it's always inside the boundary 0-100%
        setEneregyLvl(this.energyLvl); 

        // decreasing weight
        this.weight = this.weight - (0.001 * km);
    }
    
    /**
     * Human eats a vegetable
     * @param veg Vegetable class that the human is tryna eat
     * @param grams how much of the vegetable the human is eating
     */
    public void eat(Vegetable veg, double grams) {
        // converting human's kg to grams, 
        // then adding the weight of the vegetable to the human
        this.weight = (this.weight * 1000 + grams) / 1000;
        
        // adding energy level
        int cal = veg.eaten(grams); // getting how much calories the vegetable gives
        
        if (cal != -1) { // vegetable was eaten successfuly
            this.energyLvl = this.energyLvl + (int) Math.round(0.01 * cal / 15 * 100); // updating human's energy levels
            
            // checking the energy level so it's always inside the boundary 0-100%
            setEneregyLvl(this.energyLvl); 
        } else { // dont' have enough food
            System.out.println("I don't have that much food");
        }
    }

    /**
     * Human eats a cookie
     * @param food Cookie class that the human is tryna eat
     * @param grams how much of the cookie the human is eating
     */
    public void eat(Cookie food, double grams) {
        // converting human's kg to grams, 
        // then adding the weight of the cookie to the human
        this.weight = (this.weight * 1000 + grams) / 1000;
        
        // adding energy level
        int cal = food.eaten(grams); // getting how much calories the cookie gives

        if (cal == -1) { // dont' have enough food
            System.out.println("I don't have that much food");
        } else if (cal == -2) { // the cookie is still packaged
            System.out.println("I can't eat the bag");
        }
        else { // cookie was eaten successfuly
            this.energyLvl = this.energyLvl + (int) Math.round(0.01 * cal / 15 * 100); // updating human's energy levels

            // checking the energy level so it's always inside the boundary of 0-100%
            setEneregyLvl(this.energyLvl); 
        }
    }

    /**
     * prints out all the attributes of the human as a String
     * @return a String with all attributes
     */
    public String toString() {
        return ("Name: " + this.name + "\nWeight: " + this.weight + " kg\nEnergy Level: " + Math.round(this.energyLvl) + "%");
    }
}