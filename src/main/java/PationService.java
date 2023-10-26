import java.util.concurrent.Semaphore;

class PatientService {

    Semaphore semaphore = new Semaphore(1);

    public void goToTherapy(String name) {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " идет к терапевту");

        semaphore.release();
        goToMRT(name);
    }

    public synchronized void goToMRT(String name) {
        System.out.println(name + " идет на МРТ");
    }
}