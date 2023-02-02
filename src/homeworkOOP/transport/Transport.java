package homeworkOOP.transport;

import homeworkOOP.mechanics.Mechanic;

import java.util.ArrayList;
import java.util.List;

import static homeworkOOP.utility.Validation.doStringValidation;

public abstract class Transport implements Competing {
    private String brand;
    private String model;
    private double engineCapacity;
    private  List<Mechanic> mechanicsList = new ArrayList<>();

    public Transport(String brand, String model, double engineCapacity) {
        this.brand = doStringValidation(brand);
        this.model = doStringValidation(model);
        this.engineCapacity = Math.max(engineCapacity, 0);
    }

    public abstract void printType();
    public abstract boolean isDiagnosticNeeded();

    public abstract void startMoving();

    public abstract void endMoving();

    public abstract void doDiagnostic();

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

    public abstract void removeMechanic(Mechanic mechanic);

    public abstract void setMechanic(Mechanic mechanic);
    public abstract void printMechanicList();

    @Override
    public String toString() {
        return "Брэнд - " + brand +
                ", модель - " + model +
                ", объем двигателя - " + engineCapacity + ".";
    }
}

