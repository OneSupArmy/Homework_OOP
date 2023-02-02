package homeworkOOP.transport;

import homeworkOOP.drivers.Driver;
import homeworkOOP.mechanics.Mechanics;

import java.util.ArrayList;
import java.util.List;

import static homeworkOOP.utility.Validation.doStringValidation;

public abstract class Transport implements Competing {
    private String brand;
    private String model;
    private double engineCapacity;
    private static List<Mechanics> mechanicsList = new ArrayList<>();

    public Transport(String brand, String model, double engineCapacity) {
        this.brand = doStringValidation(brand);
        this.model = doStringValidation(model);
        this.engineCapacity = Math.max(engineCapacity, 0);
    }

    public abstract void printType();
    public boolean isDiagnosticNeeded(){
        return true;
    }

    public void startMoving() {
    }

    public void endMoving() {
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

    public static void removeMechanic(Mechanics mechanic) {
        mechanicsList.remove(mechanic);
    }

    public static void setMechanic(Mechanics mechanic) {
        mechanicsList.add(mechanic);
    }
    public static void printMechanicList() {
        if (mechanicsList.isEmpty()) System.out.println("Список механиков пуст");
        else for (Mechanics t: mechanicsList) {System.out.println(t.toString());}
    }

    @Override
    public String toString() {
        return "Брэнд - " + brand +
                ", модель - " + model +
                ", объем двигателя - " + engineCapacity + ".";
    }
}

