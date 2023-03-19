package basic.lessons;

        // однострочный комментарий в java

/*
    многострочный комментарий в java. Все, что находится в пределах конструкции /* ... * / не влияет на выполнение кода
    таким образом можно закомментировать отдельные куски кода, например целые методы
*/

/**
* многострочный комментарий. Обычно данную конструкцию используют для того, чтобы оставитб комментарий в коде с
 * пояснениями работы отдельного класса, метода и тп.
 */

public class LessonOne {
    public static void main(String[] args) {
        // примитивные типы (не ссылочные) характеризуются тем, что хранятся в стек памяти jvm (быстрая память)

        //целочисленные
        byte myByte = 10; // 8 бит	от -128 до 127
        short myShort = 10; // 16 бит	от -32768 до 32767
        int myInt = 10; // 32 бит	от -2147483648 до 2147483647
        long myLong = 10l; // 64 бит	от -9223372036854775808L до 9223372036854775807L

        //Типы с плавающей точкой
        float myFloat = 1.0f; // 32 бит	от 1.4e-45f до 3.4e+38f
        double myDouble = 1.0; // 64 бит	от 4.9e-324 до 1.7e+308
        //в данном случае, количество бит характеризует количество чисел после запятой
        System.out.println("double 1.0 / 3 = " + (myDouble / 3));
        System.out.println("float 1.0f / 3 = " + (myFloat / 3));

        // 16 бит	беззнаковое целое число, представляющее собой символ UTF-16 (буквы и цифры)
        // можно приравнивать, как непосредственно к числу, так и к конкретному символу, закдюченному в одинарные
        // ковычки
        char myChar = 99;
        char anotherChar = 'd';

        myInt = anotherChar;
        System.out.println(myChar);
        System.out.println(myInt);

        //Логический тип
        // может принимать лишь 2 значения - true (истина) или false (ложь)
        // В стандартной реализации Sun JVM и Oracle HotSpot JVM тип boolean занимает 4
        // байта (32 бита), как и тип int. Однако, в определенных версиях JVM имеются реализации, где в массиве boolean
        // каждое значение занимает по 1-му биту.
        boolean myBoolean = true;

        // ссылочные типы данных - все остальные переменные.
        String str = "hello!";

        System.out.println("простейшие математические операции:");
        int x = 10;
        int y = 3;
        System.out.println("сложение:");
        System.out.println(x + y);
        System.out.println("вычитание:");
        System.out.println(x - y);
        System.out.println("умножение:");
        System.out.println(x * y);
        System.out.println("деление на цело (возвращает целую часть от полученной дроби):");
        System.out.println(x / y);
        System.out.println("остаток от деления (возвращает оставшуюся часть, от деления):");
        System.out.println(x % y);

        //опереции деления на цело и остаток от деления актальны лишь для целочисленных типов данных.
        // в слечае, если мы хотим получить дробный результат деления используя два целочисленных значения,
        // следует привести их изначально к числу с плавающей точкой
        double d = x;
        System.out.println(d / y);

        // наследование знака в операциях деления и остатка от деления отличаются:
        System.out.println("наследование знака при делении на цело");
        System.out.println("10 / 3 = " + 10 / 3);
        System.out.println("-10 / 3 = " + -10 / 3);
        System.out.println("10 / -3 = " + 10 / -3);
        System.out.println("-10 / -3 = " + -10 / -3);

        System.out.println("\nнаследование знака при получении остатка от деления");
        System.out.println("10 % 3 = " + 10 % 3);
        System.out.println("-10 % 3 = " + -10 % 3);
        System.out.println("10 % -3 = " + 10 % -3);
        System.out.println("-10 % -3 = " + -10 % -3);


    }
}