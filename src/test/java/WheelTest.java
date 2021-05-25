import components.Wheel;
import components.WheelType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class WheelTest {
    private Wheel wheel;

    @Before
    public void before(){
        wheel = new Wheel(WheelType.Alloy, "michelin", 24);
    }

    @Test
    public void hasWheelType() {
        assertEquals(WheelType.Alloy, wheel.getWheelType());
    }

    @Test
    public void hasBrand() {
        assertEquals("michelin", wheel.getBrand());
    }

    @Test
    public void hasSize() {
        assertEquals(24, wheel.getSize());
    }
}
