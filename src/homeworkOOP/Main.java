package homeworkOOP;

import homeworkOOP.mechanics.Mechanic;
import homeworkOOP.transport.Bus;
import homeworkOOP.transport.LightCar;
import homeworkOOP.transport.FreightCar;
import homeworkOOP.transport.Transport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static homeworkOOP.transport.Bus.AmountOfSeats.*;
import static homeworkOOP.transport.FreightCar.LoadCapacity.*;
import static homeworkOOP.transport.LightCar.CarType.*;

public class Main {
    public static List<Transport> carList = new ArrayList<>();
    public static Map<Transport, List<Mechanic>> hashMap = new HashMap<>();

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

        Mechanic mechanic1 = new Mechanic("Механик1", "Компания1");
        Mechanic mechanic2 = new Mechanic("Механик2", "Компания2");
        Mechanic mechanic3 = new Mechanic("Механик3", "Компания3");

        bus1.setMechanic(mechanic1);
        bus1.setMechanic(mechanic2);
        freightCar1.setMechanic(mechanic3);

        hashMap.put(bus1, bus1.getBusMechanicsList());
        hashMap.put(lightCar1, lightCar1.getLightCarMechanicsList());
        hashMap.put(freightCar1, freightCar1.getFreightCarMechanicsList());
        printMap();
    }

    public static void printMap() {
        for (var pairs : hashMap.entrySet()) {
            if (!pairs.getValue().isEmpty()) System.out.println("Авто - " + pairs.getKey().toString() + " | " + pairs.getValue().toString());
            else System.out.println("Авто - " + pairs.getKey().toString() + " | Механики отстутсвуют");
        }
    }
}