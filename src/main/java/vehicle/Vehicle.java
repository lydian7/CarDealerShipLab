package vehicle;

import behaviours.IFuel;
import behaviours.IMove;
import behaviours.IStop;
import components.Engine;
import components.Gearbox;
import components.Wheel;
import components.WheelType;

public abstract class Vehicle implements IMove, IStop, IFuel {

    private Engine engine;
    private Wheel wheel;
    private Gearbox gearBox;
    private int fuelLevel;
    private int price;
    private String colour;
    private int numberOfDoors;

    public Vehicle(Engine engine, Wheel wheel, Gearbox gearBox, int fuelLevel, int Price, String colour, int numberOfDoors) {
        this.engine = engine;
        this.wheel = wheel;
        this.gearBox = gearBox;
        this.fuelLevel = fuelLevel;
        this.price = price;
        this.colour = colour;
        this.numberOfDoors = numberOfDoors;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Gearbox getGearBox() {
        return gearBox;
    }


    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
