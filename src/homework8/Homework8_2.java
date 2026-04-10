package homework8;

import java.util.ArrayList;
import java.util.List;


public class Homework8_2 {
    ArrayList<String> animals = new ArrayList<>();

    public void addAnimal(String animal) {
        animals.add(0, animal);
        System.out.println(animal);
    }
    public void removeAnimal() {
        String lastAnimal = animals.get(animals.size() - 1);
        animals.remove(animals.size() - 1);
        System.out.println(lastAnimal);
    }
    public void showAnimal(){
        System.out.println(animals);
    }
}
