package com.tgmf.exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		double [] notas = new double[4];
		double media = 0;
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Informe as 4 notas bimestrais para o cálculo da média: ");
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Nota " + (i+1) + ": ");
			notas[i] = scan.nextDouble();
		}
		
		media = calculaMedia(notas);
		
		System.out.print("Média: " + media);
		scan.close();
	}
	
	public static double calculaMedia(double []notas) {
		double soma = 0;
		
		for(double nota : notas) {
			soma += nota;
		}
		
		double media = soma / notas.length;		
		return media;
	}
}