public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задание 2
        int clientDeviceYear = 2015;
        int clientOS = 1;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задание 3
        int year = 1584;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else if (year < 1584) {
            System.out.println("Год должен быть больше 1584г.");
        } else {
            System.out.println("Год не високосный");
        }
        //Задание 4
        int deliveryDistance = 101;
        int deliveryDay = 1;
        if (deliveryDistance < 20) {
            deliveryDay = 1;
            System.out.println("Потребуется день " + deliveryDay);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            deliveryDay += 1;
            System.out.println("Потребуется дней " + deliveryDay);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDay += 2;
            System.out.println("Потребуется дней " + deliveryDay);
        } else {
            System.out.println("Доставки нет");
        }
        //Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}


