package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {

//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);

		Object cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(33, 22);
		System.out.println(cc);
		System.out.println(cp);
		
		Cliente ci = new Cliente();

//		println(cc);
	}


	static void println() {
	}

	static void println(int a) {
	}

	static void println(boolean valor) {
	}
	static void println(Object referecia) {
	}


}
