package lesson4;

import java.util.Arrays;

public class ex6 {
    public static void main(String[] args) {
        int n = 5642;
        if (n >= 100 & n < 1000)
            System.out.println(n + " is a three-digit number.");
        else System.out.println(n + " isn't a three-digit number.");

        int a = n % 10;
        if (a == 7) System.out.println("7 is the last number in " + n);
        else System.out.println("7 isn't the last number in " + n);

        int b = n % 2;
        if ( b != 0) System.out.println(n + " is an odd number.");
        else System.out.println(n + " is an even number.");
    }
}
//Создайте число. Определите, является ли число трехзначным. Определите, является
//ли его последняя цифра семеркой. Определите, является ли число четным.