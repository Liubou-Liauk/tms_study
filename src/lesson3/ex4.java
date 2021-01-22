package exercise3;

public class exercise4 {
    public static void main(String[] args) {

        int n = 4321;
        int a = n % 1000;
        int b = a % 100;
        int n4 = b % 10;
        int n3 = (b - n4) / 10;
        int n2 = (a - b) / 100;
        int n1 = (n - a) / 1000;

        System.out.println("Р•СЃР»Рё n = " + n);
        System.out.println("С‚Рѕ РёСЃРєРѕРјС‹Р№ РѕС‚РІРµС‚ = " + n4 + "" + n3 + "" + n2 + "" + n1);
    }
}
//Определить число, полученное выписыванием в обратном порядке цифр
//любого 4-х значного натурального числа n.

