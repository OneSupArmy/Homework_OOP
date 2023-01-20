package homeworkOOP;

import homeworkOOP.transport.Bus;
import homeworkOOP.transport.Car;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Car> carList;
    public static ArrayList<Bus> busList;

    public static void main(String[] args) {
        carList = new ArrayList<>() {{
            add(new Car("Lada", "Granta", 1.7, "yellow", 2022, "Russia", 220, "manual", "formula-1", "H945HY178", 1, false, true, true, 200, "1111111", 15000));
            add(new Car("Audi", "A8", 3.0, "black", 2020, "Germany", 220, "automatic", "sedan", "KA-SD488", 4, false, true, true, 200, "112123162", 15000));
            add(new Car("BMW", "Z8", 3.0, "balck", 2021, "Germany", 220, "automatic", "coupe", "BD51 SMR", 2, false, true, true, 200, "112123162", 15000));
            add(new Car("Kia", "Sportage", 2.4, "red", 2018, "South Korea", 220, "automatic", "sedan", "123ㄵ 4568", 4, false, true, true, 200, "112123162", 15000));
            add(new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea", 220, "manual", "sedan", "222ㄶ 2314", 4, false, true, true, 200, "112123162", 15000));
            add(new Car(null, null, -100, null, -105470, null, -220, null, null, null, -10, false, true, true, -200, "™™™™™", -99));
            add(new Car.CarBuilder().brand("Bugatti").model("Veeron").engineVolume(-5).year(2050).country("unknown").insurance(200, "9999", 15000).insurance(200, "11111", 2000).build());
        }};
        busList = new ArrayList<>() {{
            add(new Bus("НефАЗ", "Городской", 2010, "Russia", "white", 120));
            add(new Bus("Mercedes", "Benz Sprinter", 2022, "Germany", "Black", 180));
            add(new Bus("", null, 2110, "Russia", "   ", -120));
        }};
        Car.printAllCars(carList);
        System.out.println();
        Bus.printAllBuses(busList);
    }
}
