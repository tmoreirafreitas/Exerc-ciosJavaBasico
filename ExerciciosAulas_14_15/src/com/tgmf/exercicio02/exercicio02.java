package com.tgmf.exercicio02;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe dois números: ");
		double numero = scan.nextDouble();
		
		if(numero < 0) {
			System.out.println("Valor é negativo");
		}else {
			System.out.println("Valor é positivo");
		}
		
		scan.close();
	}
}
