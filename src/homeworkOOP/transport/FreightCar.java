package homeworkOOP.transport;

import homeworkOOP.drivers.DriverWithD;

public class FreightCar extends Transport{
    private DriverWithD driver;

    public FreightCar(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    public void setDriver(DriverWithD driver) {
        if (!driver.isDriverWithLicense()) {
            System.out.println("Невозоможно назначить грузовую машину водителю " + driver.getName() + ". Отстутствует лицензия");
            return;
        }
        if (this.driver != null)
            this.driver.removeCar();
        this.driver = driver;
        if (driver.getFreightCar() == null || !driver.getFreightCar().equals(this))
            driver.setFreightCar(this);
    }
    public DriverWithD getDriver() {
        return driver;
    }
    public void removeDriver() {
        this.driver = null;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус поехал");
    }

    @Override
    public void endMoving() {
        System.out.println("Аутобус остановился");
    }

    @Override
    public void pitStop() {
        System.out.println("У автобуса Пит-стоп");
    }

    @Override
    public void bestCircleTime() {
        System.out.println("Лучшее время круга для аутобуса");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса");
    }
    @Override
    public String toString() {
        String string;
        if (driver == null) {
            string = "отстутствует";
        } else {
            string = driver.toString();
        }
        return super.toString() + " Водитель: " + string;
    }

}
