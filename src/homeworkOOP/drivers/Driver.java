package homeworkOOP.drivers;

import homeworkOOP.utility.Validation.*;

import static homeworkOOP.utility.Validation.doStringValidation;

public abstract class Driver {
private String name;
private boolean isDriverWithLicense;
private int experience;

    public Driver(String name, boolean isDriverWithLicense, int experience) {
        this.name = doStringValidation(name);
        this.isDriverWithLicense = isDriverWithLicense;
        this.experience = Math.max(experience,0);
    }

    public void startMoving(){
        System.out.println("Водитель начал движение");
    }
    public void endMoving(){
        System.out.println("Водитель закончил движение");
    }
    public void fillTheTank(){
        System.out.println("Водитель заправился");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDriverWithLicense() {
        return isDriverWithLicense;
    }

    public void setDriverWithLicense(boolean driverWithLicense) {
        isDriverWithLicense = driverWithLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    @Override
    public String toString() {
        return "Ф.И.О. - " + name +
                ", наличие водительских прав - " + isDriverWithLicense +
                ", опыт вождения - " + experience;
    }
}
