import java.util.Date;

public class Pessoa {

	
	public Pessoa(String n, String fone, Date d){
		setNome(n);
		setdiaCadastro(d);
		setTelefone(fone);
		
	}
	
	private String nome;
	private Date diaCadastro;
	private String telefone;
	
 	public String getNome() {
		return nome;
	}
	
 	public void setNome(String nome) {
 		nome=nome.toLowerCase();
		this.nome = nome;
	}
 	
 	public Date getdiaCadastro() {
		return diaCadastro;
	}
	
 	public void setdiaCadastro(Date d) {
		this.diaCadastro = d;
	}
	
 	public String getTelefone() {
		return telefone;
	}
	
 	public void setTelefone(String fone) {
		this.telefone = fone;
	}
 	

}
	
	