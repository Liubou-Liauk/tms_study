import java.util.Arrays;

public class ex11 {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 100);
        boolean simple;
        if (number < 2) simple = false;
        else simple = true;

        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                simple = false;
                break;
            }
        }
        if (simple) System.out.println(number + " is a simple number.");
        else System.out.println(number + " isn't a simple number. ");
    }
}

//Имеется целое число, определить является ли это число простым, т.е.
//делится без остатка только на 1 и себя.
