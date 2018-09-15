import org.junit.Assert;
import org.junit.Test;

public class TruckTest {
    @Test
    public void testTruck() {
        Truck truck = new Truck("Toyota", 2000, true, 10000, 40, true, 3);
        Assert.assertEquals(truck.getModel(), "Toyota");
        Assert.assertEquals(truck.getModelYear(), 2000);
        Assert.assertTrue(truck.getFourWheelDrive());
        Assert.assertTrue(truck.getRetailPrice() == 10000);
        Assert.assertTrue(truck.getMilesPerGal() == 40);
        Assert.assertTrue(truck.hasSideStep());
        Assert.assertEquals(truck.getTowCapacity(), 3);
    }
}
