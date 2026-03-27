package Practice4;

public class Person {
    int age;
    String fullName;

    public Person() {
    }

    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    public void talk(String text){
        System.out.println(fullName + " Говорит " + text);
    }

    public void move(){
        System.out.println(fullName + " walk");
    }



}
