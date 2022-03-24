/**
Laptop class
**/
class Laptop extends Electronics {
    private String lighting; 
    private int gpu;

    /**
    Constructor
    */
    
    public Laptop(String lighting, int gpu) {
        this.lighting     = lighting;
        this.gpu          = gpu;
    }

    /**
    Accessors
    */
    
    public String getLighting() {return this.lighting;}
    public int getGpu() {return this.gpu;}
    

    /**
    Methods
    */

    /** */
    public void browse(double hrs) {
        if (hrs > 0) { // if user has entered a currect amount
            // decreasing battery 5 percent per hour
            int new_battery = getBattery() - (int) (hrs * 100 / 5);
            setBattery(new_battery);
            // making sure battery is withing limits
            checkBat(this.battery);
        } else {
            ;
        }
    }

    /** */
    public void programming(double hrs) {
        if (hrs > 0) { // if user has entered a currect amount
            // decreasing battery 10 percent per hour
            this.battery = this.battery - (int) (hrs * 100 / 10);
            // making sure battery is withing limits
            checkBat(this.battery);
        } else {
            ;
        }
    }

    /**
     * to String
     */

    /**
     * Description: Overrides the default string builder method and returns a string
     * with all attributes of the phone.
     * 
     * @return builder - a string that contains all the attributes of the phone
     */
    @Override
    public String toString() {
        String builder = super.toString();
      
        builder += "Lighting: ";
        builder += this.getLighting();
        builder += "\n";
        builder += "gpu: ";
        builder += this.getGpu();

        return builder;
    }
}

