package homework5;

public class Therapist extends Doctor {
    public Therapist() {
        super("Терапевт");
    }

    @Override
    public void treat() {
        System.out.println("Терапевт проводит осмотр");
    }

    public void choiceDoctor(Patient patient) {

        Doctor doctor;

        if (patient.planChoice == 1) {
            doctor = new Surgeon();
            System.out.println("Вам назначен хирург");
        } else if (patient.planChoice == 2) {
            doctor = new Dantist();
            System.out.println("Вам назначен стоматолог");
        } else {
            doctor = new Therapist();
            System.out.println("Вам назначен терапевт");
        }
        doctor.treat();
    }
}
