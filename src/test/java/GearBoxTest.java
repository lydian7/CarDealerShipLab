import components.Gearbox;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearBoxTest {

    Gearbox gearbox;

    @Before
    public void before(){
        gearbox = new Gearbox(6,"6");
    }

    @Test
    public void canGetGearNumber() {
        assertEquals("6", gearbox.getGearNumber());
    }

    @Test
    public void changeGear() {
        assertEquals("The vehicle is now in gear 1", gearbox.setGearNumber("1"));
    }

    @Test
    public void changeGearReverse() {
        assertEquals("The vehicle is now in reverse", gearbox.setGearNumber("R"));
    }
}
