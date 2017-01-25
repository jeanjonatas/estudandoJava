package banco;

public class ContaCorrente extends Conta implements Comparable<ContaCorrente> {

	public void atualiza(double taxa) {
		// TODO Auto-generated method stub
		super.atualiza(taxa);

	}

	@Override
	public int compareTo(ContaCorrente conta) {
		// TODO Auto-generated method stub
		if (this.saldo < conta.getSaldo()) {
			return -1;
		}
		if (this.saldo > conta.getSaldo()) {
			return 1;
		}
		return 0;
	}
}
