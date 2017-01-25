package sockets;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintStream;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class Servidor {
	public static void main(String[] args) throws IOException {
		//inicia o servidor
		new Servidor(12345).executa();
	}
	private int porta;
	private List<PrintStream> clientes;
	
	public Servidor(int porta){
		this.porta = porta;
		this.clientes = new ArrayList<PrintStream>();
	}
	
	public void executa() throws IOException{
		ServerSocket servidor = new ServerSocket(this.porta);		//Cria o servidor com a porta indicada
		System.out.println("Porta 12345 aberta!");
		
		while (true) {
			//aceitando um cliente
			Socket cliente = servidor.accept();		//aceitando um novo cliente
			System.out.println("Conexão com o novo cliente "+servidor.getInetAddress().getHostAddress());		//imprimindo o ip do cliente
			
			//adiciona a saida do cliente na lista
			PrintStream ps = new PrintStream(cliente.getOutputStream());		//Pego a saida do cliente
			this.clientes.add(ps);
			
			//Cria tratador de cliente em uma nova thread
			TrataCliente tc = new TrataCliente(cliente.getInputStream(),this);
			new Thread(tc).start();
		}
	}
	
	public void distribuiMensagens(String msg){
		for (PrintStream cliente : clientes) {
			cliente.println(msg);
		}
	}
}
