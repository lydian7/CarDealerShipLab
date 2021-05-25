package vehicle;

import components.Engine;
import components.EngineType;
import components.Gearbox;
import components.Wheel;

public class Car extends Vehicle{

    public Car(Engine engine, Wheel wheel, Gearbox gearBox, int fuelLevel, int Price, String colour, int numberOfDoors) {
        super(engine, wheel, gearBox, fuelLevel, Price, colour, numberOfDoors);

    }

    @Override
    public String fuel() {

        return "engine is being refueled with "+ this.getEngine().getEngineType().getFuelType();
    }

    @Override
    public String move() {
        return "Congrats, you're killing the planet";
    }

    @Override
    public String stop() {
        return "you have stopped";
    }
}
