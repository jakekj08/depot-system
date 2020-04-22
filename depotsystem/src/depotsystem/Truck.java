package depotsystem;

public class Truck extends Vehicle {
    
    private int cargoCapacity;
    
    public Truck(String make,String model, String regNo, int weight, int cargoCapacity) {
        super(make, model, regNo, weight);
        this.cargoCapacity = cargoCapacity;
}
    
}