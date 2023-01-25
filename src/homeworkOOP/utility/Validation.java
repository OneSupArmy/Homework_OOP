package homeworkOOP.utility;

import homeworkOOP.transport.Bus;
import homeworkOOP.transport.FreightCar;
import homeworkOOP.transport.LightCar;

public abstract class Validation {
    public static String doStringValidation(String string) {
        return string == null || string.isBlank() ? "unknown" : string;
    }
    public static String doEnumValidation(Enum enumType){
        //Захотелось отдельный метод для валидации, в итоге кода написал столько же (больше) еще и переменные в Enum лишние получил из за null)
        //В общем идея не удалась хоть и работает. Скажите если нужно переписать обратно.
        if (enumType instanceof Bus.AmountOfSeats){
            if (enumType.name().equals(Bus.AmountOfSeats.NULL_AMOUNT.name()))
                return "Данных по количетву сидений недостаточно";
            return "Тип автобуса: " + enumType.name();
        } else if (enumType instanceof FreightCar.LoadCapacity){
            if (enumType.name().equals(FreightCar.LoadCapacity.NULL_LOAD.name()))
                return "Данных по грузоподъемности недостаточно";
            return "Тип грузового автомобиля: " + enumType.name();
        } else if (enumType instanceof LightCar.CarType){
            if (enumType.name().equals(LightCar.CarType.NULL_TYPE.name()))
                return "Данных о типе автомобиля недостаточно";
            return "Тип легкового автомобиля: " + enumType.name();
        } else {
            return "Данных по транспортному средству недостаточно";
        }
    }
}
