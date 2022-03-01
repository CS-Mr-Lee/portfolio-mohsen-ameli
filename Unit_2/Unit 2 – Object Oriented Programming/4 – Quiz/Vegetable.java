public class Vegetable {
    /*
    Attributes
    */

    /** name of the vegetable */
    private String name;
    /** Number of calories */
    private int calories;
    /** Weight in grams */
    private double weight;


    /*
    Constructor
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
    public Vegetable(String name, int calories, double weight) {
        this.name       = name;
        this.calories   = calories;
        this.weight     = weight;
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
     * returns whether or not the vegetable is green
     * @return true or false based on if it's green
     */
    public double eaten(int weight) {
        return this.weight;
    }
    /**
     * returns whether or not the vegetable is edible
     * @return true or false based on if it's edible
     */
    public String toString() {
        return ("Name: " + this.name + "Calories: " + this.calories + " Weight: " + this.weight);
    }
}
