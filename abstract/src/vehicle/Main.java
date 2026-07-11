package vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Vehicle v = new Vehicle("x", "y", 1);
        // Not allowed - Java won't let you create an abstract class directly.

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Toyota", "Corolla", 45));
        vehicles.add(new Motorcycle("Honda", "CB150R", 12));
        vehicles.add(new ElectricCar("Tesla", "Model 3", 75));

        for (Vehicle v : vehicles) {
            // Main only knows it's holding a "Vehicle."
            // It never checks what kind, and never needs to.
            v.startEngine();
            v.displayInfo();
            v.stopEngine();
            System.out.println();
        }
    }
}