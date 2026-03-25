package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
Найти минимальный - максимальный элементы и вывести в консоль. */
public class homework3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();

        int[] num = new int[size];

        for (int i = 0; i < num.length; i++){
            num[i] = random.nextInt(200);
        }
        System.out.println(Arrays.toString(num));

        Arrays.sort(num);
        int min = num[0];
        int max = num[num.length - 1];
        System.out.println(min);
        System.out.println(max);
    }
}
