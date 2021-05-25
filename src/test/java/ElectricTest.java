import components.*;
import org.junit.Before;
import org.junit.Test;
import vehicle.Electric;
import vehicle.Hybrid;

import static org.junit.Assert.assertEquals;

public class ElectricTest {
    private Wheel wheel;
    private Engine engine;
    private Gearbox gearBox;
    private Electric electric;


    @Before
    public void before() {
        wheel = new Wheel(WheelType.Alloy, "recycled", 24);
        engine = new Engine(false, 1200, EngineType.Electric);
        gearBox = new Gearbox(8, "8");
        electric = new Electric(engine, wheel, gearBox, 100, 55000, "Space Grey", 6);
    }

    @Test
    public void canMove(){
        assertEquals("Moving silently...", electric.move());
    }

    @Test
    public void canFuel() {
        assertEquals("Engine is being refueled with Electricity", electric.fuel());
    }

    @Test
    public void canStop() {
        assertEquals("Stopping and not damaging the environment, silently...", electric.stop());
    }
}
