package com.tgmf.exercicio18;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
		var scan = new Scanner(System.in);

		System.out.println("Informe o ano: ");
		var numero = scan.nextInt();

		var ehPar = numero % 2;

		if (ehPar == 0) {
			System.out.println("O ano " + numero + " é par.");
		} else {
			System.out.println("O ano " + numero + " é ímpar.");
		}

		scan.close();
		System.exit(0);
	}

}
