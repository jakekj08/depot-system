package depotsystem;

public class Vehicle extends MenuSystem {
    private String[] make;
    private String[] model;
    private String[] regNo;
    private int[] weight;
    //Defining data types
      

    public Vehicle(String[] make, String[] model, String[] regNo, int[] weight) {
        this.make = make;
        this.model = model;
        this.regNo = regNo;
        this.weight = weight;

    
    }
    public Truck[] VehicleData; {
    VehicleData = (Truck[]) new Vehicle[4];
    
    String[] CarMake = new String[] {"Audi", "BMW", "Ford", "Mazda"};	
    CarMake = make;
    //Array of different car makes
    
    String[] CarModel = new String[] {"Alpha", "SportGT", "Alexa", "HaulMaster"};
    CarModel = model;
    //Array of different car models
      String[] CarReg = new String[] {"IHZ 5734", "GJZ 9021", "PLZ 9727", "RKZ 1638"};
    CarReg = regNo;
    //Array of stored car registration numbers
      int[] CarWeight = new int[] {130, 1542, 1287, 1765};
    CarWeight = weight;
    //Array of different weights of cars
    
    System.out.println(CarMake.toString());
    }
    //Print to check if data is correctly stored
    
    public boolean IsAvailable() { 
        return false; 
    }

    public void SetSchedule() {

    }

}