package sockets;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) throws UnknownHostException, IOException {
		new Cliente("127.0.0.1", 12345);
	
	}
	private String host;
	private int porta;
	
	
	public Cliente(String host, int porta){
		this.host = host;
		this.porta = porta;
	}
	public void executa() throws UnknownHostException, IOException {
		Socket cliente = new Socket(this.host,this.porta);		//Conectando ao servidor
		System.out.println("O cliente se conectou ao servidor");
		
		//Thread para receber mensagems do servidor
		
		Recebedor r = new Recebedor(cliente.getInputStream());		//Pega as mensagens e manda para recebedor
		new Thread(r).start();		//Cria a thread e inicializa
		
		//lê as mensagens do teclado e manda para o servidor
		Scanner in = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());		//Mando a saida do cliente pro servidor
		
		while(in.hasNextLine()){
			String linha = in.nextLine();
			saida.println(linha);
		}
		saida.close();
		in.close();
		cliente.close();
	}
}
