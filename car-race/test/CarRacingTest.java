import data.Car;
import logic.CarRacing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CarRacingTest {
    private static CarRacing carRacing;
    private static Car car;
    
    @BeforeAll
    public static void init() {
        carRacing = new CarRacing(); 
        car = new Car();
    }
    
    @Test
    public static void testMakeCars() {
        // Given
        carRacing.setCarCount(3);
        carRacing.setTryCount(3);
        
        // When
        carRacing.makeCars();
        
        // Then
        Assertions.assertEquals(carRacing.getCarCount(), carRacing.getCars().size());
    }
    
    @Test
    public static void testGo() {
        // Given
        // When
        car.go();
        // Then
        Assertions.assertEquals(1, car.getGoCount());
    }
}