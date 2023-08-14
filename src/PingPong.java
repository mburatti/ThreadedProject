import java.util.concurrent.atomic.AtomicInteger;

public class PingPong extends Thread{
    private String palavra;
    private long tempo;
    private AtomicInteger counter;
    
    public PingPong(String palavra, long tempo, AtomicInteger counter) {
        this.palavra = palavra;
        this.tempo = tempo;
        this.counter = counter;
    }
    
    public void run() {
        System.out.println(palavra + " is thread number " + counter.incrementAndGet() + " and will run for " + tempo + "ms");
        try {
            Thread.sleep(tempo);        
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(palavra + " finished after " + tempo + "ms");
        counter.decrementAndGet();
    }
}
