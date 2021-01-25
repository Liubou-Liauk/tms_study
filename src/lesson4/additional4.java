package lesson4;


import java.util.Arrays;

public class additional4 {
    public static void main(String[] args) {
        int a = 115;
        int b = 0;
        int c = -10;
        int x = 0;
        int y = 0;

        if (a > 0) x++;
        if (a < 0) y++;

        if (b > 0) x++;
        if (b < 0) y++;

        if (c > 0) x++;
        if (c < 0) y++;

        if (x == 1) System.out.println("There is one positive integer");
        else if (x == 0) System.out.println("There are no positive integers");
        else System.out.println("There are " + x + " positive integers. ");

    }

}
//Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.