package com.tgmf.exercicio13;

import java.util.Scanner;

public class exerc13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um número que corresponde ao dia da semana: ");
		
		var opcao = scan.nextInt();
		
		switch (opcao) {
		case 1 -> System.out.println("1 - Domingo");
		case 2 -> System.out.println("2 - Segunda-Feira");
		case 3 -> System.out.println("3 - Terça-Feira");
		case 4 -> System.out.println("4 - Quarta-Feira");
		case 5 -> System.out.println("5 - Quinta-Feira");
		case 6 -> System.out.println("6 - Sexta-Feira");
		case 7 -> System.out.println("7 - Sábado");
		default -> System.out.println("Valor inválido");
		}
		scan.close();
	}
}
