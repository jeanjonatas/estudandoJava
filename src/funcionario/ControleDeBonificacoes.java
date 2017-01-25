package funcionario;

public class ControleDeBonificacoes {
	private double totalDeBonificacoes;
	
	public void registra(Funcionario funcionario){
		System.out.println("Adicionando bonificação do func: "+ funcionario);
		this.totalDeBonificacoes +=funcionario.aumento();
	}
	
	public double getTotalDeBonificacoes(){
		return this.totalDeBonificacoes;
	}
	
}
