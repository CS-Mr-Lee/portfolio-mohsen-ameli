public class Cookie {
    /*
    Attributes
    */

    /** name of the cookie */
    private String name;
    /** Number of calories */
    private int calories;
    /** Weight in grams */
    private double weight;
    /** Whether the cookie is packaged or not */
    private boolean isPackaged;


    /*
    Constructor
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
     * creates a basic Cookie objcet
     * @param name the name of it
     * @param calories amount of calories it has
     * @param weight its weight
     */
    public Cookie(String name, double weight, int calories) {
        this.name       = name;
        this.calories   = calories;
        this.weight     = weight;
        this.isPackaged = false;
    }
    /**
     * creates a basic Cookie objcet
     * @param name the name of it
     * @param calories amount of calories it has
     * @param weight its weight
     * @param isPackaged Whether the cookie is packaged or not
     */
    public Cookie(String name, double weight, int calories, boolean isPackaged) {
        this.name       = name;
        this.calories   = calories;
        this.weight     = weight;
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
     * returns whether or not the cookie is green
     * @return true or false based on if it's green
     */
    public int eaten(double weight) {
        if (!this.isPackaged) {
            this.weight = this.weight - weight;
            return this.calories;
        } else {
            return 0;
        }
    }
    /**
     * returns whether or not the cookie is edible
     * @return true or false based on if it's edible
     */
    public String toString() {
        return ("Name: " + this.name + "Calories: " + this.calories + " Weight: " + this.weight);
    }
}
