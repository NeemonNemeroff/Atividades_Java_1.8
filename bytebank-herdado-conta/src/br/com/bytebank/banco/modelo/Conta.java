package br.com.bytebank.banco.modelo;
public abstract class Conta extends Object implements Comparable<Conta>{
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	private static int total;

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException{

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;

	}

	public Cliente getTitular() {
		return titular;
	}

	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		
		return "Numero: " + this.numero + ", Agencia: " + this.agencia + " Saldo: " + this.saldo;
	}

	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;			
		} 
		if (this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {	
		return Double.compare(this.saldo, outra.saldo);
	}
	
}