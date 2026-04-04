package homework6;

/*
Создать класс с как минимум 4 разными методами, в каждом методе добавить
проверку на исключительные ситуации, используя:
1. try- catch
2. try-catch, где catch будет несколько
3. try -catch, с использованием multi - catch
4. try-catch-finally
Продемонстрировать обработку исключительных ситуаций на примерах
 */

import java.util.Scanner;

public class Main {
    public static void methodOne() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите число");
            int num = scanner.nextInt();
            System.out.println("Вы ввели число:" + num);
        } catch (Exception e) {
            System.out.println("Введено некорректное значение");
        }
        System.out.println("Программа продолжила работать");
    }

    public static void methodTwo() {
        try {
            int[] num = {1, 2, 3};
            int a = 10 / 2;
            System.out.println(num[10]);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
        System.out.println("Программа продолжила работать");
    }

    public static void methodThree() {
        try {
            int[] num = {1, 2, 3};
            int a = 10 / 0;
            System.out.println(num[10]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Типовая ошибка");
        }
        System.out.println("Программа продолжила работать");
    }

    public static void methodFour() {
        try {
            int[] num = {1, 2, 3};
            int a = 10 / 2;
            System.out.println(num[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Типовая ошибка");
        } finally {
            System.out.println("Finally выводиться в любом случае)");
        }
        System.out.println("Программа продолжила работать");
    }

    public static void main(String[] args) {
        methodThree();
    }
}
