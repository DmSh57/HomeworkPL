package Practice4;

public class Calculator {

    double weight;
    double cost;
    String color;

    {
        System.out.println("Создается калькулятор");
    }

    public Calculator(double weight, double cost, String color) {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }

    public double sum(double a, double b) {
        return a + b;
    }
    public double subtrack(double a, double b) {
        return a - b;
    }
}
