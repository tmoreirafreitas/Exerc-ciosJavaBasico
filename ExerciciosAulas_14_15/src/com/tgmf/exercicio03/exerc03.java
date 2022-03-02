package com.tgmf.exercicio03;

import java.util.Scanner;

public class exerc03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Informe uma letra: ");
		char letra = scan.next().charAt(0);
		
		switch (letra) {
		case 'F': 
		case 'f': 
			System.out.println("F - Feminino");
			break;
		case 'M':
		case 'm':
			System.out.println("M - Masculino");
			break;
		default:
			System.out.println("Sexo inválido");
			break;
		}
		
		scan.close();
	}
}
