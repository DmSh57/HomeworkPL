package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
Найти индексы минимального и максимального элементов и вывести в консоль.
 */
public class homework3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();

        int[] num = new int[size];

        for (int i = 0; i < num.length; i++){
            num[i] = random.nextInt(200);
        }
        System.out.println(Arrays.toString(num));
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] < num[minIndex]){
                minIndex = i;
            }
        }
        System.out.println(minIndex);

        for (int i = 1; i < num.length; i++) {
            if (num[i] > num[maxIndex]){
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}
