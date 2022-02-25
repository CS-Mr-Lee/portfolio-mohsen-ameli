public class Meat {
    /*
    Attributes
    */

    /** the type of animal it comes form */
    private String animal;
    
    /** the part of the animal */
    private String organ;
    
    /** the weight of the meat */
    private double weight;

    /** the amount of fat the meat has */
    private double fatContent;
    
    /** whether or not the meat has bones */
    private boolean hasBone;

    /*
    Constructer
    */

    /**
     * Creates a basic meat object
     * @param animal the animal type
     * @param organ the part of the animal
     * @param fatContent the amount of fat
     * @param weight the weight of the meat
     * @param hasBone whether it has bones or not
     */
    public Meat(String animal, String organ, double fatContent, double weight, boolean hasBone) {
        this.animal     = animal;
        this.organ      = organ;

        // verifying our attribute
        if (fatContent < 0) {
            this.fatContent = 0;
        } else if (fatContent > 100) {
            this.fatContent = 100;
        } else {
            this.fatContent = fatContent;
        }
        this.hasBone    = hasBone;

        if (hasBone) {
            if (weight < 20) {
                this.weight = 20;
            } else {
                this.weight = weight;
            }
        } else {
            if (weight < 0) {
                this.weight = 0;
            } else {
                this.weight = weight;
            }
        }
    
    }

    /*
    Method
    */

    // Accessors : non static object we are acting on ?

    /**
     * Gets the type of animal
     * @return the animal name
     */
    public String getAnimal() {
        return this.animal;
    }
    /**
     * Gets the organ of the animal
     * @return the organ name
     */
    public String getOrgan() {
        return this.organ;
    }
    /**
     * Gets the weight of the animal
     * @return the animal weight
     */
    public double getWeight() {
        return this.weight;
    }
    /**
     * Gets the amount of fat in the animal
     * @return the fat content
     */
    public double getFatContent() {
        return this.fatContent;
    }
    /**
     * Gets true or false based on the animal
     * @return whether or not the animal has bone
     */
    public boolean getHasBone() {
        return this.hasBone;
    }

    /*
    mutators
    */

    /**
     * changes the weight of the meat
     * @param newWeight expected new weight
     */
    public void setWeight(double newWeight) {
        if (newWeight > this.weight) { // not do anything
            ;
        } else if (newWeight <= 0) { // restricting negative weight
            this.weight = 0;
        } else { // setting new weight
            this.weight = newWeight;
        }
    }
    /**
     * changes the weight of the meat
     * @param newWeight expected new weight
     */
    public void setFatContent(double newFat) {
        if (newFat > this.fatContent) {
            ;
        } else if (newFat > 100) { // not do anything
            this.fatContent = 100;
        } else if (newFat <= 0) { // restricting negative weight
            this.fatContent = 0;
        } else { // setting new fatContent
            this.fatContent = newFat;
        }
    }
    /**
     * if meat has bone, take it out and set its value as false
     */
    public void deBone() {
        if (this.hasBone) {
            this.hasBone = false;
        }
    }
}