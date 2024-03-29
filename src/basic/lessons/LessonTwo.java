package basic.lessons;

import java.util.Scanner;

public class LessonTwo {

        //    SCANNER
//    Это самый простой способ чтения ввода в программе Java.

    public static void main(String[] args) {
        // Declare the object and initialize with
        // predefined standard input object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first phrase");
        String str1 = scanner.nextLine();

        System.out.println("Enter second phrase");
        String str2 = scanner.next();

        System.out.println(str1);
        System.out.println(str2);
//         diffRepresentation();
//         simpleBot(scanner);
//         tryScanner(scanner);
    }

    static void diffRepresentation() {
        System.out.println("99 in binary representation = " + Integer.toBinaryString(99));
        System.out.println("1000 in binary representation = " + Integer.toBinaryString(1000));
        System.out.println("1024 in binary representation = " + Integer.toBinaryString(1024));
        System.out.println("255 in binary representation = " + Integer.toBinaryString(255));

        System.out.println("99 in hex representation = " + Integer.toHexString(99));
        System.out.println("1000 in hex representation = " + Integer.toHexString(1000));
        System.out.println("1024 in hex representation = " + Integer.toHexString(1024));
        System.out.println("255 in hex representation = " + Integer.toHexString(255));

        System.out.println("99 in octagonal representation = " + Integer.toOctalString(99));
        System.out.println("1000 in octagonal representation = " + Integer.toOctalString(1000));
        System.out.println("1024 in octagonal representation = " + Integer.toOctalString(1024));
        System.out.println("255 in octagonal representation = " + Integer.toOctalString(255));
    }

    static void tryScanner(Scanner scanner) {

        System.out.println("Enter your name please");
        String name = scanner.nextLine();
        System.out.println("Enter your rate please");
        double rate = scanner.nextDouble();
        System.out.println("enter current year please");
        int year = scanner.nextInt();
        System.out.printf("Hello %s, you have %.2f rate, right now is %d year", name, rate, year);
    }
    static void simpleBot(Scanner scanner) {
        System.out.println("Enter your name please:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Enter your age please:");
        double age = scanner.nextDouble();
        System.out.println("You was born in " + (2022 - age));
        System.out.println("enter char please");
        char c = scanner.next().charAt(0);
        System.out.println(c);
    }
}