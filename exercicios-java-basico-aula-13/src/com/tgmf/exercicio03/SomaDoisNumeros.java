package com.tgmf.exercicio03;

import java.util.Scanner;

public class SomaDoisNumeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero, segundo n�mero: ");
		
		int primeiroNumero = scan.nextInt();
		int segundoNumero = scan.nextInt();		
		int soma = primeiroNumero + segundoNumero;
		
		System.out.println("Voc� digitou os seguintes valores: ");
		System.out.println("Primeiro N�mero: " + primeiroNumero);
		System.out.println("Soma dos valores informados �: " + soma);
		
		scan.close();
	}
}
