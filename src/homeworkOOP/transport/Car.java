package homeworkOOP.transport;


import java.time.LocalDate;
import java.util.ArrayList;
import static homeworkOOP.Utility.*;
import static homeworkOOP.Main.carList;
import static java.util.concurrent.TimeUnit.DAYS;


public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    final private String bodyType;
    private String registrationNumber;
    final private int amountOfSeats;
    private boolean winterTires;
    Key key;
    Insurance insurance;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               int maxSpeed,
               String transmission,
               String bodyType,
               String registrationNumber,
               int amountOfSeats,
               boolean winterTires,
               boolean remoteEngineStart,
               boolean keylessAccess,
               int days,
               String insuranceNumber,
               int costOfInsurance
    ) {
        super(brand, model, year, country, color, maxSpeed);
        this.bodyType = doDefaultValidation(bodyType);
        this.amountOfSeats = doSeatsValidation(amountOfSeats);
        this.engineVolume = doEngineValidation(engineVolume);
        this.winterTires = winterTires;
        this.transmission = doDefaultValidation(transmission);
        this.registrationNumber = doDefaultValidation(registrationNumber);
        key = new Key(remoteEngineStart, keylessAccess);
        insurance = new Insurance(days, insuranceNumber, costOfInsurance);

    }

    private Car(CarBuilder builder) {
        super(builder.brand, builder.model, builder.year, builder.country, builder.color, builder.maxSpeed);
        this.engineVolume = doEngineValidation(builder.engineVolume);
        this.transmission = doDefaultValidation(builder.transmission);
        this.bodyType = doDefaultValidation(builder.bodyType);
        this.registrationNumber = doDefaultValidation(builder.registrationNumber);
        this.amountOfSeats = doSeatsValidation(builder.amountOfSeats);
        this.winterTires = builder.winterTires;
        key = new Key(builder.remoteEngineStart, builder.keylessAccess);
        insurance = new Insurance(builder.days, builder.insuranceNumber, builder.costOfInsurance);
    }

    public class Insurance {
        //Дополнительное задание, дали на продленке
        private final int days;
        private final String isnsuranceNumber;
        private final int costOfInsurance;
        private final LocalDate firstDay;

        public Insurance(int days, String isnsuranceNumber, int costOfInsurance) {
            this.days = Math.max(days, 0);
            this.isnsuranceNumber = doInsuranceNumberValidation(isnsuranceNumber);
            this.costOfInsurance = Math.max(costOfInsurance, 0);
            this.firstDay = LocalDate.now();
        }

        public void checkInsurance() {
            String test = firstDay.plusDays(days).isAfter(LocalDate.now()) ? "Ok" : "Иди продлевай";
            System.out.println(test);
        }
        public long daysUntilInsuranceEnd() {
            return days - DAYS.toChronoUnit().between(insurance.firstDay, LocalDate.now());
        }

        public void checkInsuranceNumber() {
            System.out.println(isnsuranceNumber.replace(" ", "").length() == 9 ? "Ok" : "ne ok");
        }
    }

    private class Key {
        final private boolean remoteEngineStart;
        final private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
    }

    public boolean isRemoteEngineStart() {
        return key.remoteEngineStart;
    }

    public boolean isKeylessAccess() {
        return key.keylessAccess;
    }



    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = doEngineValidation(engineVolume);
    }



    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = doDefaultValidation(transmission);
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = doDefaultValidation(registrationNumber);
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public static void printAllCars(ArrayList<Car> list) {
        for (Car k : list) {
            System.out.println(k.toString());
        }
    }

    public static void changeTiresOnSeasons(Car car, int month) {
        doMonthValidation(month);
        car.setWinterTires(month == 12 || (month >= 1 && month <= 3));
    }

    public static void changeAllTiresOnSeasons(int month) {
        doMonthValidation(month);
        for (int i = 0; i < carList.size(); i++)
            carList.get(i).setWinterTires(month == 12 || (month >= 1 && month <= 3));
    }

    public static class CarBuilder {
        private String brand;
        private String model;
        private double engineVolume;
        private String color;
        private int year;
        private String country;
        private String transmission;
        private String bodyType;
        private String registrationNumber;
        private int amountOfSeats;
        private boolean winterTires;
        private boolean remoteEngineStart;
        private boolean keylessAccess;
        private int days;
        private String insuranceNumber;
        private int costOfInsurance;
        private int maxSpeed;

        public CarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }
        public CarBuilder maxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder engineVolume(double engineVolume) {
            this.engineVolume = engineVolume;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder year(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder country(String country) {
            this.country = country;
            return this;
        }

        public CarBuilder bodyType(String bodyType) {
            this.bodyType = bodyType;
            return this;
        }

        public CarBuilder amountOfSeats(int amountOfSeats) {
            this.amountOfSeats = amountOfSeats;
            return this;
        }

        public CarBuilder winterTires(boolean winterTires) {
            this.winterTires = winterTires;
            return this;
        }

        public CarBuilder key(boolean remoteEngineStar, boolean keylessAcces) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAcces;
            return this;
        }

        public CarBuilder insurance(int days, String isnsuranceNumber, int costOfInsurance) {
            this.days = days;
            this.insuranceNumber = isnsuranceNumber;
            this.costOfInsurance = costOfInsurance;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

    @Override
    public String toString() {
        String temp = super.toString() + ", мощность двигателя: " + engineVolume +
                ", коробка передач: " + transmission +
                ", тип кузова: " + bodyType +
                ", регистрационный номер: " + registrationNumber +
                ", количсетво мест: " + amountOfSeats +
                ", зимня резина: " + winterTires;
        if (key.keylessAccess || key.remoteEngineStart) {
            temp += ", запуск без ключа: " + key.keylessAccess +
                    ", дистанционный запуск двигателя: " + key.remoteEngineStart;
        }
        if (insurance.costOfInsurance != 0 && insurance.days != 0) {
            temp += ", прошло : " + insurance.daysUntilInsuranceEnd() +
                    ", номер страховки: " + insurance.isnsuranceNumber +
                    ", стоимость страховки: " + insurance.costOfInsurance;
        }
        return temp;
    }
}