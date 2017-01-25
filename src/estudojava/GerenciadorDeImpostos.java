package estudojava;

public class GerenciadorDeImpostos {
	private double total;

	void adiciona(Tributavel t) {
		System.out.println("Adicionando tributavel: " + t);
		this.setTotal(this.getTotal() + t.calculaTributos());
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
