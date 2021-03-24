package Exercises;

import java.util.*;

public class Ex29 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++) {
            int a = (int) (Math.random() * 10 + 1);
            marks.add(a);
        }
            System.out.println("The list of marks is the following " + marks);
            for (Iterator<Integer> it = marks.iterator(); it.hasNext(); )
                if (it.next() < 4)
                    it.remove();
            System.out.println("The list of marks excluding negative marks: " + marks);

        }
    }

//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Удалить неудовлетворительные оценки из списка.