package hw_lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex20 {
    public static void main(String[] args) {
        String str = " To be, or   not to be, that is the question: Whether 'tis nobler in the mind to suffer";
        Pattern pattern = Pattern.compile("[a-zA-z]+");
        Matcher matcher = pattern.matcher(str);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(str.substring(matcher.end() - 1, matcher.end()));
        }
        System.out.println(result);
    }
}
//Задание 20
//Имеется строка с текстом. Вывести текст, составленный из последних букв
//всех слов.