public class Vehicle {
    private String model;
    private int modelYear;
    private boolean fourWheelDrive;
    private double retailPrice;
    private double milesPerGal;

    public Vehicle() {
        model = "";
        modelYear = 9999;
        fourWheelDrive = false;
        retailPrice = 0;
        milesPerGal = 0;
    }

    public Vehicle(String model, int modelYear, boolean fourWheelDrive, double retailPrice, double milesPerGal) {
        this.model = model;
        this.modelYear = modelYear;
        this.fourWheelDrive = fourWheelDrive;
        this.retailPrice = retailPrice;
        this.milesPerGal = milesPerGal;
    }

    public String getModel() {return model;}
    public int getModelYear() {return modelYear;}
    public boolean getFourWheelDrive() {return fourWheelDrive;}
    public double getRetailPrice() {return retailPrice;}
    public double getMilesPerGal() {return milesPerGal;}

    public void printVehicle() {
        System.out.println(modelYear + " " + model + "\n" + "four wheel drive: " + ((fourWheelDrive) ? "yes" : "no") +
                "\n $" + retailPrice + "\n" + milesPerGal + "MPG");
    }
}
