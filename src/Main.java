public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задание 2
        int clientDeviceYear = 2015;
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

        }
        //Задание 3
        int year = 2068;
        if ((year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
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
        if (monthNumber > 12) {
            System.out.println("Такого месяца нет");
        }
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
        }
    }
}


