package homework2;

import java.util.Scanner;

/*
Напишите программу, где пользователь вводит любое целое положительное
число.
А программа суммирует все числа от 1 до введенного пользователем числа. Для
ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
пользователь не мог ввести некорректные данные
 */
public class Homework2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();

        int summ = 0;
        for (int i = 1; i <= a; i++){
            summ = summ + i;
        }
        System.out.println(summ);
    }
}
