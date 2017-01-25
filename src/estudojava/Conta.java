package estudojava;

import java.util.Scanner;
import javax.swing.*;

public abstract class Conta {
	protected double saldo;

	public abstract void deposita(double valor);

	public abstract void saca(double valor);

	public abstract void atualiza(double taxa);

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
