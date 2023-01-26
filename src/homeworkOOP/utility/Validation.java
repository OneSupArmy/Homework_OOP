package homeworkOOP.utility;

public abstract class Validation {
    public static String doStringValidation(String string) {
        return string == null || string.isBlank() ? "unknown" : string;
    }
}
