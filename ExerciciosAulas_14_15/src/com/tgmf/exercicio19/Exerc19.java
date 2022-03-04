package com.tgmf.exercicio19;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var scan = new Scanner(System.in);

		System.out.println("Informe dois n�meros: ");

		System.out.println("N�mero - 1: ");
		var numero1 = scan.nextInt();

		System.out.println("N�mero - 2: ");
		var numero2 = scan.nextInt();

		System.out.println("Informe opera��o a ser realizada: ");

		System.out.println("1 - Multiplica��o: ");
		System.out.println("2 - Divis�o: ");
		System.out.println("3 - Adi��o: ");
		System.out.println("4 - Subtra��o: ");

		var opcao = scan.nextInt();
		var resultado = 0.0;

		switch (opcao) {
		case 1 -> resultado = numero1 * numero2;
		case 2 -> resultado = numero1 / numero2;
		case 3 -> resultado = numero1 + numero2;
		case 4 -> resultado = numero1 - numero2;
		default -> System.out.println("Op��o inv�lida [valor]: " + opcao);
		}

		var infoPar = "";
		var infoPositivo = "";
		var ehPar = resultado % 2;

		if (ehPar == 0) {
			infoPar = "Par";
		} else {
			infoPar = "�mpar";
		}

		if (resultado < 0) {
			infoPositivo = "Negativo";
		} else {
			infoPositivo = "Positivo";
		}

		System.out.println("O resultado: " + resultado + " � " + infoPar + " e " + infoPositivo);
		scan.close();
		System.exit(0);
	}
}
