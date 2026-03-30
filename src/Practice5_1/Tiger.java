package Practice5_1;

public class Tiger extends Animal{

    @Override
    public void voice() {
        System.out.println("Тигер рычит");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat")){
            System.out.println("Тигер ест мясо");
        } else {
            System.out.println("Тигер не рада" + food);
        }
    }
}
