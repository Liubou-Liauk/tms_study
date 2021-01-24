package lesson4;

public class ex7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int r = 2;
        int s = a * b;
        double s2 = (3.14 * r * 2);
        if (s2 <= s) System.out.println("The circle fits.");
        else System.out.println("The circle doesn't fit.");
    }
}
//Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//полностью закрыть круглой картонкой радиусом r.