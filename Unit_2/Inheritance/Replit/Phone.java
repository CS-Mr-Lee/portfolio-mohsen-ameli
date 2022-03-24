/**
* Phone class
**/
class Phone extends Electronics {
    /*
     * attributes
     */
    private int camera;
    private String apps;

    public Phone() { 
        // super(camera);
        this.camera    = 1;
        this.apps         = "AngryBirds";
    }

    /**
     * Makes a Phone
     * @param name -> the name of the apps of phone
     * @param camera -> number of camers of Phone
     */
    public Phone (String apps,int camera) {

      super(apps,camera);
    }

    /*
     * Accessors
     */

    public int getcamera() {return this.camera;}
    public String getapps() {return this.apps;}

    /**
    Methods
    */

    /** */
    public void call(double hrs) {
        if (hrs > 0) { // if user has entered a currect amount
            // decreasing battery 8 percent per hour
            this.battery = this.battery - (int) (hrs * 100 / 8);
            // making sure battery is withing limits
            checkBat(this.battery);
        } else {
            ;
        }
    }

    /** */
    public void text (double hrs) {
        if (hrs > 0) { // if user has entered a currect amount
            // decreasing battery 10 percent per hour
            this.battery = this.battery - (int) (hrs * 100 / 5);
            // making sure battery is withing limits
            checkBat(this.battery);
        } else {
            ;
        }
    }
        /**
     * Description: Overrides the default string builder method and returns a string
     * with all attributes of the phone.
     * 
     * @return builder - a string that contains all the attributes of the phone
     */
    @Override
    public String toString() {
        String builder = super.toString();
      
        builder += "apps: ";
        builder += this.getapps();
        builder += "\n";
        builder += "camera: ";
        builder += this.getcamera();

        return builder;

    }
}
