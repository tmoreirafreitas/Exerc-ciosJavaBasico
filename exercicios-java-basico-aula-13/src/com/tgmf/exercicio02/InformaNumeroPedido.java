package com.tgmf.exercicio02;

import java.util.Scanner;

public class InformaNumeroPedido {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");
		
		int numeroDigitado = scan.nextInt();
		System.out.println("\r\nO n�mero informado foi " + numeroDigitado);
		scan.close();
	}
}
