package banco;

public class Conta {

	protected double saldo;

	public void atualiza(double taxa) {
		saldo += saldo * taxa;
	}

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(
					"Saldo insuficiente, tente um valor menor");
		} else {
			this.saldo -= valor;

		}
	}

	public void setSaldo(double salario) {
		this.saldo = salario;
	}

	public String toString() {
		return "Uma conta com valor " + this.saldo;
	}

	public boolean equals(Object object) {
		if (!(object instanceof Conta))
			return false;
		Conta outraConta = new Conta();
		return this.saldo == outraConta.saldo;

	}

	public double getSaldo() {
		return this.saldo;
	}

}
