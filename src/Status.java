import java.util.concurrent.atomic.AtomicInteger;

public class Status extends Thread{
    private AtomicInteger counter;

    public Status(AtomicInteger counter) {
        this.counter = counter;
    }

    public synchronized void run() {
        System.out.println("Status thread started");
        do {
            System.out.println("There are "+ counter.get() + " threads running");            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {                
                e.getMessage();
            }            
        } while(counter.get() > 0);
        System.out.println("All threads tasks finished");
    }
        
}
