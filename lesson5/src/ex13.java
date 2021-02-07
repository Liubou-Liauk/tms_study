import java.util.Arrays;

public class ex13 {
    public static void main(String[] args) {
        int array[] = {12, 54, 16, 0, 8, 94, 458, 17};
        for (int i = 0; i < array.length - 1; i++) {
            for (int index = 0; index < array.length - 1 - i; index++) {
                if (array[index] > array[index + 1]) {
                    int tmp = array[index];
                    array[index] = array[(index + 1)];
                    array[(index + 1)] = tmp;

                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        System.out.println("The maximum value of the massive is " + array[array.length - 1]);
    }
}
//Создать последовательность случайных чисел, найти и вывести наибольшее из них.


