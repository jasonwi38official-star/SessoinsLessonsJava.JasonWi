package Syntax.Lesson10_String;

import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {

        String strName = "Jason";
        String strLastName = new String("Wi");
        System.out.println(strName + " " + strLastName);

        // equals - сравнение значечий реременных типа данных String
        // equalsIgnoreCase - равнение значечий реременных типа данных String, с игнорированием регистра.
        String firstString = "Hello";
        var secondString = "hello";
        System.out.println("Is two string equals: " + firstString.equals(secondString));
        System.out.println("Is two string equals(IgnoreCase): " + firstString.equalsIgnoreCase(secondString));

        //Получение размера строки
        System.out.println("The length of strName: " + strName.length());

        //Получение подстроки
        String greeting = "Hello, World!";
        String substring = greeting.substring(
                greeting.indexOf("W"),   //7
                greeting.indexOf("!")    //12
        );
        System.out.println(substring);


        //Проверка наличия подстроки


        String greetingWithUpperCase = greeting.toUpperCase();
        String greetingWithLowerCase = greeting.toLowerCase();
        System.out.println("greetingWithUpperCase: " + greetingWithUpperCase);
        System.out.println("greetingWithLowerCase: " + greetingWithLowerCase);

        System.out.println("The string contains \"World\": " + greetingWithUpperCase.contains("WORLD"));


        //Удаление пробелов (trim)
        var login = "   jason_wind  ";
        String loginAfterTrim = login.trim();
        System.out.println("loginAfterTrim: " + loginAfterTrim);

        //replace()
        var loginAfterReplace = login.trim().replace("_", ".");
        System.out.println("loginAfterReplace: " + loginAfterReplace);


        // StringBuffer - длямногопоточного
        StringBuffer sb = new StringBuffer("Hello,");
        sb.append(" ");
        sb.append("Jason");
        sb.append(" ");
        sb.append("Wind!");
        System.out.println(sb);

    }
}
