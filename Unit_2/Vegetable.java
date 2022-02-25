public class Vegetable {
    /*
    Attributes
    */

    /** the colour of the vegetable */
    private String colour;

    /** the name of the vegetable */
    private String name;

    /** the amount of calories */
    private double calories;

    /** the weight of the vegetable */
    private double weight;

    /** whether or not it's green */
    private boolean isGreen;

    /** whether or not it's edible */
    private boolean isEdible;

    public Vegetable(String colour, String name, double calories, double weight, boolean isGreen, boolean isEdible) {
        this.colour     = colour;
        this.name       = name;
        this.calories   = calories;
        this.weight     = weight;
        this.isGreen    = isGreen;
        this.isEdible   = isEdible;

        
    }
}
