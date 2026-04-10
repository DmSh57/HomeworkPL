package homework8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Homework8_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String [] numbers = num.split(",");
        Set<Integer> numbersSet = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            numbersSet.add(Integer.valueOf(numbers[i].trim()));
        }
        System.out.println(numbersSet);
        scanner.close();
    }
}
