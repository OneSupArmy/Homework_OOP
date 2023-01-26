package homeworkOOP.transport;

import homeworkOOP.drivers.DriverWithB;

public class LightCar extends Transport {
    private DriverWithB driver;
    private Enum carType;
    public LightCar(String brand, String model, double engineCapacity, Enum carType) {
        super(brand, model, engineCapacity);
        this.carType = carType;
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