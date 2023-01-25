package homeworkOOP;


import homeworkOOP.transport.Bus;
import homeworkOOP.transport.LightCar;
import homeworkOOP.transport.FreightCar;
import homeworkOOP.transport.Transport;

import java.util.ArrayList;

import static homeworkOOP.transport.Bus.AmountOfSeats.*;
import static homeworkOOP.transport.FreightCar.LoadCapacity.*;
import static homeworkOOP.transport.LightCar.CarType.*;

public class Main {
    public static ArrayList<? extends Transport> carList;

    public static void main(String[] args) {
        carList = new ArrayList<>() {{
            add(new Bus("Автобус 1", "какая-то модель", 0.1, null));
            add(new Bus("Автобус 2", "какая-то модель", 0.1, EXTRA_SMALL));
            add(new Bus("Автобус 3", "какая-то модель", 0.1, MEDIUM));
            add(new Bus("Автобус 4", "какая-то модель", 0.1, SMALL));
            add(new LightCar("Audi", "какая-то модель", 0.1, COUPE));
            add(new LightCar("BMW", "какая-то модель", 0.1, null));
            add(new LightCar("Lada", "какая-то модель", 0.1, PICKUP));
            add(new LightCar("Ferrari", "какая-то модель", 0.1, SEDAN));
            add(new FreightCar("Машина побольше 1", "какая-то модель", 0.1, null));
            add(new FreightCar("Машина побольше 2", "какая-то модель", 0.1, N2));
            add(new FreightCar("Машина побольше 3", "какая-то модель", 0.1, N3));
            add(new FreightCar("Машина побольше 4", "какая-то модель", 0.1, N2));
        }};
        carList.get(0).printType();
        carList.get(1).printType();
        carList.get(4).printType();
        carList.get(5).printType();
        carList.get(8).printType();
        carList.get(9).printType();
    }
}