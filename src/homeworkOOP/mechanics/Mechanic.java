package homeworkOOP.mechanics;

import static homeworkOOP.utility.Validation.doStringValidation;

public class Mechanic {
    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = doStringValidation(name);
        this.company = doStringValidation(company);
    }
    public void repairCar() {
        System.out.println("Механик " + name + " починил транспортное средство");

    }

    public void doDiagnostic(){
        System.out.println("Механик " + name + " провел диагностику");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Механик: " + name +
                ", компания: " + company;
    }
}
