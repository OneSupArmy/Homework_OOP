package homeworkOOP.transport;

public interface Competing {
    default void pitStop(){
        System.out.println("Пит-стоп");
    }
    default void bestCircleTime(){
        System.out.println("Лучшее время круга");
    }
    default void maxSpeed(){
        System.out.println("Максимальная скорость");
    }
}