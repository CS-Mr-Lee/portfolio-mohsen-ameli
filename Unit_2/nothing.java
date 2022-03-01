public class Vegetable {
    /*
    Attributes
    */

    /** أame of the vegetable */
    private String name;

    /** Number of calories */
    private int calories;

    /** Weight in grams */
    private double weight;


    /**
    Constructor
    */
    
    /**
     * creates a basic vegetable objcet
     * @param name the name of it
     * @param calories amount of calories it has
     * @param weight its weight
     */
    public Vegetable() {
        this.name       = "";
        this.calories   = -1;
        this.weight     = -1;
    }
    public Vegetable(String name, int calories, double weight) {
        this.name       = name;
        this.calories   = calories;
        this.weight     = weight;
    }

    /*
    Method
    */

    /**
     * returns whether or not the vegetable is green
     * @return true or false based on if it's green
     */
    public boolean getIsGreen() {
        return this.isGreen;
    }
    /**
     * returns whether or not the vegetable is edible
     * @return true or false based on if it's edible
     */
    public String toString() {
        return (String) (this.isEdible);
    }

    /*
    mutators
    */

    /**
     * changes the weight of the vegetable
     * @param newWeight expected new weight
     */
    public void setWeight(double newWeight) {
        if (newWeight > this.weight) { // do nothing
            ;
        } else if (newWeight <= 0) { // restricting negative weight
            this.weight = 0;
        } else { // setting new weight
            this.weight = newWeight;
        }
    }
    /**
     * changes the weight of the vegetable
     * @param newWeight expected new weight
     */
    public void setCalories(double newCalories) {
        if (newCalories > this.calories) { // do nothing
            ;
        } else if (newCalories <= 0) { // restricting negative Calories
            this.calories = 0;
        } else { // setting new Calories
            this.calories = newCalories;
        }
    }
    /**
     * changes the weight of the vegetable
     * @param newWeight expected new weight
     */
    public void setIsGreen(boolean isGreen) {
        if (isGreen) {
            this.isGreen = false;
        }
    }
    /**
     * changes the weight of the vegetable
     * @param newWeight expected new weight
     */
    public void setIsEdible(boolean isEdible) {
        if (isEdible) {
            this.isEdible = false;
        }
    }
}
