import java.time.LocalDate;

public class Main {
    public static void searchLeapYear(int year) {
        if (year > 1584 || year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - не високосный год");
        }
    }


    public static void showingWhatVersion(int deviseOS, int currentYear) {
        if (deviseOS == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (deviseOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (deviseOS == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int countingDeliveryDays(int distance, int days) {
        if (distance < 20) {
            days = 1;
            return 1;
        } else if (distance > 20 && distance < 60) {
            days += 1;
            return 2;
        } else if (distance >= 60 && distance <= 100) {
            days += 2;
            return 3;
        } else {
            throw new RuntimeException("Нет доставки");
        }
    }

    public static void printingDelivery(int daysReturn) {
        if (daysReturn == 1) {
            System.out.println("Потребуется дней: " + daysReturn);
        } else if (daysReturn == 2) {
            System.out.println("Потребуется дней: " + daysReturn);
        } else if (daysReturn == 3) {
            System.out.println("Потребуется дней: " + daysReturn);
        }

    }


    public static void main(String[] args) {
        //Задание 1
        int currentYear = LocalDate.now().getYear();
        searchLeapYear(currentYear);
        //Задание 2
        int deviseOS = 1;
        showingWhatVersion(deviseOS, currentYear);
        //Задание 3
        int deliveryDistance = 100;
        int deliveryDay = 1;
        printingDelivery(countingDeliveryDays(deliveryDistance, deliveryDay));
    }
}