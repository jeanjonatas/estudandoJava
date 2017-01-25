package entradaesaida;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaEntrada {
	public static void main(String[] args){
		try{
			InputStream is = System.in;
			Scanner in = new Scanner(is);
			
			OutputStream out = new FileOutputStream("saida.txt");
			OutputStreamWriter opw = new OutputStreamWriter(out);
			BufferedWriter writer = new BufferedWriter(opw);	
			
			
			
			while(in.hasNextLine()){
				String linha = in.nextLine();
				writer.write(linha);
				writer.newLine();
			}
			in.close();
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
