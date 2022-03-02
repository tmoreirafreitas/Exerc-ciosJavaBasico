package com.tgmf.exercicio06;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Circulo {

	private static double PI = 3.1415926;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.print("Informe o valor do raio da circunferência para obter sua área: ");
		double raio = scan.nextDouble();
		
		double area = calculaArea(raio);
		
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		System.out.print("Área: " + numberFormat.format(area));
		scan.close();
	}
	
	private static double calculaArea(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
