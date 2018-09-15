import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InventoryTest {

    @Test
    public void addTest() {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Truck("Ford F-150", 1995, true, 500, 14, true, 3));
        vehicles.add(new Car("Toyota T-333", 2013, false, 30000, 4, true));
        vehicles.add(new Car("Tesla G-32F", 2020, true, 100000000, 5000, true));
        vehicles.add(new Truck("Honda ABC", 1770, false, 1, 1.5, false, 0));

        Inventory inventory = new Inventory(vehicles);
        Car newCar = new Car("Ford A-123", 2009, true, 5000, 25, false);
        inventory.add(newCar);
        Assert.assertEquals(inventory.getVehiclesList().size(), 5);
        Assert.assertEquals(inventory.getVehiclesList().get(4), newCar);
    }

    @Test
    public void removeTest() {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        Vehicle vehicleToRemove = new Truck("Honda ABC", 1770, false, 1, 1.5, false, 0);
        vehicles.add(new Truck("Ford F-150", 1995, true, 500, 14, true, 3));
        vehicles.add(new Car("Toyota T-333", 2013, false, 30000, 4, true));
        vehicles.add(new Car("Tesla G-32F", 2020, true, 100000000, 5000, true));
        vehicles.add(vehicleToRemove);

        Inventory inventory = new Inventory(vehicles);
        inventory.remove(vehicleToRemove);
        Assert.assertEquals(inventory.getVehiclesList().size(), 3);
    }

    @Test
    public void findCheapestVehicleTest() {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Truck("Ford F-150", 1995, true, 500, 14, true, 3));
        vehicles.add(new Car("Toyota T-333", 2013, false, 30000, 4, true));
        vehicles.add(new Car("Tesla G-32F", 2020, true, 100000000, 5000, true));
        vehicles.add(new Truck("Honda ABC", 1770, false, 1, 1.5, false, 0));

        Inventory inventory = new Inventory(vehicles);
        Vehicle cheapestVehicle = inventory.findCheapestVehicle();
        Assert.assertEquals(cheapestVehicle.getClass(), Truck.class);
        Truck cheapestTruck = (Truck) cheapestVehicle;
        Assert.assertEquals(cheapestVehicle.getModel(), "Honda ABC");
        Assert.assertEquals(cheapestVehicle.getModelYear(), 1770);
        Assert.assertFalse(cheapestVehicle.getFourWheelDrive());
        Assert.assertTrue(cheapestVehicle.getRetailPrice() == 1);
        Assert.assertTrue(cheapestVehicle.getMilesPerGal() == 1.5);
        Assert.assertFalse(cheapestTruck.hasSideStep());
        Assert.assertEquals(cheapestTruck.getTowCapacity(), 0);
    }

    @Test
    public void findMostExpensiveVehicleTest() {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Truck("Ford F-150", 1995, true, 500, 14, true, 3));
        vehicles.add(new Car("Toyota T-333", 2013, false, 30000, 4, true));
        vehicles.add(new Car("Tesla G-32F", 2020, true, 100000000, 5000, true));
        vehicles.add(new Truck("Honda ABC", 1770, false, 1, 1.5, false, 0));

        Inventory inventory = new Inventory(vehicles);
        Vehicle expensiveVehicle = inventory.findMostExpensiveVehicle();
        Assert.assertEquals(expensiveVehicle.getClass(), Car.class);
        Car expensiveCar = (Car) expensiveVehicle;
        Assert.assertEquals(expensiveVehicle.getModel(), "Tesla G-32F");
        Assert.assertEquals(expensiveVehicle.getModelYear(), 2020);
        Assert.assertTrue(expensiveVehicle.getFourWheelDrive());
        Assert.assertTrue(expensiveVehicle.getRetailPrice() == 100000000);
        Assert.assertTrue(expensiveVehicle.getMilesPerGal() == 5000);
        Assert.assertTrue(expensiveCar.isConvertible());
    }
}
