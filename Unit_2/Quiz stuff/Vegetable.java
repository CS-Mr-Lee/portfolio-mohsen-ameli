public class Vegetable {
    /*
    Attributes
    */

    /** the name of the vegetable */
    private String name;

    /** the colour of the vegetable */
    private String colour;

    /** the amount of calories */
    private double calories;

    /** the weight of the vegetable */
    private double weight;

    /** whether or not it's green */
    private boolean isGreen;

    /** whether or not it's edible */
    private boolean isEdible;

    /**
     * creates a basic vegetable objcet
     * @param name  the name of it
     * @param colour the colour of the vegetable
     * @param calories amount of calories it has
     * @param weight its weight
     * @param isGreen whether or not it's green coloured
     * @param isEdible whether or not it's edible
     */
    public Vegetable(String name, String colour, double calories, double weight, boolean isGreen, boolean isEdible) {
        this.name       = name;
        this.colour     = colour;
        this.calories   = calories;
        this.weight     = weight;
        this.isGreen    = isGreen;
        this.isEdible   = isEdible;
    }

    /*
    Method
    */

    /**
     * gets the name of the vegetable
     * @return the name of the vegetable
     */
    public String getName() {
        return this.name;
    }
    /**
     * gets the colour of the vegetable
     * @return the colour of the vegetable
     */
    public String getColour() {
        return this.colour;
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
    public boolean getIsEdible() {
        return this.isEdible;
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
