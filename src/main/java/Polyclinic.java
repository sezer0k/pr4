import java.util.LinkedList;
import java.util.Queue;

class Polyclinic {
    public static void main(String[] args) {
        PatientService patientService = new PatientService();

        Queue<Patient> queue = new LinkedList<>();
        queue.add(new Patient("Пациент 1", patientService));
        queue.add(new Patient("Пациент 2", patientService));
        queue.add(new Patient("Пациент 3", patientService));
        queue.add(new Patient("Пациент 4", patientService));
        queue.add(new Patient("Пациент 5", patientService));
        queue.add(new Patient("Пациент 6", patientService));
        queue.add(new Patient("Пациент 7", patientService));
        queue.add(new Patient("Пациент 8", patientService));
        queue.add(new Patient("Пациент 9", patientService));


        while (!queue.isEmpty()) {
            Patient currentPatient = queue.poll();
            Thread patientThread = new Thread(currentPatient);
            patientThread.start();
        }

        System.out.println("Все пациенты обслужены.");
    }
}
