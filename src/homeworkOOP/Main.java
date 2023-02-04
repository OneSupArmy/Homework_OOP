package homeworkOOP;

import homeworkOOP.mechanics.Mechanic;
import homeworkOOP.transport.Bus;
import homeworkOOP.transport.LightCar;
import homeworkOOP.transport.FreightCar;
import homeworkOOP.transport.Transport;
import java.util.ArrayList;
import java.util.List;

import static homeworkOOP.transport.Bus.AmountOfSeats.*;
import static homeworkOOP.transport.FreightCar.LoadCapacity.*;
import static homeworkOOP.transport.LightCar.CarType.*;

public class Main {
    public static List<Transport> carList = new ArrayList<>();

    public static void main(String[] args) {
        Bus bus1 = new Bus("Автобус 1", "какая-то модель", 0.1, null);
        Bus bus2 = new Bus("Автобус 2", "какая-то модель", 0.1, EXTRA_SMALL);
        Bus bus3 = new Bus("Автобус 3", "какая-то модель", 0.1, MEDIUM);
        Bus bus4 = new Bus("Автобус 4", "какая-то модель", 0.1, SMALL);
        LightCar lightCar1 = new LightCar("Audi", "какая-то модель", 0.1, COUPE);
        LightCar lightCar2 = new LightCar("BMW", "какая-то модель", 0.1, null);
        LightCar lightCar3 = new LightCar("Lada", "какая-то модель", 0.1, PICKUP);
        LightCar lightCar4 = new LightCar("Ferrari", "какая-то модель", 0.1, SEDAN);
        FreightCar freightCar1 = new FreightCar("Машина побольше 1", "какая-то модель", 0.1, null);
        FreightCar freightCar2 = new FreightCar("Машина побольше 2", "какая-то модель", 0.1, N2);
        FreightCar freightCar3 = new FreightCar("Машина побольше 3", "какая-то модель", 0.1, N3);
        FreightCar freightCar4 = new FreightCar("Машина побольше 4", "какая-то модель", 0.1, N2);
        carList.add(bus1);
        carList.add(bus2);
        carList.add(bus3);
        carList.add(bus4);
        carList.add(lightCar1);
        carList.add(lightCar2);
        carList.add(lightCar3);
        carList.add(lightCar4);
        carList.add(freightCar1);
        carList.add(freightCar2);
        carList.add(freightCar3);
        carList.add(freightCar4);
    }
}