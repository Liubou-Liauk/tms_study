import java.util.Arrays;

public class additional5 {
    public static void main(String[] args) {
        double inch = 2.54;
        double count = 0;
        for (double cent = 1; cent <= 20; cent++) {
            count = inch * cent;
            System.out.println("In " + cent + " centimeter(s) there are " + count + " inches");
        }
    }
}
//5)Напишите программу печати таблицы перевода расстояний из дюймов всантиметры
// для значений длин от 1 до 20 дюймов.
// 1 дюйм = 2,54 см