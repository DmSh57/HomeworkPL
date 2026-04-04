package homework5;

public class Surgeon extends Doctor {
    public Surgeon() {
        super("Хирург");
    }

    @Override
    public void treat() {
        System.out.println("Хирург оперирует");
    }
}
