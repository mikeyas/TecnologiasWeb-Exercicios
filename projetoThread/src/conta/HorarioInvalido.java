package conta;

public class HorarioInvalido extends Exception{
	public HorarioInvalido(String texto) {
		super(texto);
	}
	public  HorarioInvalido() {
		super("Operação não realizada,\nNão permitida para este horario.\n");
	}
}
