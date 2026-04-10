package homework8;

import Practice5_1.Animal;

public class Main {
    public static void main(String[] args) {
        Homework8_2 animalList = new Homework8_2();
        animalList.addAnimal("Тигр");
        animalList.addAnimal("Слон");
        animalList.addAnimal("Зубр");
        animalList.addAnimal("Лев");
        animalList.showAnimal();
        animalList.removeAnimal();
        animalList.showAnimal();
        animalList.removeAnimal();
        animalList.showAnimal();
    }
}
