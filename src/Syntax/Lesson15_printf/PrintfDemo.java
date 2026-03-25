package Syntax.Lesson15_printf;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PrintfDemo {
    public static void main(String[] args) {

        //%s - String-Строка
        var name = "Jason";
        System.out.printf("Hello, %s!%n", name);

        //%d - десятичное число
        int age = 33;
        System.out.printf("I'm %d years old.%n", age);

        //%f - дробное число
        double height = 1.78;
        System.out.printf("My height is %1.1f m.%n", height);

        //%tF %tT - дата время

        LocalDateTime now = LocalDateTime.now();
        System.out.printf("Current date and time: %tF %tT", now, now);
    }
}
