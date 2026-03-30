package homework5;

public class Patient {

    int planChoice;
    Doctor doctor;

    public Patient(int planChoice) {
        this.planChoice = planChoice;
    }

    public void infoPatient() {
        if (doctor != null) {
            System.out.println("Врач - " + doctor.name);
        } else {
            System.out.println("Врач не назначен");
        }
    }
}
