package homeworkOOP.transport;

import homeworkOOP.drivers.DriverWithD;
import homeworkOOP.mechanics.Mechanic;

import java.util.ArrayList;
import java.util.List;

public class FreightCar extends Transport{
    private DriverWithD driver;
    private Enum loadCapacity;
    private List<Mechanic> freightCarMechanicsList = new ArrayList<>();

    public FreightCar(String brand, String model, double engineCapacity, Enum loadCapacity) {
        super(brand, model, engineCapacity);
        this.loadCapacity = loadCapacity;
    }
    public void removeMechanic(Mechanic mechanic) {
        freightCarMechanicsList.remove(mechanic);
    }

    public void setMechanic(Mechanic mechanic) {
        freightCarMechanicsList.add(mechanic);
    }
    public void printMechanicList() {
        if (freightCarMechanicsList.isEmpty()) System.out.println("У данного грузового автомобиля список механиков пуст");
        else for (Mechanic t: freightCarMechanicsList) {System.out.println(t.toString());}
    }
    public enum LoadCapacity{
        N1(null, 3.5f),
        N2(3.5f, 12.0f),
        N3(12.0f, null);
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
        if (loadCapacity == null) {
            System.out.println("Данных по грузоподъемности недостаточно");
        } else {
            System.out.println("Тип грузового автомобиля: " + loadCapacity.name());
        }
    }

    @Override
    public boolean isDiagnosticNeeded() {
        return true;
    }

    public Enum getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Enum loadCapacity) {
        this.loadCapacity = loadCapacity;
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
    public void doDiagnostic() {
        System.out.println("Грузовой автомобиль прошел диагностику");
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
