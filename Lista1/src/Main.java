import exercicio3.Elevadores;
import exercicio4.ControleRemoto;
import exercicio4.Televisao;

public class Main {

	public static void main(String[] args) {
		
		/*
	Agenda ag = new Agenda("teste");
	ag.menu();

	Elevadores el= new Elevadores(10, 40);
	el.funcionamento();
	*/
	Televisao tv = new Televisao(0,30);
	ControleRemoto control= new ControleRemoto();
	control.ligarTV(tv);

	}

}
