package homework3;

import java.util.Arrays;
/*
2.1 Создать массив fruits и заполнить его 4 произвольными фруктами.
2.2 вывести в консоль второй и четвертый.
2.3 вывести в консоль длину массива.
2.4 третий фрукт заменить на иной.
2.5 проверить результат в консоли.
 */
public class practice3_2 {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Banana", "Orange", "Strawberry"};
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
        System.out.println(fruits.length);

        fruits[2] = "Pear";
        System.out.println(Arrays.toString(fruits));
    }
}
