package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
Пройти по массиву и поменять местами элементы первый и последний, второй
и предпоследний и т.д.
Долго не мог понять почему массив меняет значение и получается исходное. Потом прочитал, что если /2
то массив не будет менять значения сначало в прямом порядке, а потом в обратном.
 */
public class homework3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();

        int[] num = new int[size];

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(num));

        for (int i = 0; i < num.length / 2; i++) {
            int temp = num[i];
            num[i] = num[num.length - 1 - i];
            num[num.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(num));
    }
}