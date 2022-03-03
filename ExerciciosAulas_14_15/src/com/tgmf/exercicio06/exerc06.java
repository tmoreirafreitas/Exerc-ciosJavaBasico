package com.tgmf.exercicio06;

import java.util.Scanner;

public class exerc06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double maior = 0;
		
		System.out.println("Digite o primeiro número: ");
		maior = scan.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		var segundo = scan.nextDouble();
		if(segundo > maior)
			maior = segundo;
		
		System.out.println("Digite o terceiro número: ");
		var terceiro = scan.nextDouble();
		if(terceiro > maior)
			maior = terceiro;
		
		System.out.println("O maior número é: " + maior);
		scan.close();
	}
}
