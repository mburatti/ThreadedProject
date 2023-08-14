import java.util.concurrent.atomic.AtomicInteger;

public class ProcessamentoParalelo {

    private static AtomicInteger counter = new AtomicInteger(0);
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread Main started");
        
        new Status(counter).start();
        new PingPong("Ping", 10000, counter).start();
        new PingPong("Pong", 15000, counter).start();
        
        System.out.println("Thread Main ended");
    }    
}
