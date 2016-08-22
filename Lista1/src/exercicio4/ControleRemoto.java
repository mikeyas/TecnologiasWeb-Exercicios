package exercicio4;

import java.util.Scanner;

public class ControleRemoto {
	
	public void ligarTV(Televisao tv){
		System.out.println("TV Ligou");
		Boolean continuar=true;
		do{
			
			System.out.println("---------------------------");
			System.out.println("|  (1) Informacoes da TV  |");
			System.out.println("|  (2) Controle de Vol.   |");
			System.out.println("|  (3) Controle de Canal  |");
			System.out.println("|_________________________|");
			System.out.println("|                         |");
			System.out.println("|  Volume Atual: "+tv.getVolume()+"        |");
			System.out.println("|  Canal  Atual: "+tv.getCanal()+"        |");
			System.out.println("|_________________________|");
			System.out.println("|  Digite opcao desejada: |");
			System.out.print("--------------------------");
			
			

			Scanner scanner = new Scanner(System.in);  
			int opcao = scanner.nextInt();
			switch (opcao) {
			
			case 1:
			InfoTV(tv);

			break;
			
			case 2:
			ControleVolume(tv);

			break;
			
			case 3:
			ControleCanal(tv);
			break;
			
			default:
			System.out.println("Opcao nao eh valida!");
			}
			
		}while(continuar==true);
		
	}
	

	public void InfoTV(Televisao tv){
		System.out.println("\n===INFORMACOES DA TV===");
		System.out.println("VOLUME ATUAL: "+tv.getVolume());
		System.out.println("CANAL ATUAL: "+tv.getCanal());
	}
	
	public void ControleVolume(Televisao tv){
		System.out.println("\n===CONTROLE DE VOLUME===");
		System.out.println("(+) AUMENTAR");
		System.out.println("(-) DIMINUIR");
		
		Scanner scan = new Scanner (System.in);
		String v=scan.nextLine();
		
		if(tv.getVolume()<30&&tv.getVolume()>0){
			if(v.equals("+")){
				Integer aumentar=tv.getVolume()+1;
				tv.setVolume(aumentar);
			}
			else if(v.equals("-")){
				Integer diminuir=tv.getVolume()-1;
				tv.setVolume(diminuir);
			}
			else System.out.println("Entrada invalida");
		}
		else if(tv.getVolume()>=30){
			if(v.equals("+")){
				System.out.println("VOLUME MAX!");
			}
			else if(v.equals("-")){
				Integer diminuir=tv.getVolume()-1;
				tv.setVolume(diminuir);
			}
			else System.out.println("Entrada invalida");
		}
		else if(tv.getVolume()<=0){
			if(v.equals("+")){
				Integer aumentar=tv.getVolume()+1;
				tv.setVolume(aumentar);
			}
			else if(v.equals("-")){
				System.out.println("VOLUME MIN!");
			}
			else System.out.println("Entrada invalida");
		}
		else System.out.println("Entrada invalida");
	}
	
	public void ControleCanal(Televisao tv){
			System.out.println("\n===CONTROLE DE CANAL===");
			System.out.println("(+) AUMENTAR");
			System.out.println("(-) DIMINUIR");
			System.out.println("OU DIG. NUM. CANAL");
			
			Scanner scan = new Scanner (System.in);
			String v=scan.nextLine();
						
			if(tv.getCanal()<100 && tv.getCanal()>0){
				if(v.equals("+")){
					Integer aumentar=tv.getCanal()+1;
					tv.setCanal(aumentar);
				}
				else if(v.equals("-")){
					Integer diminuir=tv.getCanal()-1;
					tv.setCanal(diminuir);
				}
				else{
				
				if(verificaInteiro(v)==true) {
					if(tv.getCanal()<=100 && tv.getCanal()>=0){
					Integer v2 = Integer.parseInt(v);
					if(v2<=100 && v2>=0){
					tv.setCanal(v2);  
					} 
					else System.out.println("Entrada invalida0");
					}
					else System.out.println("Entrada invalida0");
			        }
				else System.out.println("Entrada invalida1");
				}
				}
			
				
			else if(tv.getCanal()>=100 || tv.getCanal()<0){
				
				if(v.equals("+")){
					tv.setCanal(0);
					Integer aumentar=tv.getCanal()+1;
					tv.setCanal(aumentar);
				}
				else if(v.equals("-")){
					Integer diminuir=tv.getCanal()-1;
					tv.setCanal(diminuir);
				}
				else{
					
					if(verificaInteiro(v)==true) {
						if(tv.getCanal()<=100 && tv.getCanal()>=0){
						Integer v2 = Integer.parseInt(v);
						if(v2<=100 && v2>=0){
						tv.setCanal(v2);  
						} 
						else System.out.println("Entrada invalida2");
						}
						else System.out.println("Entrada invalida2");
				        }
					else System.out.println("Entrada invalida3");
					}
					}
			else if(tv.getCanal()==0){
				tv.setCanal(0);
				if(v.equals("+")){
					Integer aumentar=tv.getCanal()+1;
					tv.setCanal(aumentar);
				}
				else if(v.equals("-")){
					
					tv.setCanal(100);
				}
				else{						
						if(verificaInteiro(v)==true) {
							if(tv.getCanal()<=100 && tv.getCanal()>=0){
							Integer v2 = Integer.parseInt(v);
							if(v2<=100 && v2>=0){
							tv.setCanal(v2);  
							} 
							else System.out.println("Entrada invalida4");
							}
							else System.out.println("Entrada invalida4");
					        }
						else System.out.println("Entrada invalida5");
						}
						}
			else System.out.println("Entrada invalida6");
		}
	
	public boolean verificaInteiro(String s) {

	    char[] c = s.toCharArray();
	    boolean d = true;
	    for ( int i = 0; i < c.length; i++ )

	        if ( !Character.isDigit( c[ i ] ) ) {
	            d = false;
	            break;
	        }
	    
	    return d;
	}
	
}
