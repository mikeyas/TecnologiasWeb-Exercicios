package conta;

public class ValorInvalido extends Exception{
	public ValorInvalido(String texto) {
		super(texto);
	}
	public  ValorInvalido() {
		super("Operação não realizada,\nValor Inválido.\n");
	}

}
