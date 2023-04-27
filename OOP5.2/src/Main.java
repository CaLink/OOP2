import java.util.concurrent.Semaphore;
import java.util.Random;

public class Main
{
    public static void main(String[] args) {

        Semaphore sem = new Semaphore(1);

        for(int i=1; i<5; i++) {
            new Phil(sem, i).start();
        }
    }
}

class Phil extends Thread{
    Semaphore sem;
    int id;
    static Random rnd = new Random();

    Phil(Semaphore sem, int id) {
        this.sem = sem;
        this.id = id;
    }

    public void run() {
        try {
            while(true) {
                sem.acquire();

                System.out.println("Кушает философ" + id);
                sleep(rnd.nextInt(3000));

                System.out.println("Покушал" + id);

                sem.release();

                sleep(rnd.nextInt(3000));
            }
        }
        catch(InterruptedException e) {

        }
    }

}