package Practice5;

public class Main {

    public static void main(String[] args) {
        MusicBand.realise();
        RockBand.realise();


        RockBand rockBand = new RockBand("GHGH");
        RockBand rockBand1 = new RockBand("HJHJ");
        RockBand rockBand2 = new RockBand("JGHJHGUJ");

        System.out.println(MusicBand.bandsCount);

    }
}
 /*       RockBand rockBand = new RockBand();

        rockBand.setMemCount(8);
        rockBand.setFee(1000);

        System.out.println(rockBand.getFee());
        System.out.println(rockBand.getCountMem());


 /*     rockBand.playMusic();

        PopBand popBand = new PopBand("Шар", "Рэп", 2);
        popBand.playMusic();

        rockBand.showTypes();

        MetalBand metalBand = new MetalBand("Фок", "Метал", 7);

        metalBand.showTypes();


        rockBand.perform("Металика", "Рок");
        rockBand.perform("Металика", "Рок", 12);
    }
 */

