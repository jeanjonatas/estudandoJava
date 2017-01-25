package estudojava;

public class ProgramaJava {
	public static void main(String[] args) {

		
		GerenciadorDeImpostos gp = new GerenciadorDeImpostos();
		SeguroDeVida sv = new SeguroDeVida();
		gp.adiciona(sv);
		
		
		Conta conta = new ContaCorrente();
		ContaCorrente cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		conta.deposita(100);
		cc.deposita(100);
		cp.deposita(1000);

		gp.adiciona(cc);
		System.out.println(gp.getTotal());
		System.out.println(cc.calculaTributos());
		
		Tributavel t = cc;
		System.out.println(t.calculaTributos());

		
	}
}
