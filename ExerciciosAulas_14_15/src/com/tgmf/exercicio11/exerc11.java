package com.tgmf.exercicio11;

import java.util.Scanner;

public class exerc11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o salário do funcionário: ");
		
		var salarioBase = scan.nextDouble();
		var valorAumento = 0.0;
		var percentual = 0;
		var novoSalario = 0.0;
		
		if (salarioBase <= 280) {
			valorAumento = salarioBase * 0.20;
			percentual = 20;
		} else if (salarioBase > 280 && salarioBase < 700) {
			valorAumento = salarioBase * 0.15;
			percentual = 15;
		} else if (salarioBase > 700 && salarioBase < 1500) {
			valorAumento = salarioBase * 0.10;
			percentual = 10;
		} else if (salarioBase > 1500) {
			valorAumento = salarioBase * 0.05;
			percentual = 5;
		}

		novoSalario = salarioBase + valorAumento;

		System.out.println("O Salário antes do reajuste: R$ " + salarioBase);
		System.out.println("O Percentual do aumento aplicado: " + percentual + "%");
		System.out.println("O valor do aumento: R$ " + valorAumento);
		System.out.println("O novo salário após o aumento: R$ " + novoSalario);
		scan.close();
	}
}
