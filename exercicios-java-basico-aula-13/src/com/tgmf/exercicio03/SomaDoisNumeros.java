package com.tgmf.exercicio03;

import java.util.Scanner;

public class SomaDoisNumeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número, segundo número: ");
		
		int primeiroNumero = scan.nextInt();
		int segundoNumero = scan.nextInt();		
		int soma = primeiroNumero + segundoNumero;
		
		System.out.println("Você digitou os seguintes valores: ");
		System.out.println("Primeiro Número: " + primeiroNumero);
		System.out.println("Soma dos valores informados é: " + soma);
		
		scan.close();
	}
}
