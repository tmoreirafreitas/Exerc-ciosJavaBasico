package com.tgmf.exercicio11;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculoMatematico {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Informe 2 números inteiros e um número real: ");
		
		System.out.print("Primeiro valor inteiro: ");
		int primeiro = scan.nextInt();
		
		System.out.print("\r\nSegundo valor inteiro: ");
		int segundo = scan.nextInt();
		
		System.out.print("\r\nTerceiro real: ");
		double terceiro = scan.nextDouble();
		
		DecimalFormat numeroFormat = new DecimalFormat("#.00");
		
		System.out.println("\r\nO dobro do primeiro com a metade do segundo: " + numeroFormat.format(obterProdutoDobroDoPrimeiroComMetadeDoSegundo(primeiro, segundo)));
		
		System.out.println("\r\nO soma do triplo do primeiro com o terceiro: " + numeroFormat.format(obterSomaDoTriploDoPrimeiroComTerceiro(primeiro, terceiro)));
		
		System.out.println("\r\nTerceiro ao cubo: " + numeroFormat.format(obterValorAoCubo(terceiro)));
		
		scan.close();
	}
	
	private static double obterProdutoDobroDoPrimeiroComMetadeDoSegundo(int primeiro, int segundo) {
		return (2*primeiro) * (segundo / 2.0);
	}
	
	private static double obterSomaDoTriploDoPrimeiroComTerceiro(int primeiro, double terceiro) {
		return (3 * primeiro) + terceiro;
	}
	
	private static double obterValorAoCubo(double valor) {
		return Math.pow(valor, 3);
	}
}
