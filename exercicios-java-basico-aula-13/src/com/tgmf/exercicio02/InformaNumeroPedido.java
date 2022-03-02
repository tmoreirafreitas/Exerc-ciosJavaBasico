package com.tgmf.exercicio02;

import java.util.Scanner;

public class InformaNumeroPedido {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		
		int numeroDigitado = scan.nextInt();
		System.out.println("\r\nO número informado foi " + numeroDigitado);
		scan.close();
	}
}
