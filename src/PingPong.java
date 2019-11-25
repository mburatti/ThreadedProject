
public class PingPong extends Thread{
	private String palavra;
	private long tempo;
	
	public PingPong(String palavra, long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	public void run() {
		System.out.println(palavra);
		try {
			Thread.sleep(tempo);		
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
