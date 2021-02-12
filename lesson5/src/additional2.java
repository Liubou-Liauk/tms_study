public class additional2 {
    public static void main(String[] args) {
        int cell = 1;
        for (int hours = 3; hours <= 25; hours = hours + 3) {
            cell = cell * 2;
            System.out.println("In " + hours + " hours there will be " + cell + " cells");
        }
    }
}
//2)Одноклеточная амеба каждые 3 часа делится на 2 клетки.
// Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.