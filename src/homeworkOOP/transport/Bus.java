package homeworkOOP.transport;

import java.util.ArrayList;

public class Bus extends Transport{
    public Bus(String brand,
               String model,
               int year,
               String country,
               String color,
               int maxSpeed){
        super(brand, model, year, country, color, maxSpeed);
    }
    public static void printAllBuses(ArrayList<Bus> list) {
        for (Bus k : list) {
            System.out.println(k.toString());
        }
    }
}
