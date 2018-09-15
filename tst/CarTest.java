import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void testCar() {
        Car car = new Car("Toyota", 2000, true, 10000, 40, true);
        Assert.assertEquals(car.getModel(), "Toyota");
        Assert.assertEquals(car.getModelYear(), 2000);
        Assert.assertTrue(car.getFourWheelDrive());
        Assert.assertTrue(car.getRetailPrice() == 10000);
        Assert.assertTrue(car.getMilesPerGal() == 40);
        Assert.assertTrue(car.isConvertible());
    }
}
