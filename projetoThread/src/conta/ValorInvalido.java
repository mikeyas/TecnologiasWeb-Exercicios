package conta;

public class ValorInvalido extends Exception{
	public ValorInvalido(String texto) {
		super(texto);
	}
	public  ValorInvalido() {
		super("Opera��o n�o realizada,\nValor Inv�lido.\n");
	}

}
