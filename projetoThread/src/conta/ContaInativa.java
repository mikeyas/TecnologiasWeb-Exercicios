package conta;

public class ContaInativa extends Exception{
	public ContaInativa(String texto) {
		super(texto);
	}
	public  ContaInativa() {
		super("Operação não realizada,\nConta Inativa.\n");
	}
}
