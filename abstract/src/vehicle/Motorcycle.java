package vehicle;

public class Motorcycle extends Vehicle {

    public Motorcycle(String brand, String model, int fuelCapacity) {
        super(brand, model, fuelCapacity);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " " + model + " -> Kick-start... engine revs up.");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " " + model + " -> Engine stopped.");
    }

    @Override
    public double fuelEfficiency() {
        return 35.0;
    }
}