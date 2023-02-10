package homeworkOOP.drivers;

import homeworkOOP.transport.LightCar;

import java.util.Objects;

public class DriverWithB extends Driver {
    LightCar car;

    public DriverWithB(String name, boolean isDriverWithLicense, int experience) {
        super(name, isDriverWithLicense, experience);
    }
    public void setCar(LightCar car) {
        if (!this.isDriverWithLicense()) {
            System.out.println("Невозоможно назначить легковую машину водителю " + getName() + ". Отстутствует лицензия");
            return;
        }
        if (this.car != null)
            this.car.removeDriver();
        this.car = car;
        if (car.getDriver() == null || !car.getDriver().equals(this))
            car.setDriver(this);
    }
    public void removeCar() {
        this.car = null;
    }
    public LightCar getCar() {
        return car;
    }
    public String getMassage(){
        if (car == null)
            return "водитель " + getName() + " свободен и не учатсвует в заезде";
        return "водитель " + getName() + " управляет автомобилем " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DriverWithB)) return false;
        if (!super.equals(o)) return false;
        DriverWithB that = (DriverWithB) o;
        return Objects.equals(car, that.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), car);
    }
}
