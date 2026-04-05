package homework7;

import java.util.Scanner;

public class Homework7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stroka1 = scanner.nextLine();
        String stroka2 = scanner.nextLine();
        String stroka3 = scanner.nextLine();
        int lenStroka1 = stroka1.length();
        int lenStroka2 = stroka2.length();
        int lenStroka3 = stroka3.length();
        double mid = (lenStroka1 + lenStroka2 + lenStroka3) / 3.0;

        if (lenStroka1 < mid) {
            System.out.println(stroka1 + " длиной " + lenStroka1 + " символов");
        }
        if (lenStroka2 < mid) {
            System.out.println(stroka2 + " длиной " + lenStroka2 + " символов");
        }
        if (lenStroka3 < mid) {
            System.out.println(stroka3 + " длиной " + lenStroka3 + " символов");
        }
        scanner.close();
    }
}
