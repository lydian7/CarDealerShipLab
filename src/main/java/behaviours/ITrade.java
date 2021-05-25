package behaviours;

import people.Asset;
import vehicle.Vehicle;

public interface ITrade {

    void buy(Vehicle vehicle);

    void sell(Asset asset, Vehicle vehicle);

}
