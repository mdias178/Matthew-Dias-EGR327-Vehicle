public class Car extends Vehicle {
    private boolean convertible;
    public Car(String model, int modelYear, boolean fourWheelDrive, double retailPrice,
               double milesPerGal, boolean convertible){
        super(model, modelYear, fourWheelDrive, retailPrice, milesPerGal);
        this.convertible = convertible;
    }

    @Override
    public void printVehicle() {
        super.printVehicle();
        System.out.println("convertible:" + ((convertible) ? "yes" : "no") + "\n");
    }
}
