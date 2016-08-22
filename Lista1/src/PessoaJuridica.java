import java.util.Date;

public class PessoaJuridica extends Pessoa{

	public PessoaJuridica(String n, String fone, Date d, String CNPJ) {
		super(n, fone, d);
		setCNPJ(CNPJ);
	}
	private String CNPJ;
	
	public String getCNPJ(){
	return CNPJ;
	}
	
	public void setCNPJ(String cad){
		this.CNPJ = cad;
	}
	
 	@Override
    public String toString() {
        return "Nome: "+getNome()+
        		"\nTelefone: " + getTelefone()+
        		"\nCNPJ: "+ getCNPJ()+
        		"\nData Cadastro: "+ getdiaCadastro()+
        		"\n----------------------------------";
 	}
}
