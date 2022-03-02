package com.tgmf.exercicio12;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Pessoa {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.print("Informe sua altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = calculePesoIdeal(altura);
		DecimalFormat numeroFormat = new DecimalFormat("#.00");
		
		System.out.println("Seu peso ideal é: " + numeroFormat.format(pesoIdeal));
		
		scan.close();
	}
	
	private static double calculePesoIdeal(double altura) {
		return (72.7 * altura) - 58;
	}
}
