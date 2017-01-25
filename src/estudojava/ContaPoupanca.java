package estudojava;

public class ContaPoupanca extends Conta {

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * 2 * taxa;
	}

	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}
}
