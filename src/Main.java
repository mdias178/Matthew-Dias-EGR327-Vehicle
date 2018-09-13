import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Truck("Ford F-150", 1995, true, 500, 14, true, 3));
        vehicles.add(new Car("Toyota T-333", 2013, false, 30000, 4, true));
        vehicles.add(new Car("Tesla G-32F", 2020, true, 100000000, 5000, true));
        vehicles.add(new Truck("Honda ABC", 1770, false, 1, 1.5, false, 0));
        for(Vehicle v : vehicles) {
            v.printVehicle();
        }
    }
}
