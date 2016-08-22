package conta;

public class MainConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try {
		Conta c = new Conta();
		c.deposito(200);
		c.exibeSaldo();
		c.saque(300);
		c.exibeSaldo();
	}catch(Exception e){
		System.out.println(e.getMessage());
	}


	}

}
