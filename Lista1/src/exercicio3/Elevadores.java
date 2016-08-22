package exercicio3;

import java.util.Scanner;

public class Elevadores {

	private Integer andarAtual=0;
	private Integer andarTotal;
	private Integer capacidadeTotal;
	private Integer lotacaoAtual=0;
	
	public void setAndarAtual(Integer andar){
		this.andarAtual=andar;
	}
	
	public Integer getAndarAtual(){
		return andarAtual;
	}
	
	public void setAndarTotal(Integer andar){
		this.andarTotal=andar;
	}
	
	public Integer getAndarTotal(){
		return andarTotal;
	}
	
	public void setCapacidadeTotal(Integer capacidade){
		this.capacidadeTotal=capacidade;
	}
	
	public Integer getCapacidadeTotal(){
		return capacidadeTotal;
	}
	
	public void setLotacaoAtual(Integer capacidade){
		this.lotacaoAtual=capacidade;
	}
	
	public Integer getLotacaoAtual(){
		return lotacaoAtual;
	}
	
	public Elevadores(Integer capacidade, Integer andares){
		setAndarTotal(andares);
		setCapacidadeTotal(capacidade);
	}

	public void entra(Integer entra){
		if((getLotacaoAtual()+entra)<getCapacidadeTotal()){
			Integer capacidade=getLotacaoAtual()+entra;
			setLotacaoAtual(capacidade);
			System.out.println("Entrou "+entra+" pessoas");
			System.out.println("Atualmente ha "+getLotacaoAtual()+" pessoas no Elevador");
		}
		else {
			Integer disponivel=getCapacidadeTotal()-getLotacaoAtual();
			System.out.println("Impossivel entrar, apenas "+disponivel+" lugares disponiveis.");
		}
	}

	public void sai(Integer sai){
	if(getLotacaoAtual()==0){
		System.out.println("Elevador estah vazio!");
	}
	else if((getLotacaoAtual()-sai)>0){
			Integer capacidade=getLotacaoAtual()-sai;
			setLotacaoAtual(capacidade);
			System.out.println("Saiu "+sai+" pessoas");
			System.out.println("Atualmente ha "+getLotacaoAtual()+" pessoas no Elevador");
		}
		else System.out.println("Quantidade maior que lotacao atual do elevador.");
	}
	
	public void sobe(){
		if(getAndarAtual()<getAndarTotal()){
			Integer andar=getAndarAtual()+1;
			setAndarAtual(andar);
			System.out.println("Subindo...");
		}
		else {
			System.out.println("Impossivel subir, Jah estamos no "+getAndarAtual()+" andar.");
		}
	}
	
	public void desce(){
			if(getAndarAtual()>0){
				Integer andar=getAndarAtual()-1;
				setAndarAtual(andar);
				System.out.println("Descendo...");
			}
			else {
				System.out.println("Impossivel descer, Jah estamos no andar terreo.");
			}
	}
	
	public void funcionamento(){
		System.out.println("Elevador iniciou");
		Boolean continuar=true;
		do{
			Integer disponivel=getCapacidadeTotal()-getLotacaoAtual();
			
			System.out.println("---------------------------");
			System.out.println("|  Subir  (1) Descer(2)   |");
			System.out.println("|  Entrar (3) Sair  (4)   |");
			System.out.println("|_________________________|");
			System.out.println("|                         |");
			System.out.println("|  Andar Atual: "+getAndarAtual()+"         |");
			System.out.println("|  Capacidade Total: "+getCapacidadeTotal()+"   |");
			System.out.println("|  Capacidade Atual: "+getLotacaoAtual()+"    |");
			System.out.println("|  Lugares disponiveis: "+disponivel+" |");
			System.out.println("|_________________________|");
			System.out.println("|  Digite opcao desejada: |");
			System.out.print("--------------------------");
			
			

			Scanner scanner = new Scanner(System.in);  
			int opcao = scanner.nextInt();
			switch (opcao) {
			
			case 1:
			sobe();

			break;
			
			case 2:
			desce();

			break;
			
			case 3:
			System.out.print("Quantas pessoas irao entrar?");
			Scanner scannerentrar = new Scanner(System.in);  
			int entra = scannerentrar.nextInt();
			entra(entra);
			break;
			
			case 4:
				System.out.print("Quantas pessoas irao sair?");
				Scanner scannersai = new Scanner(System.in);  
				int sai = scannersai.nextInt();
				sai(sai);
			break;
			
			default:
			System.out.println("Opcao nao eh valida!");
			}
			
		}while(continuar==true);
		
	}
	
	
}
