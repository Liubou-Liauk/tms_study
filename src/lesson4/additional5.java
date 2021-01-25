package lesson4;

public class additional5 {
    public static void main(String[] args) {
        int a = -15;
        int b = 0;
        int c = 10;
        int x = 0;
        int y = 0;

        if (a > 0) x++;
        if (a < 0) y++;

        if (b > 0) x++;
        if (b < 0) y++;

        if (c > 0) x++;
        if (c < 0) y++;


        System.out.println("The number of positive integers is " + x);
        System.out.println("The number of negative integers is " + y);

    }
}
//Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.