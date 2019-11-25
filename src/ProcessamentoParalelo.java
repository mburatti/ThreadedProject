
public class ProcessamentoParalelo {

	public static void main(String[] args) {
		System.out.println("Inicio Thread Main");
		new PingPong("Ping", 1000).start();
		new PingPong("Pong", 2000).start();
		System.out.println("Fim Thread Main");
	}

}
