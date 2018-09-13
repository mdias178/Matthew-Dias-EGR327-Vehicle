public class Truck extends Vehicle{
    private boolean sideStep;
    private int towCapacity;

    public Truck(String model, int modelYear, boolean fourWheelDrive, double retailPrice, double milesPerGal,
                 boolean sideStep, int towCapacity) {
        super(model, modelYear, fourWheelDrive, retailPrice, milesPerGal);
        this.sideStep = sideStep;
        this.towCapacity = towCapacity;
    }

    @Override
    public void printVehicle() {
        super.printVehicle();
        System.out.println("Side Step:" + ((sideStep) ? "yes" : "no") + "\n" + "Tow up to " + towCapacity + " tons" + "\n");
    }
}
