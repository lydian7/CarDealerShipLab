package components;

public class Wheel {
    private WheelType wheelType;
    private String brand;
    private int size;

    public Wheel(WheelType wheelType, String brand, int size) {
        this.wheelType = wheelType;
        this.brand = brand;
        this.size = size;
    }

    public WheelType getWheelType() {
        return wheelType;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }


}
