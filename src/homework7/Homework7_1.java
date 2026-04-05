package homework7;

import java.util.Scanner;

public class Homework7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stroka1 = scanner.nextLine();
        String stroka2 = scanner.nextLine();
        String stroka3 = scanner.nextLine();
        String shortest = stroka1;
         if (stroka2.length() < shortest.length()) {
             shortest = stroka2;
         }
         if (stroka3.length() < shortest.length()) {
             shortest = stroka3;
         }
         String longest = stroka1;
        if (stroka2.length() > longest.length()) {
            longest = stroka2;
        }
        if (stroka3.length() > longest.length()) {
            longest = stroka3;
        }
        System.out.println("Самая короткая строка - " + shortest + ", длина которой: " + shortest.length());
        System.out.println("Самая длинная строка - " + longest + ", длина которой: " + longest.length());
    }
}
