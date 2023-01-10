package Homework_OOP;

import java.util.ArrayList;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;
    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand == null || brand.equals("") ? "default" : brand;
        this.model = model == null || model.equals("") ? "default" : model;
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        this.color = color == null || color.equals("") ? "white" : color;
        this.year = year <= 0 ? 2000 : year;
        this.country = country == null || country.equals("") ?  "default" : country;
    }
    public static void printAllCars (ArrayList<Car> list){
        for (Car k : list) {
            System.out.println(k.toString());
        }
    }

    @Override
    public String toString() {
        return "Брэнд: " + brand +
                ", модель: " + model +
                ", мощность двигателя: " + engineVolume +
                ", цвет: " + color +
                ", год выпуска: " + year +
                ", страна производитель: " + country;
    }
}