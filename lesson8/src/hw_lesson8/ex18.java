package hw_lesson8;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex18 {
    public static void main(String[] args) {
        String str = "To be, or not to be, that is the question: Whether 'tis nobler in the mind to suffer The slings and arrows of outrageous fortune, Or to take arms against a sea of troubles And by opposing end them. To die—to sleep, No more; and by a sleep to say we end The heart-ache and the thousand natural shocks That flesh is heir to: 'tis a consummation Devoutly to be wish'd. To die, to sleep; To sleep, perchance to dream—ay, there's the rub: For in that sleep of death what dreams may come,When we have shuffled off this mortal coil, Must give us pause—there's the respect That makes calamity of so long life.";
        Pattern pattern = Pattern.compile("[\':?!;,.-]");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("The total number of punctuation marks is " + count);
        int commaCount = 0;
        int colonCount = 0;
        int dashCount = 0;
        int apostropheCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char punMark = str.charAt(i);
            if (punMark == ',') {
                commaCount++;
            } else if (punMark == ':') {
                colonCount++;
            } else if (punMark == '-') {
                dashCount++;
            } else if (punMark == '\'') {
                apostropheCount++;
            }
        }
        System.out.println("The number of ',' is " + commaCount);
        System.out.println("The number of ':' is " + colonCount);
        System.out.println("The number of '-' is " + dashCount);
        System.out.println("The number of ''' is " + apostropheCount);

    }
}
//Задание 18
//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество.


