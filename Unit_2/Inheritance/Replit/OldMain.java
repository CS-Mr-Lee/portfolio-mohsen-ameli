package Inheritance;

/**
* Phone class
**/
class Phone {

    /*
     * attributes
     */
    private String name; 
    private String colour; 
    private String brand;
    private int camera;
    private int cpu;
    private double memory;
    private double screenSize; 
    private double bodySize; 
    private double price; 
    private double weight;
    private String apps;  

    /**
     * Makes a Phone
     * @param name -> the name of the Phone
     * @param colour -> the colour of the Phone
     * @param brand -> the brand of the Phone
     * @param name -> the name of the apps of phone
     * @param cpu -> the cpu of the Phone
     * @param camera -> number of camers of Phone
     * @param screenSize -> the screenSize of the Phone
     * @param bodySize -> the bodySize of the Phone
     * @param price -> the price of the Phone
     * @param memory -> the memory of the Phone
     * @param weight -> the weight of the Phone
     */
    public Phone (String name, String colour, String brand, String apps,int camera, int cpu,double memory, double screenSize, double bodySize, double price, double weight) {
        
        // declaring the attribute with the parameter
        this.name        = name;
        this.colour      = colour;
        this.brand       = brand;
        this.camera      = camera;
        this.cpu         = cpu;
        this.screenSize  = screenSize;
        this.bodySize    = bodySize;
        this.price       = price;
        this.weight      = weight;
        this.apps        = apps;
    }

    /*
     * Accessors
     */

    /**
     * gets the name of the phone
     * @return the phone name
     */
    public String getname() {
        return this.name;
    }

    /**
     * gets the colour of phone
     * @return the colour 
     */
    public String getcolour() {
        return this.colour;
    }

    /**
     * gets the number of cameras
     * @return the cameras
     */
    public int getcamera() {
        return this.camera;
    }

    /**
     * gets the number of cpus
     * @return the cpus 
     */
    public int getcpu() {
        return this.cpu;
    }

    /**
     * gets the name of the brand
     * @return the brand name
     */
    public String getbrand() {
        return this.brand;
    }

    /**
     * gets the apps of phone
     * @return the apps 
     */
    public String getapps() {
        return this.apps;
    }

    /**
     * gets the amount of memory
     * @return the memory
     */
    public double getmemory() {
        return this.memory;
    }

    /**
     * gets the bodySize
     * @return the bodySize
     */
    public double getbodySize() {
        return this.bodySize;
    }
     /**
     * gets the screenSize
     * @return the screenSize
     */
    public double getscreenSize() {
        return this.screenSize;
    }

    /**
     * gets the amount of weight
     * @return the weight
     */
    public double getweight() {
        return this.weight;
    }

    /**
     * gets the price of phone
     * @return the price
     */
    public double getprice() {
        return this.price;
    }


    /**
    Methods
    */
    /**
     * discription : calculate the battery level of phone 
     * 
     * @param hrs  -> hours user playing game
     * @return -1  -> 
     * @return new battery level
     */
    public int game(int hrs) {
        if (hrs > 0) {
            return 0;
        } else {
            return -1;
        }
    }

    /** */
    public void call() {
        
    }

    /** */
    public void text() {
        
    }
    
    /** */
    public void sell(double price) {
        this.price = this.price - price;
    }

    /** */
    public void charge() {
        
    }
        /**
     * Description: Overrides the default string builder method and returns a string
     * with all attributes of the phone.
     * 
     * @return builder - a string that contains all the attributes of the phone
     */
    @Override
    public String toString() {
        String builder = "";

        builder += "Name: ";
        builder += this.getname();
        builder += "\n";
        builder += "weight: ";
        builder += this.getweight();
        builder += "\n";
        builder += "colour: ";
        builder += this.getcolour();
        builder += "\n";
        builder += "brand: ";
        builder += this.getbrand();
        builder += "\n";
        builder += "apps: ";
        builder += this.getapps();
        builder += "\n";
        builder += "camera: ";
        builder += this.getcamera();
        builder += "\n";
        builder += "cpu: ";
        builder += this.getcpu();
        builder += "\n";
        builder += "memory: ";
        builder += this.getmemory();
        builder += "\n";
        builder += "screenSize: ";
        builder += this.getscreenSize();
        builder += "\n";
        builder += "bodySize: ";
        builder += this.getbodySize();
        builder += "\n";
        builder += "price: ";
        builder += this.getprice();
        builder += "\n";

        return builder;

    }
}

