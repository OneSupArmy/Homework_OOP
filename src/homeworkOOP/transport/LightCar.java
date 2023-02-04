package homeworkOOP.transport;

import homeworkOOP.drivers.DriverWithB;
import homeworkOOP.mechanics.Mechanic;

import java.util.ArrayList;
import java.util.List;

public class LightCar extends Transport {
    private DriverWithB driver;
    private Enum carType;
    private List<Mechanic> lightCarMechanicsList = new ArrayList<>();
    public LightCar(String brand, String model, double engineCapacity, Enum carType) {
        super(brand, model, engineCapacity);
        this.carType = carType;
    }

    public void removeMechanic(Mechanic mechanic) {
        lightCarMechanicsList.remove(mechanic);
    }

    public void setMechanic(Mechanic mechanic) {
        lightCarMechanicsList.add(mechanic);
    }
    public void printMechanicList() {
        if (lightCarMechanicsList.isEmpty()) System.out.println("У данного легкого автомобиля список механиков пуст");
        else for (Mechanic t: lightCarMechanicsList) {System.out.println(t.toString());}
    }

    public List<Mechanic> getLightCarMechanicsList() {
        return lightCarMechanicsList;
    }

    public enum CarType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбэк"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        private final String carType;

        private CarType(String carType) {
            this.carType = carType;
        }

        public String getCarType() {
            return carType;
        }

        @Override
        public String toString() {
            return "Тип машины: " + carType;
        }
    }
    public void printType(){
        if (carType == null) {
            System.out.println("Данных о типе автомобиля недостаточно");
        } else {
            System.out.println("Тип легкового автомобиля: " + carType.name());
        }
    }
    @Override
    public boolean isDiagnosticNeeded() {
        return true;
    }

    public Enum getCarType() {
        return carType;
    }

    public void setCarType(Enum carType) {
        this.carType = carType;
    }

    public void setDriver(DriverWithB driver) {
        if (!driver.isDriverWithLicense()) {
            System.out.println("Невозоможно назначить машину водителю " + driver.getName() + ". Отстутствует лицензия");
            return;
        }
        if (this.driver != null)
            this.driver.removeCar();
        this.driver = driver;
        if (driver.getCar() == null || !driver.getCar().equals(this))
            driver.setCar(this);
    }

    public DriverWithB getDriver() {
        return driver;
    }

    public void removeDriver() {
        this.driver = null;
    }

    @Override
    public void doDiagnostic() {
        System.out.println("Автомобиль прошел диагностику");
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус поехал");
    }

    @Override
    public void endMoving() {
        System.out.println("Автобус остановился");
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