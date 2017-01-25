package estudandointerface;

import java.math.*;

public class Circulo implements AreaCalculavel {
	private int raio;

	public Circulo(int raio) {
		this.raio = raio;
		
	}

	public double calculaArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(raio, 2.0);
	
	}
}
