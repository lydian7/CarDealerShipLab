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

    @Test
    public void canGetWheel() {
        assertEquals(wheel, car.getWheel());
    }

    @Test
    public void canGetGearBox() {
        assertEquals(gearBox, car.getGearBox());
    }

    @Test
    public void canGetFuelLevel() {
        assertEquals(100, car.getFuelLevel());
    }

    @Test
    public void canGetPrice() {
        assertEquals(12000, car.getPrice());
    }

    @Test
    public void canGetColour() {
        assertEquals("red", car.getColour());
    }

    @Test
    public void canGetNoOfDoors() {
        assertEquals(3, car.getNumberOfDoors());
    }

    @Test
    public void canSetPrice() {
        car.setPrice(25000);
        assertEquals(25000, car.getPrice());
    }

    @Test
    public void canSetWheel() {
        Wheel wheel = new Wheel(WheelType.Chrome, "Rubber", 35);
        car.setWheel(wheel);
        assertEquals(wheel, car.getWheel());
    }

    @Test
    public void canSetColour() {
        car.setColour("Pink");
        assertEquals("Pink", car.getColour());
    }


}