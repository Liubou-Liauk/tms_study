package hw_lesson8;

import java.util.Arrays;

public class ex21 {
    public static void main(String[] args) {
        {
            long startTime = System.currentTimeMillis();
            String str = " To be, or   not to be, that is the question: Whether 'tis nobler in the mind to suffer";
            str += "The slings and arrows";
            str += "of outrageous fortune,";
            str += "Or to take arms against a sea of troubles";
            System.out.println(str);
            long endTime = System.currentTimeMillis();
            System.out.println("That took " + (endTime - startTime) + " milliseconds");
        }
        {
            long startTime = System.currentTimeMillis();
            StringBuilder str2 = new StringBuilder("To be, or   not to be, that is the question: Whether 'tis nobler in the mind to sufferThe slings and arrowsof outrageous fortune,Or to take arms against a sea of troubles");
            str2.append("and by opposing end them");
            str2.append("To die—to sleep, No more; and by a sleep ");
            str2.append("to say we end The heart-ache and the thousand natural");
            System.out.println(str2);
            long endTime = System.currentTimeMillis();
            System.out.println("That took " + (endTime - startTime) + " milliseconds");
        }
        {
            long startTime = System.currentTimeMillis();
            StringBuffer str3 = new StringBuffer("To be, or   not to be, that is the question: Whether 'tis nobler in the mind to sufferThe slings and arrowsof outrageous fortune,Or to take arms against a sea of troubles");
            str3.append("and by opposing end them");
            str3.append("To die—to sleep, No more; and by a sleep ");
            str3.append("to say we end The heart-ache and the thousand natural");
            System.out.println(str3);

            long endTime = System.currentTimeMillis();
            System.out.println("That took " + (endTime - startTime) + " milliseconds");

        }
    }
}

//Задание 21
//Напишите три цикла выполняющих многократное сложение строк, один с
//помощью оператора сложения и String, другой с помощью StringBuilder и метода
//append, а также аналогино для StringBuffer. Сравните скорость их выполнения.