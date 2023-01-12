package Homework_OOP;

public class Utility {
    public static String doStringValidation(String stringToCheck) {
        if (stringToCheck == null || stringToCheck.equals(""))
            return "default";
        return stringToCheck;
    }
    public static void doMonthValidation (int month){
        if (month <=0 || month > 12)
            throw new IllegalArgumentException("Uncorrected month");
    }
}


