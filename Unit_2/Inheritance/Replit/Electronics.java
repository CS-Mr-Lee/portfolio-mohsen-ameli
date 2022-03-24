/**
super electronics class
*/

public class Electronics {
    /*
     * attributes
     */
    private String name; 
    private String colour; 
    private String brand;
    private int cpu;
    private double memory;
    private double screenSize; 
    private double bodySize; 
    private double price; 
    private double weight;
    private int battery;
    private int temp;
    
    /**
     * Makes an Electronics
     * @param name the name of the laptop
     * @param colour the colour of the laptop
     * @param brand the brand of the laptop
     * @param lighting the amount of lighting of the laptop
     * @param cpu the cpu of the laptop
     * @param gpu the gpu of the laptop
     * @param screenSize the screenSize of the laptop
     * @param bodySize the bodySize of the laptop
     * @param price the price of the laptop
     * @param weight the weight of the laptop
     * @param battery percentage of the laptop (0-100%)
     */
    public Electronics(String name, String colour, String brand, int cpu,double memory, double screenSize, double bodySize, double price, double weight, int temp) { 
        this.name        = name;
        this.colour      = colour;
        this.brand       = brand;
        this.cpu         = cpu;
        this.screenSize  = screenSize;
        this.bodySize    = bodySize;
        this.price       = price;
        this.weight      = weight;
        this.temp        = temp;
    }
    /** 
    * for Laptop    
    */
    public Electronics() {
        this.name        = "";
        this.colour      = "blue";
        this.brand       = "";
        this.cpu         = 2;
        this.battery     = 0;
        this.memory      = 1;
        this.screenSize  = 0;
        this.bodySize    = 0;
        this.price       = 1500;
        this.weight      = 0.5;
        this.temp        = 20;
    }
  


    /**
    Accessors
    */
    public String getName() {return this.name;}
    public String getColour() {return this.colour;}
    public String getBrand() {return this.brand;}
    public int getCpu() {return this.cpu;}
    public int getBattery() {return this.battery;}
    public double getMemory() {return this.memory;}
    public double getScreenSize() {return this.screenSize;}
    public double getBodySize() {return this.bodySize;}
    public double getPrice() {return this.price;}
    public double getWeight() {return this.weight;}
    public int getTemp() {return this.temp;}

    /**
    Methods
    */
    
    /**
     * making sure the battery level is withing 0 and 100%
     * @param battery amount of current battery
     */
    public void checkBat(int battery) {
        if (battery < 0) {
            this.battery = 0;
        } else if (battery > 100) {
            this.battery = 100;
        } else {
            this.battery = battery;
        }
    }

    /**
     * making sure the battery level is withing 0 and 100%
     * @param hrs amount of hours of hours for gaming
     */
    public void game(double hrs) {
        if (hrs > 0) { // if user has entered a currect amount
            // decreasing battery 20 percent per hour
            this.battery = this.battery - (int) (hrs * 100 / 10);
            // making sure battery is withing limits
            checkBat(this.battery);
        } else {
            ;
        }
    }

    /**
     * charging the device bt 25% every hour
     * @param hrs amount of hours of hours for gaming
     */
    public void charge(double hrs) {
        if (hrs > 0) { // if user has entered a currect amount
            // increasing battery 20 percent per hour
            this.battery = this.battery + (int) (hrs * 100 / 25);
            // making sure battery is withing limits
            checkBat(this.battery);
        } else {
            ;
        }
    }

    /**
     * selling the device
     * @param price the price of the device
     */
    public void sell(double price) {
        this.price = this.price - price;
    }

    @Override
    public String toString() {
        String builder = "";

        builder += "Name: ";
        builder += this.getName();
        builder += "\n";
        builder += "weight: ";
        builder += this.getWeight();
        builder += "\n";
        builder += "colour: ";
        builder += this.getColour();
        builder += "\n";
        builder += "brand: ";
        builder += this.getBrand();
        builder += "\n";
        builder += "cpu: ";
        builder += this.getCpu();
        builder += "\n";
        builder += "memory: ";
        builder += this.getMemory();
        builder += "\n";
        builder += "screenSize: ";
        builder += this.getScreenSize();
        builder += "\n";
        builder += "bodySize: ";
        builder += this.getBodySize();
        builder += "\n";
        builder += "price: ";
        builder += this.getPrice();
        builder += "\n";
        builder += "temp: ";
        builder += this.getTemp();
        builder += "\n";

        return builder;

    }
}
