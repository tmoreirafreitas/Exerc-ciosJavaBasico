package com.tgmf.exercicio06;

import java.util.Scanner;

public class exerc06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double maior = 0;
		
		System.out.println("Digite o primeiro n�mero: ");
		maior = scan.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		var segundo = scan.nextDouble();
		if(segundo > maior)
			maior = segundo;
		
		System.out.println("Digite o terceiro n�mero: ");
		var terceiro = scan.nextDouble();
		if(terceiro > maior)
			maior = terceiro;
		
		System.out.println("O maior n�mero �: " + maior);
		scan.close();
	}
}
