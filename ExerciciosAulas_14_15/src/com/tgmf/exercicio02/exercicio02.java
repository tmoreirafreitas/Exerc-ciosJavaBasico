package com.tgmf.exercicio02;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe dois n�meros: ");
		double numero = scan.nextDouble();
		
		if(numero < 0) {
			System.out.println("Valor � negativo");
		}else {
			System.out.println("Valor � positivo");
		}
		
		scan.close();
	}
}
