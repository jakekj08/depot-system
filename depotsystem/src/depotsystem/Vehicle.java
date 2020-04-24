package depotsystem;

public class Vehicle extends MenuSystem {
    private String[] make;
    protected String model;
    protected String regNo;
    protected int weight;

      

    public void Vehicle(String[] make, String model, String regNo, int weight) {
        this.make = make;
        this.model = model;
        this.regNo = regNo;
        this.weight = weight;

    
    }
    public Truck[] VehicleData; {
    VehicleData = (Truck[]) new Vehicle[2];
    
    String[] CarMake = new String[] {"Audi", "BMW", "Ford", "Mazda"};
    CarMake = make;
    
    System.out.println(CarMake.toString());
    }
    
    public boolean IsAvailable() { 
        return false; 
    }

    public void SetSchedule() {

    }

}