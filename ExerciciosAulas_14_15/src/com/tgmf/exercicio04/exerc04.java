package com.tgmf.exercicio04;

import java.util.Scanner;

public class exerc04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		char letra = scan.next().charAt(0);
		letra = Character.toLowerCase(letra);

		switch (letra) {
		case 'a', 'e', 'i', 'o', 'u' -> System.out.println("A letra informada é uma vogal.");
		default -> System.out.println("A letra informada é uma consoante.");
		}

		scan.close();
	}
}
