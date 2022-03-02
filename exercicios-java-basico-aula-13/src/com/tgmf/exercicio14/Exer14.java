package com.tgmf.exercicio14;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Informe o tamanho do arquivo");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Informe a velocidade da internet.");
		double velocidadeInternet = scan.nextDouble();
		
		double tempo = tamanhoArquivo / velocidadeInternet;
		
		DecimalFormat numeroFormat = new DecimalFormat("#.00");
		System.out.println("Tempo de download: " + numeroFormat.format(tempo));
		
		scan.close();
	}
}
