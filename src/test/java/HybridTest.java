import components.*;
import org.junit.Before;
import org.junit.Test;
import vehicle.Car;
import vehicle.Hybrid;

import static org.junit.Assert.assertEquals;

public class HybridTest {

    private Wheel wheel;
    private Engine engine;
    private Gearbox gearBox;
    private Hybrid hybrid;


    @Before
    public void before() {
        wheel = new Wheel(WheelType.Alloy, "recycled", 24);
        engine = new Engine(false, 1200, EngineType.Hybrid);
        gearBox = new Gearbox(6, "6");
        hybrid = new Hybrid(engine, wheel, gearBox, 100, 35000, "magenta", 4);

    }

    @Test
    public void canMove(){
        assertEquals("Congrats you're only half a piece of Sh*t", hybrid.move());
    }

    @Test
    public void canFuel() {
        assertEquals("Engine is being refueled with Unleaded", hybrid.fuel());
    }

    @Test
    public void canStop() {
        assertEquals("Reactive braking is charging your battery", hybrid.stop());
    }
}
