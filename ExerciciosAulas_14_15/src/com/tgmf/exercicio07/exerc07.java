package com.tgmf.exercicio07;

import java.util.Scanner;

public class exerc07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double maior = 0;
		double menor = 0;
		
		System.out.println("Digite o primeiro n�mero: ");
		menor = scan.nextDouble();
		maior = menor;
		
		System.out.println("Digite o segundo n�mero: ");
		var segundo = scan.nextDouble();
		if(segundo > maior) {
			menor = maior;
			maior = segundo;			
		}else {
			menor = segundo;
		}
		
		System.out.println("Digite o terceiro n�mero: ");
		var terceiro = scan.nextDouble();
		if(terceiro < menor)
			menor = terceiro;
		
		if(terceiro > maior) {
			maior = terceiro;
		}			
		
		System.out.println("Menor: " + menor);
		System.out.println("Maior: " + maior);
		scan.close();
	}

}
