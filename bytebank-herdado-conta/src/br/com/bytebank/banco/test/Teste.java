package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();

		Conta cc = new ContaCorrente(22, 11);
		
		Conta cc1 = new ContaCorrente(22, 22);

		guardador.adicionar(cc);
		guardador.adicionar(cc1);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(0);
		System.out.println(ref);
	}

}
