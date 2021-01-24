package lesson4;

import java.util.Arrays;

public class additional2 {
    public static void main(String[] args) {
        int a = 8;
        int b = 15;
        int c = 7;
        int s1 = a + b;
        int s2 = b + c;
        int s3 = a + c;

        if (a > s2 | b > s3 | c > s1) System.out.println("The triangle doesn't exist.");
        else System.out.println("The triangle exists. ");
    }
}
// Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
// Определить существует ли такой треугольник.
// Дано: a, b, c –стороны предполагаемого треугольника.
// Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
// Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами не существует.