package conta;

public class HorarioInvalido extends Exception{
	public HorarioInvalido(String texto) {
		super(texto);
	}
	public  HorarioInvalido() {
		super("Opera��o n�o realizada,\nN�o permitida para este horario.\n");
	}
}
