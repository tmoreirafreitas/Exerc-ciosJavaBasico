package com.tgmf.exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class ConversorUnidadeMedida {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.print("Informe o valor em metros a ser convertido para centímetro: ");
		double valorMetro = scan.nextDouble();
		double valorCentimetro = converteParaCentimetros(valorMetro);
		
		System.out.print("Valor em centímetro: " + valorCentimetro);
		
		scan.close();
	}
	
	private static double converteParaCentimetros(double valorEmMetros) {
		return valorEmMetros * 100;
	}
}
