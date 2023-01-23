package homeworkOOP.drivers;

import homeworkOOP.transport.LightCar;

public class DriverWithB extends Driver {
    LightCar car;

    public DriverWithB(String name, boolean isDriverWithLicense, int experience) {
        super(name, isDriverWithLicense, experience);
    }
    public void setCar(LightCar car) {
        if (!this.isDriverWithLicense()) {
            System.out.println("Невозоможно назначить легковую машину водителю " + getName() + ". Отстутствует лицензия");
            return;
        }
        if (this.car != null)
            this.car.removeDriver();
        this.car = car;
        if (car.getDriver() == null || !car.getDriver().equals(this))
            car.setDriver(this);
    }
    public void removeCar() {
        this.car = null;
    }
    public LightCar getCar() {
        return car;
    }
    public String getMassage(){
        //Видимо тут нужны были дженерики но я уже задал поле которое делает тоже самое О_о, скажите если нужно переделать
        if (car == null)
            return "водитель " + getName() + " свободен и не учатсвует в заезде";
        return "водитель " + getName() + " управляет автомобилем " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде";
    }
}
