package Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ex31 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();

        for (int i = 0; i <= 8; i++) {
            int a = (int) (Math.random() * 10 + 1);
            marks.add(a);
        }
        System.out.println("The list of marks is the following " + marks);
        int maxMark = Collections.max(marks);
        for (Iterator<Integer> it = marks.iterator(); it.hasNext(); )
            if (it.next() == maxMark) ;
        System.out.println("The highest mark is " + maxMark);
    }
}

//Задание 31
//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.