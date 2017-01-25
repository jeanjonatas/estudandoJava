package erros;

public class TesteErros {
	public static void main(String[] args) {
		int i = 10;
		i = i / 0;
		System.out.println(i);
	}

	public static void metodo1() {
		System.out.println("Inicio do metodo 1");

		metodo2();

		System.out.println("Término do metodo 1");
	}

	public static void metodo2() {
		System.out.println("Inicio do metodo 2");
		int[] array = new int[10];

		for (int i = 0; i < 15; i++) {

			array[i] = i;
			System.out.println(i);

		}

		System.out.println("Término do metodo 2");
	}
}
