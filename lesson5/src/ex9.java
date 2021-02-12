import java.util.Arrays;

public class ex9 {
    public static void main(String[] args) {

        double averageMultiply = 0;
        double multiply = 1;
        int initial = 0;
        int x = (int) (Math.random() * 20);

        while (x != 0) {
            multiply *= x;
            initial++;
            x = (int) (Math.random() * 20);
        }
        if (initial != 0) {
            averageMultiply = multiply / initial;
        }else {
            averageMultiply = 0;
        }
        System.out.println("Factorial " + averageMultiply);
        System.out.println("The number of iterations " + initial);
    }
}




// Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
//произведение, т.е. факториал числа.