/**
Laptop class
**/
class Laptop {
    private String name; 
    private String colour; 
    private String brand;
    private String lighting; 
    private int cpu; 
    private int gpu;
    private int battery;
    private double memory;
    private double bodySize;
    private double screenSize; 
    private double price; 
    private double weight; 

    /**
    Constructor
    */

    public Laptop() {
        this.name        = "";
        this.colour      = "black";
        this.brand       = "";
        this.lighting    = "None";
        this.cpu         = 2;
        this.gpu         = 0;
        this.battery     = 0;
        this.memory      = 1;
        this.screenSize  = 0;
        this.bodySize    = 0;
        this.price       = 20;
        this.weight      = 0.5;
    }
    /**
     * Makes a laptop
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
    public Laptop(String name, String colour, String brand, String lighting, int cpu, int gpu, int battery, double memory, double screenSize, double bodySize, double price, double weight) {
        this.name        = name;
        this.colour      = colour;
        this.brand       = brand;
        this.lighting    = lighting;
        this.cpu         = cpu;
        this.gpu         = gpu;
        this.battery     = battery;
        this.memory      = memory;
        this.screenSize  = screenSize;
        this.bodySize    = bodySize;
        this.price       = price;
        this.weight      = weight;
    }

    /**
    Accessors
    */
    
    /**
     * gets the name of laptop
     * @return the name
     */
    public String getName() {
        return this.name;
    }
    /**
     * gets the colour of laptop
     * @return the colour
     */
    public String getColour() {
        return this.colour;
    }
    /**
     * gets the brand of laptop
     * @return the brand
     */
    public String getBrand() {
        return this.brand;
    }
    /**
     * gets the lighting of laptop
     * @return the lighting
     */
    public String getLighting() {
        return this.lighting;
    }
    /**
     * gets the cpu of laptop
     * @return the cpu
     */
    public int getCpu() {
        return this.cpu;
    }
    /**
     * gets the gpu of laptop
     * @return the gpu
     */
    public int getGpu() {
        return this.gpu;
    }
    /**
     * gets the battery of laptop
     * @return the battery
     */
    public int getBattery() {
        return this.battery;
    }
    /**
     * gets the memory of laptop
     * @return the memory
     */
    public double getMemory() {
        return this.memory;
    }
    /**
     * gets the screenSize of laptop
     * @return the screenSize
     */
    public double getScreenSize() {
        return this.screenSize;
    }
    /**
     * gets the bodySize of laptop
     * @return the bodySize
     */
    public double getBodySize() {
        return this.bodySize;
    }
    /**
     * gets the price of laptop
     * @return the price
     */
    public double getPrice() {
        return this.price;
    }
    /**
     * gets the weight of laptop
     * @return the weight
     */
    public double getWeight() {
        return this.weight;
    }
    

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
    /** */
    public void game(double hrs) {
        if (hrs > 0) { // if user has entered a currect amount
            // decreasing battery 20 percent per hour
            this.battery = this.battery - (int) (hrs * 100 / 20);
            // making sure battery is withing limits
            checkBat(this.battery);
        } else {
            ;
        }
    }

    /** */
    public void browse(double hrs) {
        if (hrs > 0) { // if user has entered a currect amount
            // decreasing battery 5 percent per hour
            this.battery = this.battery - (int) (hrs * 100 / 5);
            // making sure battery is withing limits
            checkBat(this.battery);
        } else {
            ;
        }
    }

    /** */
    public void charge(double hrs) {
        if (hrs > 0) { // if user has entered a currect amount
            // increasing battery 20 percent per hour
            this.battery = this.battery + (int) (hrs * 100 / 50);
            // making sure battery is withing limits
            checkBat(this.battery);
        } else {
            ;
        }
    }
    
    /** */
    public void sell(double price) {
        this.price = this.price - price;
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
    public String toString() {
        return ("Name : " + this.name + "\nColour: " + this.colour + "\nBrand: " + this.brand + "\nLighting: " + this.lighting + "\ncpu: " + this.cpu + "\ngpu: " + this.gpu + "\nBattery : " + this.battery);
    }
}

/**
 * Main class
 */
public class Main {
    public static void main(String [] args) {
        Laptop asus = new Laptop("rog", "black", "asus", "rgb", 8, 4, 50, 16, 14, 14, 2000, 2);
        System.out.println(asus.toString());
        asus.game(2);
        System.out.println(asus.toString());
    }
}