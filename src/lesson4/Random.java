package lesson4;

import java.util.Random;

class rand {
    public static Random rand = new Random();

    public static void main(String[] args) {
        int x = rand.nextInt(11);
        if (x % 100 == 1 || x == 1)
            System.out.println(x + " рубль");
        else if (x % 10 == 0 | x % 10 >= 5 & x % 10 <= 19 | x % 100 < 19)
            System.out.println(x + " рублей");
        else if (x % 10 == 2 | x % 10 == 3 | x % 10 == 4)
            System.out.println(x + " рубля");


        // 0, 5-20 рублей,,,112-114
        //1 рубль, 21, 31 ,,,
        //2-4 рубля, 24, 33 ,,,
    }

}
// Имеется целове число (задать с помощью Random rand = new Random(); int x =
//rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//нему слово «рублей» в правильном падеже.


