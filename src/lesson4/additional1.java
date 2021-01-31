package lesson4;

import java.util.Arrays;

public class additional1 {
    public static void main(String[] args) {
        int a = -115;

        if (a >= 1 & a <= 9) System.out.println(a + " is a one-digit positive number");
        else if (a == -1 & a >= -9) System.out.println(a + " is a one-digit negative number");

        if (a >= 10 & a < 100) System.out.println(a + " is a two-digit positive number");
        else if (a <= -10 & a > -100) System.out.println(a + " is a two-digit negative number");

        if (a >= 100 & a < 1000) System.out.println(a + " is a three-digit positive number");
        else if (a <= -100 & a > -1000) System.out.println(a + " is a three-digit negative number");

        else if (a == 0) System.out.println(a + " is a one-digit integer");
    }
}





//В переменную записываем число.
// Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
// Например, "это однозначное положительное число".
// Достаточно будет определить, является ли число однозначным, "двузначным или трехзначным и более.