package homework5_1;

public class Main {
    public static void main(String[] args) {

        Figura [] figuras = new Figura[5];

        figuras[0] = new Triangle(10,12,14);
        figuras[1] = new Rectangle(10,20);
        figuras[2] = new Circle(7);
        figuras[3] = new Triangle(3,8,11);
        figuras[4] = new Rectangle(5, 15);

        double fullPerimetr = 0;

        for (int i = 0; i < figuras.length; i++) {
            fullPerimetr = fullPerimetr + figuras[i].getPerimetr();
        }
        System.out.println("Сумма периметра всех фигур в массиве = " + fullPerimetr);

    }
}
