package lesson4;

import java.util.Arrays;

public class ex5 {
    public static void main(String[] args) {
        int n = ;
        int a = n % 1000;
        int b = a % 100;
        int n4 = b % 10;
        int n3 = (b - n4) / 10;
        int n2 = (a - b) / 100;
        int n1 = (n - a) / 1000;
        if (n4 != n3 & n4 != n2 & n4 != n1 & n3 != n2 & n3 != n1 & n2 != n1)
            System.out.println("All the numbers differ in " + n);
        else System.out.println("There are recurring numbers in " + n);

    }
}
//Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
//различны?