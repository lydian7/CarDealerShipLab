package vehicle;

import components.Engine;
import components.Gearbox;
import components.Wheel;

public class Electric extends Vehicle {

    public Electric(Engine engine, Wheel wheel, Gearbox gearBox, int fuelLevel, int price, String colour, int numberOfDoors) {
        super(engine, wheel, gearBox, fuelLevel, price, colour, numberOfDoors);
    }

    @Override
    public String fuel() {
        return "Engine is being refueled with " + this.getEngine().getFuelType();
    }

    @Override
    public String move() {
        return "Moving silently...";
    }

    @Override
    public String stop() {
        return "Stopping and not damaging the environment, silently...";
    }
}
