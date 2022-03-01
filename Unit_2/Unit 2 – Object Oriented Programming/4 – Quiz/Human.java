/**
* Name: Lucas Lu and mohsen Ameli
* Date: Feb.28
* Description: In this Human class, I will create a contrustor, several attributes, Accessors include getName(), getWeight()
* getEnergyLvl(), getSex(), getAge(), and several Mutators include setEneregyLvl, sleep, run and toString method. In main method, I 
* will reate two Human objects and assign some values to it, then test all the methods, accessors and mutators
* attention: in this program, the energy level always greater than 0% and lower than 100%
*/

public class Human {
    /*
    * Attributes
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
     * create a human constructor with several paramters
     * @param name String type the name of the human
     * @param weight Double type the weight of the human
     * @param energyLvl the energy level of the human
     */
    public Human() {
        this.name       = "";
        this.weight     = -1;
        this.energyLvl  = -1;
    }
    public Human(String name, double weight, int energyLvl) {
        this.name       = name;
        this.weight     = weight;
        this.energyLvl  = energyLvl;
    }

    /*
    * Accessors
    */

    /** get the name attribute value in class
     * @return the name of the human
     */
    public String getName() {
        return this.name;
    }
    /** get the weight attribute value in class
     * @return the weight of the human
     */
    public double getWeight() {
        return this.weight;
    }
    /** get the energyLvl attributes value in class
     * @return the energyLvl of the human
     */
    public int getEnergyLvl() {
        return this.energyLvl;
    }


    /**
     * Mutators
     */

    /**
     * make some restrictions to energylevel to make sure it is limited between 0 to 100
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
        
        //modify attributes value so that it always inside the boundary (0-100)
        setEneregyLvl(this.energyLvl); 
    }
    
    /**
     * after running 1km, the person will lose 0.001kg in weight, calculating current weight after running
     * @param km distance in which the human ran
     */
    public void run(double km) {
        this.energyLvl = (int) (this.energyLvl - (km * 0.3));
        this.weight = this.weight - (0.001 * km);
    }
    
    /**
     * after running 1km, the person will lose 0.001kg in weight, calculating current weight after running
     * @param km distance in which the human ran
     */
    public void eat(Vegetable veg, double grams) {
        // adding the weight of the vegetable to the human
        this.weight = this.weight + veg.getWeight();
        
        // adding energy level
        this.energyLvl = this.energyLvl + (int) ((veg.getCalories() * 0.1 / 15));
    }

    /**
     * returns all the attributes of the human in a String
     * @return a String with all attributes
     */
    public String toString() {
        return ("\nName: " + this.name + "\nWeight: " + this.weight + " kg\nEnergy Level: " + Math.round(this.energyLvl) + "%");
    }
}