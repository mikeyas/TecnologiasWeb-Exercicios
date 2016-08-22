import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class Agenda{

	private String nomeAgenda;
	private List<Pessoa> pessoas;
	
	public Agenda (String nome){
		this.nomeAgenda = nome;
		pessoas = new ArrayList<Pessoa>();
	}
	
	public void menu(){
		System.out.println("==================AGENDA DO MIKE===================");
		System.out.println("| (1)-ARMAZENAR CONTATO                           |");
		System.out.println("| (2)-REMOVER CONTATO                             |");
		System.out.println("| (3)-BUSCAR CONTATO (por nome)                   |");
		System.out.println("| (4)-BUSCAR CONTATO (por CPF/CNPJ)               |");
		System.out.println("| (5)-BUSCAR CONTATO (por posicao na agenda)      |");
		System.out.println("| (6)-BUSCAR CONTATO (por dia de cadastro)        |");
		System.out.println("| (7)-EXIBIR CONTATOS POR TIPO (PF ou PJ)         |");
		System.out.println("| (8)-EXIBIR TODOS OS CONTATOS                    |");
		System.out.println("|                                                 |");
		System.out.println("| DIGITE A OPCAO DESEJADA:                        |");
		System.out.println("===================================================");

		do{
			Scanner scanner = new Scanner(System.in);  
			int opcao = scanner.nextInt();
	switch (opcao) {
	
	case 1:
		System.out.println("(1)-ARMAZENAR CONTATO");
		System.out.println("PF ou PJ?");
		Scanner pessoa = new Scanner(System.in);
		String tipo=pessoa.nextLine();
		if(tipo.equalsIgnoreCase("PF")){
			System.out.println("Informe o nome: ");
			Scanner dados = new Scanner(System.in);
			String nome=dados.nextLine();
			System.out.println("Informe o telefone: ");
			String fone=dados.nextLine();
			System.out.println("Informe o CPF: ");
			String CPF=dados.nextLine();
			
			PessoaFisica pf=new PessoaFisica(nome, fone, new Date(), CPF);
			armazenaPessoa(pf);
			break;
			}
		else if(tipo.equalsIgnoreCase("PJ")){
			System.out.println("Informe o nome: ");
			Scanner dados = new Scanner(System.in);
			String nome=dados.nextLine();
			System.out.println("Informe o telefone: ");
			String fone=dados.nextLine();
			System.out.println("Informe o CNPJ: ");
			String CNPJ=dados.nextLine();
			
			PessoaFisica pj=new PessoaFisica(nome, fone, new Date(), CNPJ);
			armazenaPessoa(pj);
			break;
			}
		else System.out.println("Entrada invalida.");
	break;
	
	case 2:
	System.out.println("(2)-REMOVER CONTATO");
	System.out.println("Informe o nome: ");
	Scanner dados = new Scanner(System.in);
	String nome=dados.nextLine();
	
	nome=nome.toLowerCase();
		for(int i=0;i<pessoas.size();i++){
		Pessoa p=(Pessoa) pessoas.get(i);
			if(p.getNome().contains(nome)){
				System.out.println(p);
				System.out.println("Confirma remocao? 1(sim), 2(nao)");
				Scanner c=new Scanner(System.in);
				int conf=c.nextInt();
				if(conf==1){
				removePessoa(p);
				System.out.println("Contato removido com sucesso!\n");
				break;
				}
				else break;
			}
			else break;
		}
	break;
	
	case 3:
		System.out.println("(3)-BUSCAR CONTATO (por nome)");
		System.out.println("Informe o nome: ");
		Scanner dados2 = new Scanner(System.in);
		String nome2=dados2.nextLine();
		buscaPessoa(nome2);
	break;
	
	case 4:
		System.out.println("(4)-BUSCAR CONTATO (por CPF/CNPJ)");
		System.out.println("Informe o CPF/CNPJ: ");
		Scanner dados3 = new Scanner(System.in);
		String id=dados3.nextLine();
		buscaPessoaByIdentificador(id);
	break;
	
	case 5:
		System.out.println("(5)-BUSCAR CONTATO (por posicao na agenda)");
		System.out.println("Informe a posicao na agenda: ");
		Scanner dados4 = new Scanner(System.in);
		int index=dados4.nextInt();
		imprimePessoa(index);
	break;
	
	case 6:
		System.out.println("(6)-BUSCAR CONTATO (por data de cadastro)");
		System.out.println("Informe a data de cadastro: ");
		Scanner dados5 = new Scanner(System.in);
		String data=dados5.nextLine();
		imprimePessoaByData(data);
	break;
	
	case 7:
		System.out.println("(7)-EXIBIR CONTATOS POR TIPO (PF ou PJ");
		Scanner tipo2 = new Scanner(System.in);
		String t=tipo2.nextLine();
		imprimeTipo(t);
		break;
		
	case 8:
		System.out.println("(8)-EXIBIR TODOS OS CONTATOS");
	imprimeAgenda();
	break;
	default:
	System.out.println("Este não é um dia válido!");
	}
	System.out.println("DIGITE A OPCAO DESEJADA:");
	}while(true);
	}

	public void armazenaPessoa(Pessoa p){
		this.pessoas.add(p);
	}
	
	public void removePessoa(Pessoa p){
		this.pessoas.remove(p);
	}
	
	public void buscaPessoa(String nome){
		nome=nome.toLowerCase();
		
		for(int i=0;i<pessoas.size();i++){
			Pessoa p=(Pessoa) pessoas.get(i);
			if(p.getNome().contains(nome)){
				System.out.println(p);
			}
		}
		System.out.println("Nenhum registro encontrado.\n");

	}

	public void buscaPessoaByIdentificador(String id){
		
		for(int i=0;i<pessoas.size();i++){
			PessoaFisica p2 = new PessoaFisica("a", "a",new Date(), "CPF");
			PessoaJuridica p3 = new PessoaJuridica("b", "b",new Date(), "CNPJ");
					
			if(pessoas.get(i).getClass()==(p2.getClass())){
				p2=(PessoaFisica) pessoas.get(i);	
	
				if(p2.getCPF().contains(id)){
				System.out.println(p2);
				}
			}
			else if(pessoas.get(i).getClass()==(p3.getClass())){
				p3=(PessoaJuridica) pessoas.get(i);	
	
				if(p3.getCNPJ().contains(id)){
				System.out.println(p3);
				}
			}
			else System.out.println("Nenhum registro encontrado.\n");		
		}
	}
	
	public void imprimeTipo(String tipo){
		for(int i=0;i<pessoas.size();i++){
			PessoaFisica p2 = new PessoaFisica("a", "a",new Date(), "CPF");
			PessoaJuridica p3 = new PessoaJuridica("b", "b",new Date(), "CNPJ");
					
			if(pessoas.get(i).getClass()==(p2.getClass())){
				p2=(PessoaFisica) pessoas.get(i);	

				if(tipo.equalsIgnoreCase("PF")){
				System.out.println(p2);
				}
			}
			else if(pessoas.get(i).getClass()==(p3.getClass())){
				p3=(PessoaJuridica) pessoas.get(i);	
	
				if(tipo.equalsIgnoreCase("PJ")){
				System.out.println(p3);
				}
			}
			else System.out.println("Nenhum registro encontrado.\n");
		}
	}
	
	public void imprimePessoaByData(String diaCadastro){
		for(int i=0;i<pessoas.size();i++){

								
				if(diaCadastro.equals(pessoas.get(i).getdiaCadastro())){
				System.out.println(pessoas.get(i));
				}
				else System.out.println("Nenhum registro encontrado.\n");
			}
		}
			
	void imprimePessoa(int index){
		for(int i=0;i<pessoas.size();i++){
			
			if(index==i){
			System.out.println(pessoas.get(i));
			}
		}
	}
	
	public void imprimeAgenda(){
		for(Pessoa s:pessoas){  
			   System.out.println(s);
	    }
	}

}