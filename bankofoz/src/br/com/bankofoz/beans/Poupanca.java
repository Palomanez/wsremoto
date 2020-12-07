package br.com.bankofoz.beans;

public class Poupanca extends Conta{
	private float rendimento;

	
	
	public float verificardoSaldo() {
		return super.getSaldo();
	}
		
		
	public void creditarRendimentos() {
		super.setSaldo(super.getSaldo() +  rendimento);
		rendimento=0;
	}
		
	
	public void setall(short numero, byte digito, short agencia, float saldo, Cliente cliente, float valor,
			float rendimento) {
				this.rendimento = rendimento;
	}


	public Poupanca() {
		super();
	}

	

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float valor,
			float rendimento) {
		super(numero, digito, agencia, saldo, cliente, valor);
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + "]";
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}

	
	
		

	
	
	
	
}