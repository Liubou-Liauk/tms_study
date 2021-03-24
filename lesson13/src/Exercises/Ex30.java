package Exercises;

import java.util.*;

public class Ex30 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            int a = (int) (Math.random() * 25 + 1);
            numbers.add(a);
        }
        System.out.println(numbers);
        Set<Integer> set = new HashSet<>(numbers);
        numbers.clear();
        numbers.addAll(set);


        System.out.println("The list without duplicates is the following " + numbers);
    }
}
//Задание 30
//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
//числа.