package funcionario;

public class Principal {
	public static void main(String[] args){
		Empresa empresa = new Empresa();
		empresa.setEmpregados(new Funcionario[10]);
		
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(5000.0);
		controle.registra(funcionario1);
		
		
		Autenticavel autentica = new Gerente();
		autentica.autentica(12);
		
		System.out.println(controle.getTotalDeBonificacoes());
		
	
	}
}
