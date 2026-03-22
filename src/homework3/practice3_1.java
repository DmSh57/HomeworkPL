package homework3;

import java.util.Random;
/*
Сгенерировать 5 случайных чисел. Каждое возвести в квадрат и вывести в
консоль.
 */
public class practice3_1 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(5);
            System.out.println(num * num);
        }

    }
}
