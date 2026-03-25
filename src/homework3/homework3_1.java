package homework3;

import java.util.Random;
import java.util.Scanner;
/*
Для всех задач исходные условия следующие: пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта. После заполнения массива данными, решить для него следующие
задачи:
Задача 1:
Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
 */
public class homework3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();

        int[] num = new int[size];

        for (int i = 0; i < num.length; i++){
            num[i] = random.nextInt(200);
        }

        for (int i = 0; i < num.length; i++){
            System.out.println("num[" + i + "] = " + num[i]);
        }
        for (int i = num.length - 1; i >= 0; i--){
            System.out.println("num[" + i + "] = " + num[i]);
        }

    }
}
