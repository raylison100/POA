package Exemplo;

public class Priincipal {

	public static void main(String[] args) {
		
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Conta conta3 = new Conta();
		
		
		conta1.setNumero(111);
		conta2.setNumero(112);
		conta3.setNumero(113);
		
		
		conta1.creditar(100);
		conta2.creditar(150);
		conta3.creditar(50);
		
		
		conta1.debitar(100);
		conta2.debitar(50);
		conta3.debitar(60);
		
		
		
		
	}

}
