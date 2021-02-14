package hw_lesson8;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex22 {
    public static void main(String[] args) {
        String str = "Задание 22 На4C5писать программ1C3B3у выполняю4H3Mщую поиск в строке шестнадцатеричных чисел";
        Pattern pattern = Pattern.compile("[0x[A-Fa-f0-9]{1,4}]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }

    }
}
//Задание 22
//Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
//записаных по правилам Java, с помощью регулярных выражений и вывести их на
//страницу.