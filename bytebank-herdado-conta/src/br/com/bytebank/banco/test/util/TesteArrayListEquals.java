package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		Conta cc3 = new ContaCorrente(22, 22);
		

		
		boolean existe = lista.contains(cc3);
		System.out.println("Ja existe? " + existe);
		
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
