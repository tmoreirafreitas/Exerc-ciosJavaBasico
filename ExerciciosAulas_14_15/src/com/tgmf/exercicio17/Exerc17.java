package com.tgmf.exercicio17;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var scan = new Scanner(System.in);
		
		System.out.println("Informe o ano: ");
		var ano = scan.nextInt();
		
		if(ano <= 0) {
			System.out.println("O n�mero tem de ser positivo.");
			System.out.println("Finalizando ...");
			scan.close();
			System.exit(1);
		}
		
		var restoBissexto = ano % 4;
		
		if(restoBissexto == 0) {
			System.out.println("O ano " + ano + " � bissexto.");
		}else {
			System.out.println("O ano " + ano + " n�o � bissexto.");
		}
		
		scan.close();
		System.exit(0);
	}
}
