package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
вывести сообщение, что их нет.
 */
public class homework3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();

        int[] num = new int[size];

        for (int i = 0; i < num.length; i++){
            num[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(num));

        int nuLLnum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0){
                nuLLnum++;
            }
        }
        if (nuLLnum > 0){
            System.out.println(nuLLnum);
        } else {
            System.out.println("Отсутствуют нулевые элементы");
        }
    }
}
