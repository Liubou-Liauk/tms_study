import java.util.Arrays;

public class ex16 {
    public static void main(String[] args) {
        int array[] = {123, 12, 78, 95, 84, 26, 45, 145};
        int indexOfMax = 0;
        int indexOfMin = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            } else if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        System.out.println("The maximum value of the massive is " + array[indexOfMax] + " and its index is " + indexOfMax);
        System.out.println("The maximum value of the massive is " + array[indexOfMin] + " and its index is " + indexOfMin);

        int sum = 0;
        for (int a = indexOfMin + 1; a < indexOfMax; a++) {
            sum += array[a];
        }
        System.out.println("The sum of the massive elements between the max and min values equals to " + sum);

    }
}
//Определите сумму элементов одномерного массива, расположенных между
//минимальным и максимальным значениями.