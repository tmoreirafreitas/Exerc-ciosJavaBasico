package com.tgmf.exercicio01;

import java.util.Scanner;

public class exerc01 {

	public static void main(String[] args) {
		String info = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe dois números: ");
		double primeiroNumero = scan.nextDouble();
		double segundoNumero = scan.nextDouble();
		
		if(primeiroNumero > segundoNumero) {
			info = info.concat(String.valueOf(primeiroNumero));
			info = info.concat(" é maior que ");
			info = info.concat(String.valueOf(segundoNumero));
			System.out.println(info);
		}else {
			info = info.concat(String.valueOf(segundoNumero));
			info = info.concat(" é maior que ");
			info = info.concat(String.valueOf(primeiroNumero));
			System.out.println(info);
		}
		
		scan.close();
	}
}
