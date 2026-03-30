package homework5;

public class Main {
    public static void main(String[] args) {

        Patient patient1 = new Patient(2);
        Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(3);
        Patient patient4 = new Patient(4);

        Therapist therapist = new Therapist();

        therapist.choiceDoctor(patient1);
        System.out.println("Первый пациент");

        therapist.choiceDoctor(patient2);
        System.out.println("Второй пациент");

        therapist.choiceDoctor(patient3);
        System.out.println("Третий пациент");

        therapist.choiceDoctor(patient4);
        System.out.println("Четрвертый пациент");

    }
}
