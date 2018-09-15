import java.util.List;

public class Inventory {
    private List<Vehicle> vehiclesList;

    public Inventory(List<Vehicle> vehicles) {
        vehiclesList = vehicles;
    }

    public List<Vehicle> getVehiclesList() {
        return vehiclesList;
    }

    public void add(Vehicle vehicle) {
        vehiclesList.add(vehicle);
    }
    public void remove(Vehicle vehicle) {
        vehiclesList.remove(vehicle);
    }

    public Vehicle findCheapestVehicle() {
        Vehicle cheapestV = vehiclesList.get(0);
        for(Vehicle v : vehiclesList) {
            if (v.getRetailPrice() < cheapestV.getRetailPrice()) {
                cheapestV = v;
            }
        }
        return cheapestV;
    }

    public Vehicle findMostExpensiveVehicle() {
        Vehicle expensiveV = vehiclesList.get(0);
        for(Vehicle v : vehiclesList) {
            if (v.getRetailPrice() > expensiveV.getRetailPrice()) {
                expensiveV = v;
            }
        }
        return expensiveV;
    }

    public void printAveragePriceOfAllVehicles() {
        double avgPrice = 0.0;
        for(Vehicle v : vehiclesList) {
            avgPrice += v.getRetailPrice() / vehiclesList.size();
        }
        System.out.println("Average Price: " + avgPrice);
    }
}
