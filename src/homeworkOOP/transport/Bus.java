package homeworkOOP.transport;

import homeworkOOP.drivers.DriverWithC;
import homeworkOOP.mechanics.Mechanic;
import homeworkOOP.utility.TransportTypeException;

import java.util.ArrayList;
import java.util.List;

public class Bus extends Transport {
    private DriverWithC driver;
    private Enum amountOfSeats;

    private List<Mechanic> busMechanicsList = new ArrayList<>();

    public Bus(String brand, String model, double engineCapacity, Enum amountOfSeats) {
        super(brand, model, engineCapacity);
        this.amountOfSeats = amountOfSeats;
    }

    public void removeMechanic(Mechanic mechanic) {
        busMechanicsList.remove(mechanic);
    }
    public void setMechanic(Mechanic mechanic) {
        busMechanicsList.add(mechanic);
    }

    public void printMechanicList() {
        if (busMechanicsList.isEmpty()) System.out.println("У данного автобуса список механиков пуст");
        else for (Mechanic t: busMechanicsList) {System.out.println(t.toString());}
    }
    public List<Mechanic> getBusMechanicsList() {
        return busMechanicsList;
    }

    public enum AmountOfSeats {
        EXTRA_SMALL(null, 10),
        SMALL(null, 25),
        MEDIUM(40, 50),
        LARGE(60, 80),
        EXTRA_LARGE(100, 120);
        private final Integer bottomBound;
        private final Integer upperBound;


        AmountOfSeats(Integer bottomBound, Integer upperBound) {
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
                return "Вместимость: до " + upperBound + " человек.";
            return "Вместимость: от " + bottomBound + " до " + upperBound + " человек.";
        }
    }

    public void printType() {
        if (amountOfSeats == null) {
            System.out.println("Данных по количетву сидений недостаточно");
        } else {
            System.out.println("Тип автобуса: " + amountOfSeats.name());
        }
    }

    public Enum getAmountOfSeats() {
        return amountOfSeats;
    }

    public void setAmountOfSeats(Enum amountOfSeats) {
        this.amountOfSeats = amountOfSeats;
    }
    @Override
    public boolean isDiagnosticNeeded() {
        return false;
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
    public void doDiagnostic() {
        try {
            throw new TransportTypeException("”Автобусы” диагностику проходить не должны");
        } catch (TransportTypeException e){
            System.out.println(e.getMessage());
        }
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
