public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
//Первый массив
        int[] first = new int[5];
        first[0] = 100;
        first[1] = 150;
        first[2] = 200;
        first[3] = 300;
        first[4] = 700;
        int sum = 0;
        for (int expenses : first) {
            sum += expenses;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //Задание 2
        int maxExpenses = 0;
        int minExpenses = 2147483647;
        for (int expenses : first) {
            if (expenses > maxExpenses) {
                maxExpenses = expenses;
            }
            if (expenses < minExpenses) {
                minExpenses = maxExpenses;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила "+ minExpenses+" рублей");
        System.out.println("Максимальная сумма трат за неделю составила "+maxExpenses+" рублей");
        //Задание 3
        int arithmeticMean=sum/5;
        System.out.println(arithmeticMean);
//Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);}
    }
}


