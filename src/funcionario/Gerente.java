package funcionario;

public class Gerente extends Funcionario implements Autenticavel {
	int senha;
	int numeroDeFuncionariosGerenciados;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Negado");
			return true;
		} else {
			System.out.println("Acesso permitido");
			return false;
		}
	}

	public double aumento() {
		// TODO Auto-generated method stub
		return this.salario * 1.4 + 1000;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}