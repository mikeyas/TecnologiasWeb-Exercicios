package conta;

public class ContaInativa extends Exception{
	public ContaInativa(String texto) {
		super(texto);
	}
	public  ContaInativa() {
		super("Opera��o n�o realizada,\nConta Inativa.\n");
	}
}
