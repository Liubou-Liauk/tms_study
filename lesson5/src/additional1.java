public class additional1 {
    public static void main(String[] args) {
        double distance = 10;
        double finalDist = 0;
        for (int i = 0; i < 7; i++) {
            finalDist += distance;
            distance *= 1.1;
        }
        System.out.println("The final distance for 7 days is  " + (int) finalDist);
    }

}

//1)Начав тренировки, спортсмен в первый день пробежал 10 км.
// Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня.
// Какойсуммарный путь пробежит спортсмен за 7 дней?
