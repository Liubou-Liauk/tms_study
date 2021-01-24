package lesson4;


public class additional4 {
    public static void main(String[] args) {
        int a = 115;
        int b = 0;
        int c = -10;
        if (a > 0 & b > 0 & c > 0) System.out.println("There are 3 positive integers. ");
        else if (a > 0 & b > 0 || b > 0 & c > 0 || a > 0 & c > 0) System.out.println("There are 2 positive integers");
        else if (a <= 0 & b <= 0 & c <= 0) System.out.println("There are no positive integers");
        else System.out.println("There is one positive integer");

    }

}
//Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.