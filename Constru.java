// Create a class
public class Constru {
     int modelYear;
     String modelName;  //Create class attributes
     String brandName;
    
    // Create a class constructor for the class
     public Constru() { 
        modelYear = 1969;
        modelName = "Charger";  // Set the initial value for the class attributes 
        brandName = "Dodge";
    }

    public static void main (String[] args) {
        
        Constru myCar = new Constru (); // Create an object of class (This will call the constructor)
        System.out.println(myCar.brandName + " " + myCar.modelName + " " + myCar.modelYear); //Print the value
    }
}