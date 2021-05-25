package people;

import behaviours.ITrade;
import vehicle.Vehicle;

import java.util.ArrayList;

public abstract class Asset {

    private int equity;
    private ArrayList<Vehicle> vehicleCollection;

    public Asset(int equity, ArrayList<Vehicle> vehicleCollection) {
        this.equity = equity;
        this.vehicleCollection = vehicleCollection;
    }

    public int getEquity() {
        return equity;
    }

    public ArrayList<Vehicle> getVehicleCollection() {
        return vehicleCollection;
    }

    public void setEquity(int equity) {
        this.equity = equity;
    }

    public void buy(Asset asset, Vehicle vehicle) {
        if(this.getEquity() >= vehicle.getPrice()){
            this.setEquity(this.getEquity() - vehicle.getPrice());
            this.getVehicleCollection().add(vehicle);
            asset.vehicleCollection.remove(vehicle);
            asset.setEquity(asset.getEquity() + vehicle.getPrice());
        }

    }

    public void sell(Asset asset, Vehicle vehicle) {
        if(asset.getEquity() >= vehicle.getPrice()){
            this.setEquity(this.getEquity() + vehicle.getPrice());
            this.getVehicleCollection().remove(vehicle);
            asset.vehicleCollection.add(vehicle);
            asset.setEquity(asset.getEquity() - vehicle.getPrice());
        }
    }
}
