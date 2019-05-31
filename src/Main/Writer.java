package Main;

import java.util.concurrent.Semaphore;

class Writer extends Thread {
    Access accessObj;
    String id;
    Semaphore sem;

    Writer(String id, Access a, Semaphore sem) {
        this.id = id;
        this.accessObj = a;
        this.sem = sem;
        start();
    }

    public void run() {
        try {
            sem.acquire();
            accessObj.writing(this);
            sem.release();
            sleep(500);
            } catch (InterruptedException e) {
            }
    }
}
