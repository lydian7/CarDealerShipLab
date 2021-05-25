import components.*;
import org.junit.Before;
import org.junit.Test;
import vehicle.Car;
import vehicle.Vehicle;

import static org.junit.Assert.assertEquals;

public class CarTest {
    private Wheel wheel;
    private Engine engine;
    private Gearbox gearBox;
    private Car car;
    @Before
    public void before(){
        wheel = new Wheel(WheelType.Alloy, "michelin", 24);
        engine = new Engine(false, 1800, EngineType.Gas);
        gearBox = new Gearbox(6,"6");
        car = new Car(engine, wheel, gearBox, 100,12000, "red", 3);
    }

    @Test
    public void carHasEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void carCanBeRefueled() {
        assertEquals("engine is being refueled with Diesel", car.fuel());
    }

    @Test
    public void canMove() {
        assertEquals("Congrats, you're killing the planet", car.move());
    }

    @Test
    public void canStop() {
        assertEquals("you have stopped", car.stop());
    }

}