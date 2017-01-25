package funcionario;

public class Empresa {
	private Funcionario[] empregados;
	private String cnpj;
	private int nFunc;
	
	public boolean adiciona(Funcionario f){
		if(nFunc<empregados.length){
			empregados[nFunc] = f;
			nFunc++;
			
			return true;
		}else{
			return false;
		}
	}
	public void mostraFunc(){
		for(int i=0; i<nFunc; i++){
			System.out.println("Func["+i+"]\nSalario:"+empregados[i].getSalario());
		}
	}
	
	public Funcionario[] getEmpregados() {
		return empregados;
	}
	public void setEmpregados(Funcionario[] empregados) {
		this.empregados = empregados;
	}
}
