package banco;

public class SaldoInsuficienteException extends RuntimeException{
	public SaldoInsuficienteException(String mensagem){
		super(mensagem);		//super passa o valor para o getMessage da RuntimeException
	}
	
}
