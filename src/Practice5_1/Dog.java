package Practice5_1;

public class Dog extends Animal {

    @Override
    public void voice() {
        System.out.println("Собака гавкает");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat")){
            System.out.println("Собака ест мясо");
        } else {
            System.out.println("Собака не рада" + food);
        }
    }
}
