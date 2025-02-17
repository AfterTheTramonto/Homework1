public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        for (int D = 0; D <= 10; D++) {
            System.out.println(D);
        }
        //Задание 2
        System.out.println("Задание 2");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        //Задание 3
        System.out.println("Задание 3");
        for (int w = 0; w <= 17; w = w + 2) {
            System.out.println(w);
        }
        //Задание 4
        System.out.println("Задание 4");
        for (int e = 10; e >= -10; e--) {
            System.out.println(e);
        }
        //Задание 5
        System.out.println("Задание 5");
        for (int y = 1904; y <= 2096; y = y + 4) {
            System.out.println("Високосный год " + y);
        }
        //Задание 6
        System.out.println("Задание 6");
        for (int q = 0; q <= 98; q = q + 7) {
            System.out.println(q);
        }
        //Задание 7
        System.out.println("Задание 7");
        for (int t = 1; t <= 512; t = t * 2) {
            System.out.println(t);
        }
        //Задание 8
        System.out.println("Задание 8");
        int cash = 29000;
        int total = 0;
        for (int u = 1; u <= 12; u++) {
            total = total + cash;
            System.out.println("Месяц " + u + " сумма накоплений равна " + total + " рублей");
        }
        //Задание 9
        System.out.println("Задание 9");
        int salary = 29000;
        int totalMoney = 0;
        for (int p = 1; p <= 12; p++) {
            totalMoney = totalMoney + totalMoney / 100;
            totalMoney = totalMoney + salary;
            System.out.println("Месяц " + p + " сумма накоплений равна " + totalMoney + " рублей");
        }
        //Задание 10
        System.out.println("Задание 10");
        for (int z = 2; z <= 10; z++) {
            System.out.println("2*" + z + "=" + 2 * z);
        }
    }
}


