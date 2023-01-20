package homeworkOOP.transport;

import static homeworkOOP.Utility.*;

public abstract class Transport {
    final private String brand;
    final private String model;
    final private int year;
    final private String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = doDefaultValidation(brand);
        this.model = doDefaultValidation(model);
        this.year = doYearValidation(year);
        this.country = doDefaultValidation(country);
        this.color = doColorValidation(color);
        this.maxSpeed = Math.max(maxSpeed, 30);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = doColorValidation(color);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = Math.max(maxSpeed, 0);
    }

    @Override
    public String toString() {
        return "Брэнд: " + brand +
                ", модель: " + model +
                ", максимальная скорость: " + maxSpeed +
                ", цвет: " + color +
                ", год выпуска: " + year +
                ", страна производитель: " + country;
    }
}

