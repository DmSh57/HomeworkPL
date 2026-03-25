package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Проверить, является ли массив возрастающей последовательностью (каждое
следующее число больше предыдущего).
Выводило постоянно так
[18, 5, 7, 38, 21]
Массив не является возрастающей последовательностью
Массив является возрастающей последовательностью
Массив является возрастающей последовательностью
Массив не является возрастающей последовательностью
Дальше понял, что цикл не останавливается при нарушении, прогуглил про остановку - break
 */
public class homework3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();

        int[] num = new int[size];

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(num));
        boolean n = true;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] >= num[i + 1]){
                n = false;
                break;
            }
        }
        if (n) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
    }
}
