package homework5_1;

public class Main {
    public static void main(String[] args) {
 /*       Triangle triangle = new Triangle(10,12,14);
        Rectangle rectangle = new Rectangle(10, 20);
        Circle circle = new Circle(7);
*/

        Figura [] figuras = new Figura[3];

        figuras[0] = new Triangle(10,12,14);
        figuras[1] = new Rectangle(10,20);
        figuras[2] = new Circle(7);

        System.out.println("Площадь треугольника:" + figuras[0].getArea());
        System.out.println("Периметр треугольника:" + figuras[0].getPerimetr());

        System.out.println("Площадь прямоугольника:" + figuras[1].getArea());
        System.out.println("Периметр пряморугольника:" + figuras[1].getPerimetr());

        System.out.println("Площадь круга:" + figuras[2].getArea());
        System.out.println("Периметр круга:" + figuras[2].getPerimetr());

    }
}
