package Practice5;

public class MusicBand {
    private String name;
    private String genre;
    private int countMem;
    private int fee;
    String type = "Музыкальная группа";

    public static int bandsCount = 0;


    public MusicBand(String name) {
        this.name = name;
        bandsCount++;
    }

    /*   public MusicBand(String name, String genre, int countMem) {      this.name = name;
            this.genre = genre;
            this.countMem = countMem;
        }
    */
    public void playMusic() {
        System.out.println("Группа играет песню");
    }
    public void setMemCount(int countMem) {
        if (countMem > 0) {
            this.countMem = countMem;
        } else {
            System.out.println("Количество участников группы не может быть меньше одного");
        }
    }
    public void setFee(int fee) {
        if (fee > 0) {
            this.fee = fee;
        } else {
            System.out.println("Количество участников группы не может быть меньше одного");
        }
    }
    public int getCountMem() {
        return countMem;
    }
    public int getFee() {
        return fee;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void perform(String name, String genre) {
        System.out.println("Группа " + name + " играет в жанре " + genre);
    }

    public void perform(String name, String genre, int countMem) {
        System.out.println("Группа " + name + " играет в жанре " + genre + " и с количкеством участников " + countMem);
    }


    public static void realise(){
        System.out.println("Группа выпускает песню");
    }


}
