package hw_lesson8;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex23 {
    public static void main(String[] args) {
        String str = " <p id=”p1”>В одних садах цветёт миндаль, в других метёт метель.<p id=”p1”>\n" +
                "   <p id=”p1”>В одних краях ещё февраль, в других - уже апрель.</p>\n" +
                "   <p id=”p1”>Проходит время, вечный счёт: год за год, век за век...</p>\n" +
                "   <p id=”p1”>Во всём - его неспешный ход, его кромешный бег.</p>\n" +
                "   <p id=”p1”>В году на радость и печаль по двадцать пять недель.</p>\n" +
                "   <p id=”p1”>Мне двадцать пять недель февраль, и двадцать пять - апрель.</p>\n" +
                "   <p id=”p1”>По двадцать пять недель в туман уходит счёт векам.</p>\n" +
                "   <p id=”p1”>Летит мой звонкий балаган куда-то к облакам.</p>\n" +
                "   <p id=5, class='test', style=\"color:red\"><i>М. Щербаков</i></p>";

        Pattern pattern = Pattern.compile("<\\s?p.*?>"); // билась несколько часов, твой вариант не подходил, пыталась трансформировать, но безрезультатно, подсмотрела у Ильи
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(str.replaceAll(String.valueOf(pattern), "<p>"));
            break;
        }

    }
}
//Задание №23 из методички №2. Написать программу, выполняющую поиск в строке всех тегов абзацев,
//в т.ч. тех, у которых есть параметры, например <p id=”p1”>, и замену их на простые теги абзацев <p>.