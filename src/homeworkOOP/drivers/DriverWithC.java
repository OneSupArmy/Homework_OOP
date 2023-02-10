package homeworkOOP.drivers;

import homeworkOOP.transport.Bus;

import java.util.Objects;

public class DriverWithC extends Driver {
    private Bus bus;

    public DriverWithC(String name, boolean isDriverWithLicense, int experience) {
        super(name, isDriverWithLicense, experience);
    }
    public void setBus(Bus bus) {
        if (!this.isDriverWithLicense()) {
            System.out.println("Невозоможно назначить аутобус водителю " + getName() + ". Отстутствует лицензия");
            return;
        }
        if (this.bus != null)
            this.bus.removeDriver();
        this.bus = bus;
        if (bus.getDriver() == null || !bus.getDriver().equals(this))
            bus.setDriver(this);
    }
    public void removeBus() {
        this.bus = null;
    }
    public Bus getBus() {
        return bus;
    }
    public String getMassage(){
        if (bus == null)
            return "водитель " + getName() + " свободен и не учатсвует в заезде";
        return "водитель " + getName() + " управляет автомобилем " + bus.getBrand() + " " + bus.getModel() + " и будет участвовать в заезде";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DriverWithC)) return false;
        if (!super.equals(o)) return false;
        DriverWithC that = (DriverWithC) o;
        return Objects.equals(bus, that.bus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bus);
    }
}
