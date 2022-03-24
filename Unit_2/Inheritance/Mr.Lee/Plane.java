/**
Name: Mr. Lee
Date: Mar 7
Description: A plane class
*/

public class Plane extends Vehicle {
      private double altitude;
      
      /*
      Constructor
      */
      public Plane(String colour) {
         super(colour); //calls the constructor of my superclass
         this.altitude = 0;
      }
      
      public Plane(String colour, int numPassengers) {
         super(colour, numPassengers);
         this.altitude = 0;
      }
      
      /*Accessors and Mutators*/
      public double getAltitude() { return this.altitude;}

      public void setAltitude(double newAltitude) {
         this.altitude = newAltitude;
      }
       
      
      /* Other methods */ 
      
      /**
      adds a passenger to the plane if it is not moving
      @return whether it is successful in adding a passenger
      */
      public boolean addPassenger() {
         if (getSpeed() == 0 && altitude == 0) {
            setNumPassengers(getNumPassengers() + 1); // needed to create a method to mutate numPass
            return true;
         } else {
            System.out.println("Cannot add passenger");
            return false;
         }
      }
      
      public void roar() {
         System.out.println("The plane engine roars!");
      }
      
      
      public String toString() {
         return super.toString() + "; Altitude: " + this.altitude;
      }
   }