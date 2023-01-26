package homeworkOOP.drivers;

import homeworkOOP.transport.Bus;

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
        //Видимо тут нужны были дженерики но я уже задал поле которое делает тоже самое О_о, скажите если нужно переделать
        if (bus == null)
            return "водитель " + getName() + " свободен и не учатсвует в заезде";
        return "водитель " + getName() + " управляет автомобилем " + bus.getBrand() + " " + bus.getModel() + " и будет участвовать в заезде";
    }
}
