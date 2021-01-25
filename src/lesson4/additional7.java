package lesson4;

public class additional7 {
    public static void main(String[] args) {
        int x = 124;
        if (x % 10 == 1 || x == 1)
            System.out.println(x + " программист");
        else if (x % 10 == 0 | x % 10 >= 5 & x % 10 <= 19 | x % 100 < 19)
            System.out.println(x + " программистов");
        else System.out.println(x + " программиста");
    }
}
//В переменную записываете количество программистов.
// В зависимости от количества программистов необходимо вывести правильно окончание.
// Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.