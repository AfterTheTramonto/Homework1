import java.time.LocalDate;

public class Main {
    public static void yearCount(int a) {
        if (a < 1584 || a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println(a + " год - високосный");
        } else {
            System.out.println(a + " год - не високосный год");
        }
    }


    public static void getLink(int a, int b) {
        if (a == 0 && b < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (a == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (a == 1 && b < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void calculationDelivery(int q, int e){
        if (q < 20) {
            e = 1;
            System.out.println("Потребуется день " + e);
        } else if (q > 20 && q < 60) {
           e += 1;
            System.out.println("Потребуется дней " + e);
        } else if (q >= 60 && q <= 100) {
            e += 2;
            System.out.println("Потребуется дней " + e);
        } else {
            System.out.println("Доставки нет");}
    }

    public static void main(String[] args) {
        //Задание 1
        int currentYear = LocalDate.now().getYear();
        yearCount(currentYear);
//Задание 2
        int deviseOS = 1;
        getLink(deviseOS, currentYear);
        //Задание 3
        int deliveryDistance = 100;
        int deliveryDay = 1;
        calculationDelivery(deliveryDistance,deliveryDay);
    }
}