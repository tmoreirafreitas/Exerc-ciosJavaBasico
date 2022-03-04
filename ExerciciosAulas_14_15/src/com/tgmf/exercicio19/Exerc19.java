package com.tgmf.exercicio19;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var scan = new Scanner(System.in);

		System.out.println("Informe dois números: ");

		System.out.println("Número - 1: ");
		var numero1 = scan.nextInt();

		System.out.println("Número - 2: ");
		var numero2 = scan.nextInt();

		System.out.println("Informe operação a ser realizada: ");

		System.out.println("1 - Multiplicação: ");
		System.out.println("2 - Divisão: ");
		System.out.println("3 - Adição: ");
		System.out.println("4 - Subtração: ");

		var opcao = scan.nextInt();
		var resultado = 0.0;

		switch (opcao) {
		case 1 -> resultado = numero1 * numero2;
		case 2 -> resultado = numero1 / numero2;
		case 3 -> resultado = numero1 + numero2;
		case 4 -> resultado = numero1 - numero2;
		default -> System.out.println("Opção inválida [valor]: " + opcao);
		}

		var infoPar = "";
		var infoPositivo = "";
		var ehPar = resultado % 2;

		if (ehPar == 0) {
			infoPar = "Par";
		} else {
			infoPar = "Ímpar";
		}

		if (resultado < 0) {
			infoPositivo = "Negativo";
		} else {
			infoPositivo = "Positivo";
		}

		System.out.println("O resultado: " + resultado + " é " + infoPar + " e " + infoPositivo);
		scan.close();
		System.exit(0);
	}
}
