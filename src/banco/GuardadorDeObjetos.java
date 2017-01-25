package banco;

public class GuardadorDeObjetos {
	private Object[] object = new Object[100];
	private int posicao;
	
	public void adiciona(Object object) {
		
		this.object[this.posicao] = object;
		this.posicao++;
	}
	public Object getObjeto(int indice) {
		return this.object[indice];
		
	}
}
