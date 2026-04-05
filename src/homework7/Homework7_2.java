package homework7;

import java.util.Scanner;

public class Homework7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stroka1 = scanner.nextLine();
        String stroka2 = scanner.nextLine();
        String stroka3 = scanner.nextLine();

        String temp;

        if (stroka1.length() > stroka2.length()) {
            temp = stroka1;
            stroka1 = stroka2;
            stroka2 = temp;
        }
        if (stroka2.length() > stroka3.length()) {
            temp = stroka2;
            stroka2 = stroka3;
            stroka3 = temp;
        }
        if (stroka1.length() > stroka2.length()) {
            temp = stroka1;
            stroka1 = stroka2;
            stroka2 = temp;
        }
        System.out.println(stroka1);
        System.out.println(stroka2);
        System.out.println(stroka3);
    }
}
