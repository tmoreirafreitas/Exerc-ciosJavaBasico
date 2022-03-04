package com.tgmf.exercicio15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class exerc15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Informe os lados do triânculo: ");

		var lados = new ArrayList<Double>();

		System.out.println("Lado - 1: ");
		lados.add(scan.nextDouble());

		System.out.println("Lado - 2: ");
		lados.add(scan.nextDouble());

		System.out.println("Lado - 3: ");
		lados.add(scan.nextDouble());

		Collections.sort(lados);

		var somaLados = lados.get(0) + lados.get(1);

		if (somaLados < lados.get(2)) {
			System.out.println("Não é possível formar um triângulo com os lados informados.");
		} else {
			if (lados.get(0).doubleValue() == lados.get(1).doubleValue()
					&& lados.get(1).doubleValue() == lados.get(2).doubleValue()) {
				System.out.println("Triângulo Equilátero");
			} else if ((lados.get(0).doubleValue() == lados.get(1).doubleValue()
					&& lados.get(1).doubleValue() != lados.get(2).doubleValue())
					|| (lados.get(0).doubleValue() == lados.get(2).doubleValue()
							&& lados.get(1).doubleValue() != lados.get(2).doubleValue())
					|| (lados.get(1).doubleValue() == lados.get(2).doubleValue()
							&& lados.get(1).doubleValue() != lados.get(0).doubleValue())) {
				System.out.println("Triângulo Isósceles");
			} else if (lados.get(0).doubleValue() != lados.get(1).doubleValue()
					&& lados.get(0).doubleValue() != lados.get(2).doubleValue()
					&& lados.get(1).doubleValue() != lados.get(2).doubleValue()) {
				System.out.println("Triângulo Escaleno");
			}
		}

		scan.close();
	}
}
