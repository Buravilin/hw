package Lesson_4;
// для чтения русских символов, добавить и перезагрузить
//-Dfile.encoding=UTF-8 в Help | Edit Custom VM Options
public class Homework4 {
    public static void main(String[] args) {
        //Целочисленные типы
        byte integerByte;//8 бит,  от -128 до 127, дефолтное значение 0, кусь =)
        short integerShort; //16 бит  от -32768 до 32767, дефолтное значение 0
        int integerInt; //32 бит, от -2147483648 до 2147483647, дефолтное значение 0
        long integerLong; //64 бит, от -9223372036854775808L до 9223372036854775807L,
                          // дефолтное значение 0L
        //Типы с плавающей точкой
            //Знак хранится отдельно от самого значения числа (в старшем бите),
            //В эти диапазоны не входит ноль.
            //Под него выделены отдельные специальные значения.
            //Из-за того, что знак хранится отдельно, ноль может быть положительным или отрицательным
        float floatingFloat; // 32 бит, без учета знака от 3.4e-38 до 3.4e+38,
                             // с учетом знака от 1.4e-45f до 3.4e+38f, дефолтное значение 0.0f
        double floatingDouble; // 64 бит, без учета знака от 1.7e-308 до 1.7e+308,
                               //с учетом знака от 4.9e-324 до 1.7e+308 дефолтное значение 0.0d
        //Cимвольный тип
        char symbolChar; // 16 бит (0 ; 65535),дефолтное значение '\u0000'
        //Логический тип
        boolean TrueValue = true;// дефолтное значение false

        // Операторы математические(бинарные арифметические операторы) + - * / %
        // Операторы условные(сравнения) > < >= <= == !=
        // Операторы логические && - "И", || - "ИЛИ", ! - "НЕ", ^ - "Логическое исключающее ИЛИ",
        // и побитовые & и |
        // Операторы инкремента-декремента ++, --

        // ))1((
        int a = 88;
        int b = 89;
        double c = 8.8;
        double d = 8.9;
        System.out.println(a>b);
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(a+c);
        System.out.println(b/d);
        // int x = 2147483648; превышение диапазона int
        // char y = 9999999999; превышение диапазона char

        // ))2((
        double floating = a*b+c/d;

        System.out.println(floating);
        /* ))3((
        1 ++ -- !
        2 * / %
        3 + -
        4 < <= > >=
        5 == !=
        6 && || */


        //Переполнение

        int integer1 = Integer.MAX_VALUE + 1;
        System.out.println(integer1 + " = Max_int + 1");
        long integer2 = Long.MIN_VALUE - 1;
        System.out.println(integer2 + " = Min_long - 1");
    }
}