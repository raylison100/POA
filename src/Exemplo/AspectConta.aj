package Exemplo;

public aspect AspectConta {

	// --------------------CREDITO--------------------

	pointcut logCredito(Conta c):
		call(* Conta*.creditar(double)) &&
     	target(c);

	before(Conta c): logCredito(c){
		System.out.println("Ocorreu um credito");

	}

	after(Conta c): logCredito(c){

		System.out.println("Saldo:" + c.getSaldo());
	}

	// ------------------DEBITO----------------------------

	pointcut logDebito(Conta c, double v):
		call(* Conta*.debitar(double)) &&
     	target(c) && args(v);

	void around(Conta c, double v): logDebito(c,v){

		System.out.println("Valor a ser debitado: " + v + " de " + c.getSaldo());

		if (v > c.getSaldo()) {
			
			
			System.out.println("Não ocorreu debito");
			System.out.println("Saldo:" + c.getSaldo());
			proceed(c,v);

		} else
			proceed(c,v);
			System.out.println("Ocorreu debito");
		    System.out.println("Saldo:" + c.getSaldo());
	}

}
