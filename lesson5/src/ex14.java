import java.util.Arrays;

public class ex14 {
    public static void main(String[] args) {
        int array[] = {10, 5, 8, 9, 6, 4, 7, 3, 1, 0};
        for (int i = 0; i < array.length - 1; i++) {
            for (int index = 0; index < array.length - 1 - i; index++) {
                if (array[index] > array[index + 1]) ;
                int tmp = array[index];
                array[index] = array[(index + 1)];
                array[(index + 1)] = tmp;
            }

        }
        for (int i= 0; i< array.length; i++);
        System.out.println(array[array.length-1] + " is the highest mark.");
        System.out.println(array[0] + " is the lowest mark.");
    }
}
////Создать массив оценок произвольной длины, вывести максимальную и
////минимальную оценку, её (их) номера.