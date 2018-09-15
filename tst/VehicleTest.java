import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {
    @Test
    public void testVehicle() {
        Vehicle vehicle = new Vehicle("Toyota", 2000, true, 10000, 40);
        Assert.assertEquals(vehicle.getModel(), "Toyota");
        Assert.assertEquals(vehicle.getModelYear(), 2000);
        Assert.assertTrue(vehicle.getFourWheelDrive());
        Assert.assertTrue(vehicle.getRetailPrice() == 10000);
        Assert.assertTrue(vehicle.getMilesPerGal() == 40);
    }

    @Test
    public void testVehicleDefault() {
        Vehicle vehicle = new Vehicle();
        Assert.assertEquals(vehicle.getModel(), "");
        Assert.assertEquals(vehicle.getModelYear(), 9999);
        Assert.assertFalse(vehicle.getFourWheelDrive());
        Assert.assertTrue(vehicle.getRetailPrice() == 0);
        Assert.assertTrue(vehicle.getMilesPerGal() == 0);
    }
}
