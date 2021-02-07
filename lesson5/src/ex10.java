import java.util.Arrays;

public class ex10 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 6) + 10;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {

            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " equals to " + factorial);
    }
}

//Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
