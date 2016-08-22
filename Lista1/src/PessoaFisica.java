import java.util.Date;

public class PessoaFisica extends Pessoa{

	public PessoaFisica(String n, String fone, Date d, String CPF) {
		super(n, fone, d);
		setCPF(CPF);
	}
	private String CPF;
	
	public String getCPF(){
	return CPF;
	}
	
	public void setCPF(String cad){
		this.CPF = cad;
	}
	
 	@Override
    public String toString() {
        return "Nome: "+getNome()+
        		"\nTelefone: " + getTelefone()+
        		"\nCPF: "+ getCPF()+
        		"\nData Cadastro: "+ getdiaCadastro()+
        		"\n----------------------------------";
    }
}
