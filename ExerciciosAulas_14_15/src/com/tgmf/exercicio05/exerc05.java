package com.tgmf.exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class exerc05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Informe duas notas para o cálculo da situação acadêmica.");
		
		var notas = new double[2];
		notas[0] = scan.nextDouble();
		notas[1] = scan.nextDouble();
		
		var media = obterMedia(notas);
		
		if(media == 10.0) {
			System.out.println("Aprovado com Distinção.");
		}else if(media >= 7.0){
			System.out.println("Aprovado.");
		}else {
			System.out.println("Reprovado");
		}
		scan.close();
	}
	
	static double obterMedia(double[] notas) {
		double resultado = 0;
		for(var nota : notas) {
			resultado += nota;
		}
		
		return resultado / notas.length;
	}
}
