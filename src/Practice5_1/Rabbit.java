package Practice5_1;

public class Rabbit extends Animal{

    @Override
    public void voice() {
        System.out.println("Кролик дышит");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Grass")){
            System.out.println("Кролик ест траву");
        } else {
            System.out.println("Кролик не рада" + food);
        }
    }
}
