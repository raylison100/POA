package Exemplo;

public class Conta {

	private int numero;
	private double saldo;
	
	public void setNumero(int numero){
		System.out.println("Vai mudar o num.");
		this.numero = numero; 		
	}
	
	public void creditar(double valor){
		
		System.out.println("Vai mudar o saldo");
		this.saldo = this.saldo + valor;
	}
	
	public void debitar(double valor){
		
		System.out.println("vai ocorrer um debito");
		if(valor <= this.saldo)
		    this.saldo = this.saldo - valor;
	}
	
	public double getSaldo() {
		
		return saldo;
	}
}
