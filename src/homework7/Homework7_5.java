package homework7;

import java.util.Scanner;

public class Homework7_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String result = text.replaceAll(".", "$0$0");
        System.out.println(result);
        scanner.close();
    }
}
