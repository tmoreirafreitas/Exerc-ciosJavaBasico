package com.tgmf.exerc05;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class exerc05 {
	static int anos = 0;
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		var populacaoA = 0.0;
		var populacaoB = 0.0;
		var taxaA = 0.0;
		var taxaB = 0.0;
		var key = ' ';

		do {
			do {
				System.out.println("Informe a popula��o inicial do grupo A: ");
				populacaoA = scan.nextInt();
				if (populacaoA < 0) {
					System.out.println("O valor da popula��o (A) precisa ser um n�mero inteiro positivo.");
				}
			} while (populacaoA < 0);

			do {
				System.out.println("Informe a popula��o inicial do grupo B: ");
				populacaoB = scan.nextInt();
				if (populacaoB < 0) {
					System.out.println("O valor da popula��o (B) precisa ser um n�mero inteiro positivo.");
				}
			} while (populacaoB < 0);

			do {
				System.out.println("Informe a taxa de crescimento populacional do grupo A: ");
				taxaA = scan.nextDouble();
				if (taxaA < 0) {
					System.out.println("O valor da taxa populacional (A) precisa ser um n�mero positivo.");
				}
			} while (taxaA < 0);

			do {
				System.out.println("Informe a taxa de crescimento populacional do grupo B: ");
				taxaB = scan.nextDouble();
				if (taxaB < 0) {
					System.out.println("O valor da taxa populacional (B) precisa ser um n�mero positivo.");
				}
			} while (taxaB < 0);

			do {
				++anos;
				populacaoA = obterPopulacao(populacaoA, taxaA);
				populacaoB = obterPopulacao(populacaoB, taxaB);
			} while (populacaoA < populacaoB);

			DecimalFormat numeroFormat = new DecimalFormat("#");
			System.out
					.println("Foram necess�rios " + anos + " anos para a popula��o A ultrapassar ou igualar a popula��o B");
			System.out.println("Popula��o A: " + numeroFormat.format(populacaoA));
			System.out.println("Popula��o B: " + numeroFormat.format(populacaoB));
			
			System.out
			.println("Digite [S/s] para sair ou [R/r] para reiniciar uma nova opera��o.");
			key = scan.next().toLowerCase().charAt(0);
			
			if(key == 's') {
				System.out.println("Programa finalizado...");
				System.exit(0);
			}
			
		} while (key != 'r');		
		
		scan.close();
	}

	static double obterPopulacao(double populacao, double taxa) {
		return populacao * (Math.pow(1 + taxa, anos));
	}
}
