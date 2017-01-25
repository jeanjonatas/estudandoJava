package estudojava;

public class Cliente {
	private String nome; // atributo nome
	private String sobrenome; // atributo sobrenome
	private String cpf; // atributo cpf

	public void mudaCPF(String cpf) {
		validaCPF(cpf);
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	private void validaCPF(String cpf) {
		// regras de validação de cpf
	}
}
