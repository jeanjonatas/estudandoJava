package estudandointerface;

public class Quadrado implements AreaCalculavel {
	private int lado;

	public Quadrado(int lado) {
		this.lado = lado;
	}

	public double calculaArea() {
		// TODO Auto-generated method stub
		return this.lado * this.lado;
	}

}
