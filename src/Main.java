public class Main {
    public static void main(String[] args) {
        //Задание 1
        int age = 11;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
        //Задание 2
        int temp = 24;
        if (temp >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        //Задание 3
        int speed = 147;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч то можно ездить спокойно");
        }
        //Задание 4
        int menAge = 24;
        if (menAge >= 2 && menAge <= 6) {
            System.out.println("Если возраст человека равен " + menAge + " то ему нужно ходить в детский сад");
        }
        if (menAge >= 7 && menAge <= 17) {
            System.out.println("Если возраст человека равен " + menAge + " то ему нужно ходить в школу");
        }
        if (menAge >= 18 && menAge <= 24) {
            System.out.println("Если возраст человека равен " + menAge + " то ему нужно ходить в университет");
        }
        if (menAge >= 25) {
            System.out.println("Если возраст человека равен " + menAge + " то ему нужно ходить на работу");
        }
        //Задание 5
        int childAge=18;
        if (childAge<5) {
            System.out.println("Если возраст ребенка равен " + childAge + " то ему нельзя кататься на атракционе");}
        if (childAge>=5 && childAge<14) {
            System.out.println("Если возраст ребенка равен " + childAge + " то ему можно кататься в сопровождении взрослого");}
        if (childAge>=14) {
            System.out.println("Если возраст ребенка равен " + childAge + " то ему можно кататься без сопровождения взрослого");}
        //Задание 6
        int capacity = 102;
        int seatingCapacity = 60;
        int standingCapacity=42;
        int passengers=102;
        if (passengers<=seatingCapacity){
            System.out.println("Есть сидячие места");} else if (passengers>=seatingCapacity && passengers<capacity) {
            System.out.println("Есть стоячие места");} else {
            System.out.println("Мест нет");

        }
        //Задание 7
        int one = 23;
        int two = 96;
        int three= 10;
        if (one>two && one>three){
            System.out.println(one+" большее число");} else if (two>three) {
            System.out.println(two+" большее число");} else {
            System.out.println(three+" большее число");

        }
    }
}


