package depotsystem;

public abstract class Vehicle {
    protected String make;
    protected String model;
    protected String regNo;
    protected int weight;

    
    public Vehicle(String make, String model, String regNo, int weight) {
        this.make = make;
        this.model = model;
        this.regNo = regNo;
        this.weight = weight;
    }
    
    public boolean IsAvailable() { 
        return false; 
    }
    
    public void SetSchedule() {
        
    }
    
}