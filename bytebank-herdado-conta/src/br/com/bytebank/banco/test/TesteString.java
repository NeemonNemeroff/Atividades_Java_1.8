package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

		int a = 3;
		String nome = "Alura"; // object literal
		// String outro = new String("Alura");

		// String outra = nome.replace("A", "a");

//		String outra = nome.replace('A','a');

		char c = nome.charAt(2);

		String sub = nome.substring(1);

		// int pos = nome.indexOf("ur");

		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}

		System.out.println(nome.length());
		System.out.println(sub);
	}

}
