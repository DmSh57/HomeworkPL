package homework7;

public class Homework7_5 {
    public static void main(String[] args) {
        String text = "Hello";
        String result = text.replaceAll(".", "$0$0");
        System.out.println(result);
    }
}
