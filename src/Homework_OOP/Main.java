package Homework_OOP;

import Homework_OOP.transport.Car;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Car> carList;
    public static void main(String[] args) {
        carList = new ArrayList<>() {{
            add(new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia", "manual", "formula-1", "H945HY178", 2, false));
            add(new Car("Audi", "A8", 3.0, "black", 2020, "Germany", "automatic", "sedan", "KA-SD488", 4, false));
            add(new Car("BMW", "Z8", 3.0, "balck", 2021, "Germany", "automatic", "coupe", "BD51 SMR", 2, false));
            add(new Car("Kia", "Sportage", 2.4, "red", 2018, "South Korea", "automatic", "sedan", "123ㄵ 4568", 4, false));
            add(new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea", "manual", "sedan", "222ㄶ 2314", 4, false));
            add(new Car(null, null, -100, null, -100, null, null, null, null, -10, false));
        }};
        Car.Key ladaKey = carList.get(0).new Key(true, true);
        Car.changeTiresOnSeasons(carList.get(2),12);
        Car.changeAllTiresOnSeasons(10);
        Car.printAllCars(carList);
    }
}
