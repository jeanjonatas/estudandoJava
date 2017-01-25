package estudandointerface;

public class Principal {
	public static void main(String[] args) {
		AreaCalculavel a = new Circulo(2);
		System.out.println(a.calculaArea());
		
	}
}
