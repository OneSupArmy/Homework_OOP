package homeworkOOP;

import homeworkOOP.drivers.DriverWithB;
import homeworkOOP.drivers.DriverWithC;
import homeworkOOP.drivers.DriverWithD;
import homeworkOOP.transport.Bus;
import homeworkOOP.transport.LightCar;
import homeworkOOP.transport.FreightCar;
import homeworkOOP.transport.Transport;


import java.util.ArrayList;

public class Main {
    public static ArrayList<? extends Transport> carList;

    public static void main(String[] args) {
        carList = new ArrayList<>() {{
                add(new Bus("Автобус 1", "какая-то модель", 0.1));
                add(new Bus("Автобус 2", "какая-то модель", 0.1));
                add(new Bus("Автобус 3", "какая-то модель", 0.1));
                add(new Bus("Автобус 4", "какая-то модель", 0.1));
                add(new LightCar("Audi", "какая-то модель", 0.1));
                add(new LightCar("BMW", "какая-то модель", 0.1));
                add(new LightCar("Lada", "какая-то модель", 0.1));
                add(new LightCar("Ferrari", "какая-то модель", 0.1));
                add(new FreightCar("Машина побольше 1", "какая-то модель", 0.1));
                add(new FreightCar("Машина побольше 2", "какая-то модель", 0.1));
                add(new FreightCar("Машина побольше 3", "какая-то модель", 0.1));
                add(new FreightCar("Машина побольше 4", "какая-то модель", 0.1));
            }};
    }
}
