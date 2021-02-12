import java.util.Arrays;

public class additional3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int a = 1; a <= 256; a *= 2) {
            sum += a;
            System.out.println(a);
        }
        System.out.println("the sum of the values equal yo " + sum);
    }
}
//3)Вычислить: 1+2+4+8+...+256