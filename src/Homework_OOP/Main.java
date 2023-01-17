package Homework_OOP;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>() {{
            add(new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia"));
            add(new Car("Audi", "A8", 3.0, "black", 2020, "Germany"));
            add(new Car("BMW", "Z8", 3.0, "balck", 2021, "Germany"));
            add(new Car("Kia", "Sportage", 2.4, "red", 2018, "South Korea"));
            add(new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea"));
            add(new Car(null, null, -100, null, -100, null));
        }};
        Car.printAllCars(carList);
    }
}
