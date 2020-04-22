package depotsystem;

public class Tanker extends Vehicle{
    
    private final int liquidCapacity;
    private final String liquidType;
    
    public Tanker(String make,String model, String regNo, int weight, int liquidCapacity, String liquidType) {
        super(make, model, regNo, weight);
        this.liquidCapacity = liquidCapacity;
        this.liquidType = liquidType;
    }
    
}
