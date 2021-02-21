package hw_lesson8;

import java.util.Arrays;

public class ex21 {
    public static void main(String[] args) {
            long startTime = System.currentTimeMillis();
            String str = " To be, or   not to be, that is the question: Whether 'tis nobler in the mind to suffer";
            for (int i = 0; i < 1000; i++) {
                    str += "The slings and arrows";
            };
            System.out.println(str);
            System.out.println("That took " + (System.currentTimeMillis()-startTime) + " milliseconds");


            long startTimeBuilder = System.currentTimeMillis();
            StringBuilder str2 = new StringBuilder("To be, or   not to be, that is the question: Whether 'tis nobler in the mind to sufferThe slings and arrowsof outrageous fortune,Or to take arms against a sea of troubles");
            for (int i = 0; i < 1000; i++) {
                    str2.append("and by opposing end them");
            }
            System.out.println(str2);
            System.out.println("That took " + (System.currentTimeMillis() - startTimeBuilder) + " milliseconds");


            long startTimeBuffer = System.currentTimeMillis();
            StringBuffer str3 = new StringBuffer("To be, or   not to be, that is the question: Whether 'tis nobler in the mind to sufferThe slings and arrowsof outrageous fortune,Or to take arms against a sea of troubles");
            for (int i = 0; i < 1000; i++) {
                    str3.append("and by opposing end them");
            }
            System.out.println(str3);
            System.out.println("That took " + (System.currentTimeMillis() - startTimeBuffer) + " milliseconds");

        }
    }


//Задание 21
//Напишите три цикла выполняющих многократное сложение строк, один с
//помощью оператора сложения и String, другой с помощью StringBuilder и метода
//append, а также аналогино для StringBuffer. Сравните скорость их выполнения.