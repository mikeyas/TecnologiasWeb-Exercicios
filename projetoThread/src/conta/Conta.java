package conta;
import java.util.*;

public class Conta extends Exception{
	private int numero=123456789;
	private double saldo=10;
	private boolean situacao=true;
		
	public void deposito(double valor)throws Exception{
		Calendar hoje = Calendar.getInstance();
		int hora=hoje.get(Calendar.HOUR_OF_DAY);
		int dia=hoje.get(Calendar.DAY_OF_WEEK);
				
		if(dia == 1 || dia == 7){
			throw new HorarioInvalido();
		}else{
			if(hora < 8 || hora > 16){
				throw new HorarioInvalido();
			}else{
				if (valor <= 0){
					throw new ValorInvalido();
				}else {
					if (!situacao){
						throw new ContaInativa();
					}else{
						saldo=+valor;
						System.out.println("Deposito realizado\n");
					}
				}
			}
		}
	}
		
	public void exibeSaldo(){
		System.out.println("O saldo eh: "+saldo+"\n");
	}

	public void saque(double valor)throws Exception{
		Calendar hoje = Calendar.getInstance();
		int hora=hoje.get(Calendar.HOUR_OF_DAY);
		int dia=hoje.get(Calendar.DAY_OF_WEEK);
				
		if(valor>saldo){
			throw new ValorInvalido("Saque nao pode ser realizado,\nSaldo Insuficiente.\n");
		}else{
			if(hora < 8 || hora > 22){
				throw new HorarioInvalido();
			}else{
				if (valor <= 0){
					throw new ValorInvalido();
				}else {
					if (!situacao){
						throw new ContaInativa();
					}else{
						saldo=saldo-valor;
						System.out.println("Saque realizado.\n");
					}
				}
			}
		}
	
	}
}
	