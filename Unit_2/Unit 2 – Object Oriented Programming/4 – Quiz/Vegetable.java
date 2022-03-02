/**
* Name: Mohsen Ameli
* Date: March 1, 2022
* Description: Basic vegetable class, with a name, some weight, and some calories
*/
public class Vegetable {
    /*
    Attributes
    */

    /** name of the vegetable */
    private String name;
    /** Weight in grams */
    private double weight;
    /** Number of calories */
    private int calories;


    /*
    Constructors
    */

    /**
     * Default constructor
     */
    public Vegetable() {
        this.name       = "";
        this.calories   = -1;
        this.weight     = -1;
    }
    /**
     * creates a basic vegetable objcet
     * @param name the name of it
     * @param calories amount of calories it has
     * @param weight its weight
     */
    public Vegetable(String name, double weight, int calories) {
        this.name       = name;
        this.weight     = weight;
        this.calories   = calories;
    }


    /*
    Accessors
    */

    /**
     * gets the name of the vegetable
     * @return the name of the vegetable
     */
    public String getName() {
        return this.name;
    }
    /**
     * gets the calories of the vegetable
     * @return the calories of the vegetable
     */
    public double getCalories() {
        return this.calories;
    }
    /**
     * gets the weight of the vegetable
     * @return the weight of the vegetable
     */
    public double getWeight() {
        return this.weight;
    }


    /*
    Methods
    */

    /**
     * vegetable being eaten
     * @return the amount of calories the vegetable gives
     */
    public int eaten(double weight) {
        // if requested weight is higher than the actual
        // weight of the vegetable, we return a value of -1
        if (weight > this.weight) {
            return -1;
        } else {
            // getting the percentage of the weight that the user has requested
            double weight_percentage = weight * 100 / this.weight;
            // getting the calories based on the percentage of the percentage
            double cal = weight_percentage * this.calories / 100;
            return (int) cal;
        }
    }
    /**
     * the important info of this vegetable
     * @return the important info of this vegetable
     */
    public String toString() {
        return ("Name: " + this.name + "\nWeight: " + this.weight + " kg\nCalories: " + this.calories);
    }
}
