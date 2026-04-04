package homework5;

public class Dantist extends Doctor {
    public Dantist() {
        super("Стоматолог");
    }

    @Override
    public void treat() {
        System.out.println("Стоматлог лечит зубы");
    }


}
