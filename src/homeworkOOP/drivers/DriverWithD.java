package homeworkOOP.drivers;

import homeworkOOP.transport.FreightCar;

public class DriverWithD extends Driver {
    private FreightCar freightCar;
    public DriverWithD(String name, boolean isDriverWithLicense, int experience) {
        super(name, isDriverWithLicense, experience);
    }
    public void setFreightCar(FreightCar freightCar) {
        if (!this.isDriverWithLicense()) {
            System.out.println("Невозоможно назначить грузовую машину водителю " + getName() + ". Отстутствует лицензия");
            return;
        }
        if (this.freightCar != null)
            this.freightCar.removeDriver();
        this.freightCar = freightCar;
        if (freightCar.getDriver() == null || !freightCar.getDriver().equals(this))
            freightCar.setDriver(this);
    }
    public void removeCar() {
        this.freightCar = null;
    }
    public FreightCar getFreightCar() {
        return freightCar;
    }
    public String getMassage(){
        //Видимо тут нужны были дженерики но я уже задал поле которое делает тоже самое О_о, скажите если нужно переделать
        if (freightCar == null)
            return "водитель " + getName() + " свободен и не учатсвует в заезде";
        return "водитель " + getName() + " управляет автомобилем " + freightCar.getBrand() + " " + freightCar.getModel() + " и будет участвовать в заезде";
    }
}
