package com.tgmf.exercicio07;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.print("Informe o lado do quadrado: ");
		double lado = scan.nextDouble();
		
		double area = calculaArea(lado); 
		DecimalFormat numeroFormat = new DecimalFormat("#.00");
		System.out.println("O dobro da área do quadrado é: " + numeroFormat.format(2*area));
		
		scan.close();
	}
	
	private static double calculaArea(double lado) {
		return Math.pow(lado, 2);
	}
}
