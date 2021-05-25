package components;

public enum EngineType {

    Electric("Electricity"),
    Hybrid("Unleaded"),
    Gas("Diesel");

    private String fuelType;

    EngineType(String fuelType){
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }
}
