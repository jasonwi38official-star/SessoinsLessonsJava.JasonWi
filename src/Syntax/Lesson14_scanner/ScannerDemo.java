package Syntax.Lesson14_scanner;

import java.io.File;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner("Hello world");
        //Scanner scanner = new Scanner(new File("....."));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello mane name is " + name + " " + age);


    }
}
