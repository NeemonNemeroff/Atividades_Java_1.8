package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta implements Tributavel {
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

	@Override
	public double getValorImposto() {

		return 0;
	}
	@Override
	public String toString() {
		
		return "Conta Poupanca, " + super.toString();
	}
}
