package homework5_1;

public class Circle extends Figura {

    private static double radius;


    public Circle(double radius) {
        Circle.radius = radius;

    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }
}
