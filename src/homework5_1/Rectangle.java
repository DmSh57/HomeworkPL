package homework5_1;

public class Rectangle extends Figura {

    private static double a;
    private static double b;


    public Rectangle(double a, double b) {
        Rectangle.a = a;
        Rectangle.b = b;

    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimetr() {
        return (a + b) * 2;
    }
}
