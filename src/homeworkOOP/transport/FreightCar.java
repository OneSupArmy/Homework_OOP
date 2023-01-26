package homeworkOOP.transport;

import homeworkOOP.drivers.DriverWithD;
import homeworkOOP.utility.Validation;

import java.util.Objects;
import static homeworkOOP.transport.FreightCar.LoadCapacity.NULL_LOAD;

public class FreightCar extends Transport{
    private DriverWithD driver;
    private Enum loadCapacity;

    public FreightCar(String brand, String model, double engineCapacity, Enum loadCapacity) {
        super(brand, model, engineCapacity);
        this.loadCapacity = Objects.requireNonNullElse(loadCapacity, NULL_LOAD);
    }
    public enum LoadCapacity{
        N1(null, 3.5f),
        N2(3.5f, 12.0f),
        N3(12.0f, null),
        NULL_LOAD(null, null);
        private final Float bottomBound;
        private final Float upperBound;
        LoadCapacity(Float bottomBound, Float upperBound) {
            this.bottomBound = bottomBound;
            this.upperBound = upperBound;
        }
        public float getBottomBound() {
            return bottomBound;
        }
        public float getUpperBound() {
            return upperBound;
        }
        @Override
        public String toString() {
            if (bottomBound == null)
                return "Грузоподъемность: до " + upperBound + " тонн";
            if (upperBound == null)
                return "Грузоподъемность: от " + bottomBound + " тонн";
            return "Грузоподъемность: от " + bottomBound +
                    " до " + upperBound + " тонн";
        }
    }
    public void printType() {
        System.out.println(Validation.doEnumValidation(loadCapacity));
    }

    public Enum getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Enum loadCapacity) {
        this.loadCapacity = Objects.requireNonNullElse(loadCapacity, NULL_LOAD);
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
