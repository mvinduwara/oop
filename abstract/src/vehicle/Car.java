package vehicle;

public class Car extends Vehicle {

    public Car(String brand, String model, int fuelCapacity) {
        super(brand, model, fuelCapacity);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " " + model + " -> Turning key... petrol engine roars to life.");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " " + model + " -> Engine switched off.");
    }

    @Override
    public double fuelEfficiency() {
        return 15.5;
    }
}