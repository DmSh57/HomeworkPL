package Practice5_1;

public class Main {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();
        Dog dog = new Dog();

        rabbit.voice();
        rabbit.eat("Meat");

        tiger.voice();
        tiger.eat("Meat");

        dog.voice();
        dog.eat("Meat");

    }


}
