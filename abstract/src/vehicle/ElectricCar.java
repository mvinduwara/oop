package vehicle;

public class ElectricCar extends Vehicle {

    public ElectricCar(String brand, String model, int fuelCapacity) {
        super(brand, model, fuelCapacity);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " " + model + " -> Power button pressed... silent motor engaged.");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " " + model + " -> Motor powered down.");
    }

    @Override
    public double fuelEfficiency() {
        return 6.0;
    }
}