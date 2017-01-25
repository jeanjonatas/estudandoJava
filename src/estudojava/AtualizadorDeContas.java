package estudojava;

public class AtualizadorDeContas {
	private double saldoTotal;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println("Saldo anterior: " + c.getSaldo());
		double saldoFinal = c.getSaldo() + c.getSaldo() * selic;
		System.out.println("Saldo atual: " + saldoFinal);
		saldoTotal += saldoFinal;
		System.out.println("Saldo total: " + saldoTotal);

	}

}
