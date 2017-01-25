package estudandointerface;

public class Retangulo implements AreaCalculavel {
	private int largura;
	private int altura;

	public Retangulo(int altura, int largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public double calculaArea() {
		// TODO Auto-generated method stub
		return this.altura * this.largura;
	}

}
