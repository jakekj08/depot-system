package depotsystem;

public class Vehicle extends MenuSystem {
    private String[] make;
    private String[] model;
    private String[] regNo;
    private int[] weight;

      

    public Vehicle(String[] make, String[] model, String[] regNo, int[] weight) {
        this.make = make;
        this.model = model;
        this.regNo = regNo;
        this.weight = weight;

    
    }
    public Truck[] VehicleData; {
    VehicleData = (Truck[]) new Vehicle[2];
    
    String[] CarMake = new String[] {"Audi", "BMW", "Ford", "Mazda"};
    CarMake = make;
    
    String[] CarModel = new String[] {"Alpha", "SportGT", "Alexa", "HaulMaster"};
    CarModel = model;
    
      String[] CarReg = new String[] {"IHZ 5734", "GJZ 9021", "PLZ 9727", "RKZ 1638"};
    CarReg = regNo;
    
      int[] CarWeight = new int[] {130, 1542, 1287, 1765};
    CarWeight = weight;
    
    System.out.println(CarMake.toString());
    }
    
    public boolean IsAvailable() { 
        return false; 
    }

    public void SetSchedule() {

    }

}