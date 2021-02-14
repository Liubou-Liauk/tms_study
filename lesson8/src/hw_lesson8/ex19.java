package hw_lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.io.*;

public class ex19 {
    public static void main(String[] args) {
        String str = " To be, or   not to be, that is the question: Whether 'tis nobler in the mind to suffer The slings and arrows of outrageous fortune, Or to take arms against a sea of troubles And by opposing end them. To die—to sleep, No more; and by a sleep to say we end The heart-ache and the thousand natural shocks That flesh is heir to: 'tis a consummation Devoutly to be wish'd. To die, to sleep; To sleep, perchance to dream—ay, there's the rub: For in that sleep of death what dreams may come,When we have shuffled off this mortal coil, Must give us pause—there's the respect That makes calamity of so long life.";
        str = str.trim();
        StringTokenizer st = new StringTokenizer(str);
        int count = st.countTokens();
        System.out.println("The total number of words is " + st.countTokens());
        for (int i = 0; i < count; i++) {
            System.out.println("Word in  [" + i + "] : " + st.nextToken());
        }
    }
}

//Задание 19
//Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//текста также могут быть пробелы, но могут и отсутствовать.