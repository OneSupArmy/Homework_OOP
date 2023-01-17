package homeworkOOP;

import java.time.LocalDate;

public class Utility {
    public static String doDefaultValidation(String defaultCheck) {
        return defaultCheck == null || defaultCheck.isBlank() ? "default" : defaultCheck;
    }
    public static String doInsuranceNumberValidation(String insuranceNumber) {
        //Почему-то не работает регулярное выражение =(
        return insuranceNumber == null || insuranceNumber.isBlank() || insuranceNumber.matches("\\D*$")? "unknown" : insuranceNumber;
    }
    public static String doColorValidation(String color) {
        return color == null || color.isBlank() ? "white" : color;
    }
    public static int doSeatsValidation(int amountOfSeats) {
        return amountOfSeats <= 0 ? 4 : amountOfSeats;
    }
    public static int doYearValidation(int year) {
        return year <= 0 || year > LocalDate.now().getYear() ? LocalDate.now().getYear() : year;
    }
    public static double doEngineValidation(double engineVolume) {
        return engineVolume <= 0 ? 1.5 : engineVolume;
    }
    public static void doMonthValidation (int month){
        if (month <=0 || month > 12)
            throw new IllegalArgumentException("Uncorrected month");
    }
}


