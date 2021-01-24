package exercise3;

class exercise4 {
    public static void main(String[] args) {

        int n = 4321;
        int a = n % 1000;
        int b = a % 100;
        int n4 = b % 10;
        int n3 = (b - n4) / 10;
        int n2 = (a - b) / 100;
        int n1 = (n - a) / 1000;

        System.out.println("If n = " + n);
        System.out.println("The answer is  " + n4 + "" + n3 + "" + n2 + "" + n1);
    }
}
//Определить число, полученное выписыванием в обратном порядке цифр
//любого 4-х значного натурального числа n.

