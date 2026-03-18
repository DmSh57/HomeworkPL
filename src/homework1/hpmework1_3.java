package homework1;

public class hpmework1_3 {
    public static void main(String[] args) {
        int n = 126;
        int n1 = n / 100;
        int n2 = (n / 10) % 10;
        int n3 = n % 10;
        int n4 = n1 + n2 + n3;
        System.out.println(n4);
    }
}
