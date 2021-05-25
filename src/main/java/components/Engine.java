package components;

public class Engine {

    private boolean ignition;
    private int engineSize;
    private EngineType engineType;

    public Engine(boolean ignition, int engineSize, EngineType engineType) {
        this.ignition = ignition;
        this.engineSize = engineSize;
        this.engineType = engineType;
    }

    public boolean isIgnition() {


        return ignition;
    }

    public void setIgnition(boolean ignition) {
        this.ignition = ignition;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public String getFuelType(){
        return engineType.getFuelType();
    }

}
