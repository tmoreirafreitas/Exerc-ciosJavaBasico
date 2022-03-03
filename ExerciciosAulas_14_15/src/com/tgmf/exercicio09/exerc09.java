package com.tgmf.exercicio09;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class exerc09 {

	public static void main(String[] args) {
		var numeros = new int[3];
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		for(var i = 0; i < numeros.length; i++) {
			System.out.println("Digite o " + (i+1) + "º preço: ");
			numeros[i] = scan.nextInt();
		}
		
		Arrays.sort(numeros);
		
		System.out.println();
		System.out.println("Apresentação dos números ordenados: ");
		for(var i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		scan.close();
	}
}
