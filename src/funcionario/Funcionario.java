package funcionario;

abstract class Funcionario {
	private String nome;
	private String cpf;
	protected double salario;

	public Funcionario() {
		// construtor padrão
	}

	public abstract double aumento();

	public void demite() {

	}

	public double calculaGanhoAnual() {
		return this.salario * 12;
	}

	public void mostra() {
		System.out.println("Nome: " + this.nome + "\nSalario:" + this.salario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
