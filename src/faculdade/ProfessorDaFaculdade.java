package faculdade;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
	private int horasDeAula=80;
	
	public double getGastos(){
		return this.getGastos() + this.horasDeAula*10;
	}
	
	String getInfo(){
		String informacaoBasica = super.getInfo();
		String informacao = informacaoBasica + " horas aula: "+this.horasDeAula;
		return informacao;
	}

	public int getHorasDeAula() {
		return horasDeAula;
	}

	public void setHorasDeAula(int horasDeAula) {
		this.horasDeAula = horasDeAula;
	}
	
}
