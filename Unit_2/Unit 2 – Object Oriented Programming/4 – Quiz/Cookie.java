/**
* Name: Mohsen Ameli
* Date: March 1, 2022
* Description: Basic cookie class, with a name, some weight,
* some calories, and whether or not it is packaged
*/
public class Cookie {
    /*
    Attributes
    */

    /** Name of the cookie */
    private String name;
    /** Weight in grams */
    private double weight;
    /** Number of calories */
    private int calories;
    /** Whether the cookie is packaged or not */
    private boolean isPackaged;


    /*
    Constructors
    */

    /**
     * Default constructor
     */
    public Cookie() {
        this.name       = "";
        this.calories   = -1;
        this.weight     = -1;
        this.isPackaged = false;
    }
    /**
     * Constructing an unpackaged cookie
     * @param name the name of the cookie
     * @param weight cookie's weight
     * @param calories amount of calories the cookie has
     */
    public Cookie(String name, double weight, int calories) {
        this.name       = name;
        this.weight     = weight;
        this.calories   = calories;
        this.isPackaged = false;
    }
    /**
     * Constructing a packaged cookie
     * @param name the name of the cookie
     * @param weight cookie's weight
     * @param calories amount of calories the cookie has
     * @param isPackaged Whether the cookie is packaged or not
     */
    public Cookie(String name, double weight, int calories, boolean isPackaged) {
        this.name       = name;
        this.weight     = weight;
        this.calories   = calories;
        this.isPackaged = isPackaged;
    }

    /*
    Accessors
    */
    
    /**
     * gets the name of the cookie
     * @return the name of the cookie
     */
    public String getName() {
        return this.name;
    }
    /**
     * gets the calories of the cookie
     * @return the calories of the cookie
     */
    public double getCalories() {
        return this.calories;
    }
    /**
     * gets the weight of the cookie
     * @return the weight of the cookie
     */
    public double getWeight() {
        return this.weight;
    }
    /**
     * gets the weight of the cookie
     * @return the weight of the cookie
     */
    public boolean getIsPackaged() {
        return this.isPackaged;
    }


    /*
    Methods
    */

    /**
     * opens the package if it's closed
     */
    public void open() {
        if (this.isPackaged) {
            this.isPackaged = false;
        }
    }
    /**
     * cookie being eaten
     * @return the amount of calories the cookie gives
     */
    public int eaten(double weight) {
        if (weight > this.weight) { // more than the weight of the cookie is taken
            return -1;
        } else if (this.isPackaged) { // cookie was not eaten because it was packaged
            return -2;
        } else {
            // getting the percentage of the weight that the user has requested
            double weight_percentage = weight * 100 / this.weight;
            // getting the calories based on the percentage of the percentage
            double cal = weight_percentage * this.calories / 100;
            System.out.println("cal" + cal);
            return (int) cal;
        }
    }
    /**
     * prints out the important stuff about the cookie
     * @return the important stuff about the cookie in terms of a string
     */
    public String toString() {
        return ("Name: " + this.name + "\nWeight: " + this.weight + " grams\nCalories: " + this.calories);
    }
}
