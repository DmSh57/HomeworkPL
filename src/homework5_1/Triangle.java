package homework5_1;

public class Triangle extends Figura {

    private static double a;
    private static double b;
    private static double c;

    public Triangle(double a, double b, double c) {
        Triangle.a = a;
        Triangle.b = b;
        Triangle.c = c;
    }


    @Override
    public double getArea() {
        double pp = (a + b + c) / 2;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }


    @Override
    public double getPerimetr() {
        return a + b + c;
    }
}
