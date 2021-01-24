package lesson4;


public class additional3 {
    public static void main(String[] args) {
        int n = 115;
        if (n > 0) System.out.println(++n);
        else if (n < 0) System.out.println(n -= 2);
        else if (n == 0) System.out.println(n = 10);

    }
}
// Дано целое число.
// Если оно является положительным, то прибавить к нему 1.
// Если отрицательным, то вычесть из него 2.
// Если нулевым, то заменить его на 10. Вывести полученное число