package listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EstudandoLista {
	public static void main(String[] args) {
		System.out.println("Iniciando ...");

		// Array list está associada a colection
		Collection<Integer> teste = new HashSet<>();

		long inicio = System.currentTimeMillis();

		int total = 30000;

		for (int i = 0; i < total; i++) {
			teste.add(i);
		}

		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("TEMPO GASTO : " + tempo);

	}
}
