package estudojava;

public class ContaCorrente extends Conta implements Tributavel {

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * 2 * taxa;
	}

	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	public double calculaTributos() {
		// TODO Auto-generated method stub
		return this.getSaldo()*0.01;
	}
}
