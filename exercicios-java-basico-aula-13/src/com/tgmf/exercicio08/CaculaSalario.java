package com.tgmf.exercicio08;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class CaculaSalario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.print("Quanto voc� ganha por hora trabalhada? ");
		double valor = scan.nextDouble();
		
		System.out.print("\r\nQual o total de horas que trabalha no m�s? ");
		double horasTrabalhadas = scan.nextDouble();
		
		double valorTotal = calculaSalarioPorHoraTrabalhada(valor, horasTrabalhadas);
		DecimalFormat numeroFormat = new DecimalFormat("#.00");
		System.out.println("Seu sal�rio do m�s �: " + numeroFormat.format(valorTotal));
		
		scan.close();
	}
	
	private static double calculaSalarioPorHoraTrabalhada(double valor, double horaTrabalhada) {
		return valor * horaTrabalhada;
	}
}
