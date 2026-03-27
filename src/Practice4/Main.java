package Practice4;

public class Main {
    public static void main(String[] args) {
  //      Calculator calculator = new Calculator(1.6, 2.7, "orange");
 //       calculator.color = "red";
 //       calculator.cost = 1.9;
 //       calculator.weight = 2.4;

 //       System.out.println(calculator.sum(2, 6));
 //       System.out.println(calculator.subtrack(3, 8 ));
 //       System.out.println(calculator.color);

        Person person = new Person(3, "Dima");
        person.talk("goood");
        person.move();

        Person person1 = new Person();
        person1.talk("say goood");
        person1.move();
    }
}
