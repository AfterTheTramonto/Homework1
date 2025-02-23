import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
//Первый массив
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
//Второй массив
        double[] second = {1.57, 7.654, 9.986};
//Третий массив
        int[] colorOfCats = new int[3];
        colorOfCats[0] = 3;
        int ginger = colorOfCats[0];
        colorOfCats[1] = 2;
        int white = colorOfCats[1];
        colorOfCats[2] = 6;
        int black = colorOfCats[2];
//Задание 2
        System.out.println("Задание 2");
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println(Arrays.toString(colorOfCats));
//Задание 3
        System.out.println("Задание 3");
        for (int i = first.length - 1; i >= 0; i--) {
            System.out.print(first[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = second.length - 1; i >= 0; i--) {
            System.out.print(second[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = colorOfCats.length - 1; i >= 0; i--) {
            System.out.print(colorOfCats[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задание 4
        System.out.println("Задание 4");
        int[] finals = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < finals.length; i++) {

            if (finals[i] % 2 == 1) {
                finals[i] = finals[i] + 1;
                System.out.println(finals[i]);
            }
        }
    }
}


