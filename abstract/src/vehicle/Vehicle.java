package vehicle;

public abstract class Vehicle {

    protected String brand;
    protected String model;
    protected int fuelCapacity;

    public Vehicle(String brand, String model, int fuelCapacity) {
        this.brand = brand;
        this.model = model;
        this.fuelCapacity = fuelCapacity;
    }

    // Abstract methods: WHAT every vehicle can do.
    // No body here — HOW it happens is hidden inside each subclass.
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract double fuelEfficiency();

    // Concrete method: shared by every subclass, nothing to hide here.
    public void displayInfo() {
        System.out.println("-----------------------------------");
        System.out.println("Brand           : " + brand);
        System.out.println("Model           : " + model);
        System.out.println("Fuel Capacity   : " + fuelCapacity);
        System.out.printf("Fuel Efficiency : %.1f km/unit%n", fuelEfficiency());
    }
}