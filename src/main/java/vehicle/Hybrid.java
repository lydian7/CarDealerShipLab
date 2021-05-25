package vehicle;

import components.Engine;
import components.Gearbox;
import components.Wheel;

public class Hybrid extends Vehicle {

    public Hybrid(Engine engine, Wheel wheel, Gearbox gearBox, int fuelLevel, int price, String colour, int numberOfDoors) {
        super(engine, wheel, gearBox, fuelLevel, price, colour, numberOfDoors);
    }

    @Override
    public String fuel() {
        return "Engine is being refueled with " + this.getEngine().getFuelType();
    }

    @Override
    public String move() {
        return "Congrats you're only half a piece of Sh*t";
    }

    @Override
    public String stop() {
        return "Reactive braking is charging your battery";
    }
}
