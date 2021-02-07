public class additional7 {
    public static void main(String[] args) {
        int i;
        int sum=0;
        for (i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                sum+=i;
        }
        System.out.println(" The sum of odd values equal to " + sum);
    }
}


//7)Напишите программу, определяющую сумму всех нечетных чисел от 1до 99