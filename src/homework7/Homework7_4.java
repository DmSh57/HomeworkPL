package homework7;

import java.util.Scanner;

public class Homework7_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stroka1 = scanner.nextLine();
        String stroka2 = scanner.nextLine();
        String stroka3 = scanner.nextLine();
        String allStr = stroka1.concat(" ").concat(stroka2).concat(" ").concat(stroka3);
        String[] words = allStr.split("\\s+");
        String result = null;
        for (String word : words) {
            if (uniqueWord(word)) {
                result = word;
                break;
            }
        }
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Слова с уникальными символами отсутствуют");
        }
        scanner.close();
    }
    private static boolean uniqueWord(String word) {
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    }
