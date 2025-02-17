public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int cash = 15000;
        int total = 0;
        int y = 1;
        while (total <= 2_459_000) {
            total = total + cash;
            System.out.println("Месяц " + y++ + " сумма накоплений равна " + total + " рублей");
            System.out.println("Для накопления " + total + " потребуется " + y + " месяцев");
        }
        //Задание 2
        System.out.println();
        System.out.println("Задание 2");
        int w = 0;
        while (w < 10) {
            w++;
            System.out.print(" " + w);
        }
        System.out.println();
        for (int e = 10; e >= 1; e--) {
            System.out.print(" " + e);
        }
        System.out.println();
        //Задание 3
        System.out.println();
        System.out.println("Задание 3");
        int population = 12_000_000;
        int born = 17;
        int died = 8;
        for (int t = 1; t <= 10; t++) {
            population += population * born / 1000 - population * died / 1000;
            System.out.println("Год " + t + " численность населения составляет " + population + " человек");
        }
        //Задание 4
        System.out.println();
        System.out.println("Задание 4");
        int savings = 0;
        int income = 15000;
        int month = 1;
        while (savings < 12_000_000) {
            savings = savings + income;
            savings = savings + (savings / 100) * 7;
            month++;
            System.out.println("Месяц " + month + " Сумма накоплений " + savings);
        }
        //Задание 5
        System.out.println();
        System.out.println("Задание 5");
        month = 1;
        savings = 0;
        income = 15000;
        while (savings < 12_000_000) {
            savings = savings + income;
            savings = savings + (savings / 100) * 7;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Сумма накоплений " + savings);
            }
        }
        //Задание 6
        System.out.println();
        System.out.println("Задание 6");
        int year = 9;
        int monthInYear = 12;
        int monthTotal = year * monthInYear;
        month = 1;
        savings = 0;
        income = 15000;
        while (month <= monthTotal) {
            month++;
            savings = savings + income;
            savings = savings + (savings / 100) * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Сумма накоплений " + savings);
            }
        }
        //Задание 7
        System.out.println("Задание 7");
        for (int dayNumber = 1; dayNumber <= 31; dayNumber++) {
            if (dayNumber % 5 == 0) {
                System.out.println("Сегодня пятница, " + dayNumber + "е число. Необходимо подготовить отчет");
            }
        }
        //Задание 8
        System.out.println("Задание 8");
        year = 2025;
        int yearBefore = 2024 - 200;
        int yearAfter = 2024 + 100;

        for (year = yearBefore; year < yearAfter; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}


