package multithread;

import java.util.ArrayList;
import java.util.Collection;

public class RodaMensagens {
	public static void main(String[] args) throws InterruptedException {
		Collection<String> mensagens = new ArrayList<String>();

		// Cria as threads
		Thread t1 = new Thread(new ProduzMensagens(0, 10000, mensagens));
		Thread t2 = new Thread(new ProduzMensagens(10000, 20000, mensagens));
		Thread t3 = new Thread(new ProduzMensagens(20000, 30000, mensagens));

		t1.start();
		t2.start();
		t3.start();

		// faz com que a thread fique no main aguardando o fim
		t1.join();
		t2.join();
		t3.join();

		System.out.println("Todas as threads finalizadas !");

		// verifica se as mensagens foram guardadas
		for (int i = 0; i < 15000; i++) {
			if (!mensagens.contains("Mensagens: " + i)) {
				throw new IllegalArgumentException("Não encontrei a mensagem: "
						+ i);
			}
			if (mensagens.contains(null)) {
				throw new IllegalArgumentException("Não deveria ter null");
			}
		}

		System.out.println("Fim da execução !");
	}
}
