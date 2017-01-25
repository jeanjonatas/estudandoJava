package faculdade;

public class Principal {
	public static void main(String[] args){
		ProfessorDaFaculdade professor = new ProfessorDaFaculdade();
		EmpregadoDaFaculdade empregado = professor;
		
		empregado.setSalario(1000);
		empregado.setNome("Waldeir");
		
		System.out.println(empregado.getInfo());
		
	}
}
