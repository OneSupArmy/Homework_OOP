package homeworkOOP.transport;

import homeworkOOP.utility.TransportTypeException;

import static homeworkOOP.utility.Validation.doStringValidation;

public abstract class Transport implements Competing{
    private String brand;
    private String model;
    private double engineCapacity;

    public Transport(String brand, String model, double engineCapacity) {
        this.brand = doStringValidation(brand);
        this.model = doStringValidation(model);
        this.engineCapacity = Math.max(engineCapacity,0);
    }
    public abstract void printType();
    public void startMoving(){
    }
    public void endMoving(){
    }
    public void doDiagnostic() {
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Брэнд - " + brand +
                ", модель - " + model +
                ", объем двигателя - " + engineCapacity + ".";
    }
}

