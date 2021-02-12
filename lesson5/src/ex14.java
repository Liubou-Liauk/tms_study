package src;

import java.net.BindException;
import java.util.Arrays;

public class ex14 {
    public static void main(String[] args) {
        int array[] = {10, 5, 8, 9, 6, 4, 7, 3, 1, 15};

        for (int i = 0; i < array.length - 1; i++) {
            for (int index = 0; index < array.length - 1 - i; index++) {
                if (array[index] > array[index + 1]) {
                    int tmp = array[index];
                    array[index] = array[(index + 1)];
                    array[(index + 1)] = tmp;
                }

            }
        }
        for (int i = 0; i < array.length; i++) ;
        int highest = array[array.length - 1];
        int lowest = array[0];
        int indexMax = Arrays.binarySearch(array, highest);
        int indexMin = Arrays.binarySearch(array, lowest);


        System.out.println(highest + " is the highest mark with index " + indexMax);
        System.out.println(lowest + " is the lowest mark with index " + indexMin);


    }
}

//Создать массив оценок произвольной длины, вывести максимальную и
//минимальную оценку, её (их) номера.