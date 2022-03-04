package com.tgmf.exercicio16;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
		// ax^2 + bx + c
		System.out.println("Bem vindo ao calculao de equação do 2º ...");

		System.out.println("Informe o coeficiênte angular [a]: ");
		var scan = new Scanner(System.in);

		var a = scan.nextDouble();

		if (a == 0) {
			System.out.println("a = " + a + ", infelizmente não poderemos continuar, pois a equação não é do 2º.");
			System.out.println("Finalizando o systema.");
			scan.close();
			System.exit(1);
		}

		System.out.println("Informe o coeficiênte linear [b]: ");
		var b = scan.nextDouble();

		System.out.println("Informe a constante [c]: ");
		var c = scan.nextDouble();

		// b^2 - 4ac
		var delta = Math.pow(b, 2) - 4 * a * c;

		if (delta < 0) {
			System.out.println("delta = " + delta + ", infelizmente não poderemos continuar, delta é negativo.");
			System.out.println("Finalizando o systema.");
			scan.close();
			System.exit(1);
		} else if (delta == 0) {
			double raiz = -b / (2 * a);
			System.out.println("Equação possui uma única raíz como solução. X1 = X2 = " + raiz);			
		} else {
			var raizQuadradaDelta = Math.sqrt(delta);
			var raiz1 = (-b + raizQuadradaDelta) / (2 * a);
			var raiz2 = (-b - raizQuadradaDelta) / (2 * a);
			System.out.println("Equação possui duas raízes");
			System.out.println("X1 = " + raiz1 + "; X2 = " + raiz2);			
		}
		
		scan.close();
		System.exit(0);
	}
}
