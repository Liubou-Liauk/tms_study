public class ex15 {
    public static void main(String[] args) {
        int array[] = {1, 12, 45, 85, 64, 78, 23, 47};
        System.out.println("The direct order of the elements ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("The inverted order of the elements ");
        for (int invertedOrd = array.length - 1; invertedOrd >= 0; invertedOrd--) {
            System.out.println(array[invertedOrd]);

        }
    }
}
//Создать массив, заполнить его случайными элементами, распечатать,
//перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//еще один массив).