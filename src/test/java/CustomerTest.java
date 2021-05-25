import components.*;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import people.DealerShip;
import vehicle.Car;
import vehicle.Vehicle;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Wheel wheel;
    private Engine engine;
    private Gearbox gearBox;
    private Car car;
    private DealerShip dealerShip;
    private Customer customer;
    private ArrayList<Vehicle> dcars;
    private ArrayList<Vehicle> ccars;


    @Before
    public void before() {
        wheel = new Wheel(WheelType.Alloy, "michelin", 24);
        engine = new Engine(false, 1800, EngineType.Gas);
        gearBox = new Gearbox(6, "6");
        car = new Car(engine, wheel, gearBox, 100, 12000, "red", 3);
        dcars = new ArrayList<>();
        dcars.add(car);
        dealerShip = new DealerShip(100000, dcars);
        ccars = new ArrayList<>();
        customer = new Customer(25000, ccars);
    }

    @Test
    public void canBuyCar() {
        customer.buy(dealerShip, car);
        assertEquals(13000, customer.getEquity());
        assertEquals(1, customer.getVehicleCollection().size());
    }

    @Test
    public void canSellCar() {
        dealerShip.sell(customer, car);
        assertEquals(112000, dealerShip.getEquity());
    }

    @Test
    public void canNotBuyCar() {
        car.setPrice(45000);
        customer.buy(dealerShip, car);
        assertEquals(25000, customer.getEquity());
    }

    @Test
    public void canNotSellCar() {
        car.setPrice(45000);
        dealerShip.sell(customer, car);
        assertEquals(100000, dealerShip.getEquity());
    }
}
