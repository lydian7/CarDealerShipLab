import components.Engine;
import components.EngineType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine(false, 1800, EngineType.Gas);
    }

    @Test
    public void canGetIgnition() {
        assertEquals(false, engine.isIgnition());
    }

    @Test
    public void canSetIgnition() {
        engine.setIgnition(true);
        assertEquals(true, engine.isIgnition());
    }

    @Test
    public void getEngineSize() {
        assertEquals(1800, engine.getEngineSize());
    }

    @Test
    public void getEngineType() {
        assertEquals(EngineType.Gas, engine.getEngineType());
    }

    @Test
    public void canGetFuelType() {
        assertEquals("Diesel", engine.getFuelType());
    }
}
