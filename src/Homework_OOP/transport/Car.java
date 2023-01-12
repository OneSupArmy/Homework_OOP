package Homework_OOP.transport;

import Homework_OOP.Main;
import Homework_OOP.Utility;
import java.util.ArrayList;

public class Car {
    final private String brand;
    final private String model;
    private double engineVolume;
    private String color;
    final private int year;
    final private String country;
    private String transmission;
    final private String bodyType;
    private String registrationNumber;
    final private int amountOfSeats;
    private boolean winterTires;
    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int amountOfSeats, boolean winterTires) {
        this.brand = Utility.doStringValidation(brand);
        this.model = Utility.doStringValidation(model);
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        this.color = color == null || color.equals("") ? "white" : color;
        this.year = year <= 0 ? 2000 : year;
        this.country = Utility.doStringValidation(country);
        this.transmission = Utility.doStringValidation(transmission);
        this.bodyType = Utility.doStringValidation(bodyType);
        this.registrationNumber = Utility.doStringValidation(registrationNumber);
        this.amountOfSeats = amountOfSeats <= 0 ? 4 : amountOfSeats;
        this.winterTires = winterTires;
    }
     public class Key{
        final private boolean remoteEngineStart;
        final private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            // они булиновские, не понял какая тут нужна проверка, видимо речь идет о том, если бы они были стриговые, тогда Utility.doStringValidation
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getYear() {
        return year;
    }
    public String getCountry() {
        return country;
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public String getBodyType() {
        return bodyType;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public int getAmountOfSeats() {
        return amountOfSeats;
    }
    public boolean isWinterTires() {
        return winterTires;
    }
    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }
    public static void printAllCars(ArrayList<Car> list) {
        for (Car k : list) {
            System.out.println(k.toString());
        }
    }
    public static void changeTiresOnSeasons(Car car,int month) {
        Utility.doMonthValidation(month);
        car.setWinterTires(month == 12 || (month >= 1 && month <= 3));
    }
    public static void changeAllTiresOnSeasons(int month) {
        Utility.doMonthValidation(month);
        for (int i = 0; i < Main.carList.size(); i++)
            Main.carList.get(i).setWinterTires(month == 12 || (month >= 1 && month <= 3));

    }
    @Override
    public String toString() {
        String tires = winterTires ? "зимняя резина" : " летняя резина";
        return "Брэнд: " + brand +
                ", модель: " + model +
                ", мощность двигателя: " + engineVolume +
                ", цвет: " + color +
                ", год выпуска: " + year +
                ", страна производитель: " + country +
                ", коробка передач: " + transmission +
                ", тип кузова: " + bodyType +
                ", регистрационный номер: " + registrationNumber +
                ", количсетво мест: " + amountOfSeats +
                ", тип резины: " + tires;
    }
}