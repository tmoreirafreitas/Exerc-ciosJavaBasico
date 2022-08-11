package com.tgmf.exerc01;

import java.util.Locale;
import java.util.Scanner;

public class exerc01 {

	public static void main(String[] args) {
		var scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		var nota = 0.0;		
		do
		{
			System.out.println("Favor informar uma nota entre 0 e 10");
			nota = scan.nextDouble();
			
			if(nota < 0 || nota > 10) {
				System.out.println("Valor inválido");
			}
		}while(nota < 0 || nota > 10);
		
		scan.close();
	}
}
