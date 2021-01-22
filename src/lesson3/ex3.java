package exercise3;

public class ex3 {

    public static void main(String[] args) {
        int s = 4500;
        int seco = s % 60;
        int m = (s - seco) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int d = h % 24;
        int days = (h - d) / 24;
        int w = days % 7;
        int weeks = (days - w) / 7;
        System.out.println("A) " + m + " minutes " + seco + " seconds");
        System.out.println("B) " + h + " hours " + min + " minutes " + seco + " seconds");
        System.out.println("C) " + days + " days " + h + " hours " + min + " minutes " + seco + " seconds");
        System.out.println("D) " + weeks + " weeks " + days + " days " + h + " hours " + min + " minutes " + seco + " seconds");

    }
}
}
//Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
//А) минут + секунд,
//В) часов + минут + секунд,
//С) дней + часов + минут + секунд,
//D) недель + дней + часов + минут + секунд.
//по аналогии с примером выше