package homeworkOOP.transport;

import homeworkOOP.drivers.DriverWithC;

public class Bus extends Transport {
    DriverWithC driver;
    public Bus(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    public void setDriver(DriverWithC driver) {
        if (!driver.isDriverWithLicense()) {
            System.out.println("Невозоможно назначить автобус " + driver.getName() + ". Отстутствует лицензия");
            return;
        }
        if (this.driver != null)
            this.driver.removeBus();
        this.driver = driver;
        if (driver.getBus() == null || !driver.getBus().equals(this))
            driver.setBus(this);
    }

    public DriverWithC getDriver() {
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
