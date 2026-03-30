package Practice5;

public class RockBand extends MusicBand {

    String type = "Рок группа";

    public RockBand(String name) {
        super(name);
    }



 /*   public RockBand(String name, String genre, int countMem) {
        super(name, genre, countMem);
  */

    @Override
    public void playMusic() {
        super.playMusic();
        System.out.println("Рок группа играет громко");
    }

    public void showTypes() {
        System.out.println("Поле дочернего класса: " + type);
        System.out.println("Поле родительского класса: " + super.type);
    }

    @Override
    public void perform(String name, String genre) {
        super.perform(name, genre);
    }
}