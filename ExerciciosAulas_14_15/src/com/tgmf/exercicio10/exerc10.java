package com.tgmf.exercicio10;

import java.util.Scanner;

public class exerc10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o turno que você estuda: ");
		System.out.println("M-matutino: ");
		System.out.println("V-vespertino: ");
		System.out.println("N-noturno: ");

		var opcao = scan.next().charAt(0);

		switch (opcao) {
		case 'M', 'm' -> System.out.println("Bom dia!");
		case 'V', 'v' -> System.out.println("Boa tarde!");
		case 'N', 'n' -> System.out.println("Boa noite!");
		default -> System.out.println("Valor inválido!");
		}

		scan.close();
	}
}
