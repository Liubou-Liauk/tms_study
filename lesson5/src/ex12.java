import java.util.Arrays;

public class ex12 {
    public static void main(String[] args) {
        int endpoint = 20;
        int sum = 0;

        for (int i = 1; i < endpoint; i++) {
            if ((i % 3) == 0) {
                sum += i;
                System.out.println(i + " is divided into 3");
            }
        }
        System.out.println("The sum equals to " + sum);
    }
}
//Найдите сумму первых n целых чисел, которые делятся на 3.