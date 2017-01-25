package funcionario;

public class Diretor extends Funcionario implements Autenticavel {
	int senha;
	public double aumento() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean autentica(int senha) {
		if (this.senha != senha) {
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}

}
