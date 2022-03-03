package com.tgmf.exercicio12;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class exerc12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.print("Quanto você ganha por hora trabalhada? ");
		var valorHora = scan.nextDouble();

		System.out.print("\r\nQual o total de horas que trabalha no mês? ");
		var horasTrabalhadas = scan.nextDouble();

		var salarioBruto = valorHora * horasTrabalhadas;
		var inss = salarioBruto * 0.10;
		var sindicato = salarioBruto * 0.03;
		var fgts = salarioBruto * 0.11;
		var ir = 0.0;// salarioBruto * 0.11;
		var porcentagem = 0;

		if (salarioBruto <= 900) {
			ir = 0.0;
			porcentagem = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			ir = salarioBruto * 0.05;
			porcentagem = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			ir = salarioBruto * 0.10;
			porcentagem = 10;
		} else {
			ir = salarioBruto * 0.20;
			porcentagem = 20;
		}

		var totalDescontos = inss + sindicato + ir;
		var salarioLiquido = salarioBruto - totalDescontos;
		DecimalFormat numeroFormat = new DecimalFormat("#.00");

		System.out.println();
		System.out.println("SALÁRIO BRUTO: (" + valorHora + " * " + horasTrabalhadas + ")\t: R$ "
				+ numeroFormat.format(salarioBruto));
		System.out.println("(-) IR (" + porcentagem + "%)\t\t\t: R$ " + numeroFormat.format(ir));
		System.out.println("(-) INSS (10%)\t\t\t: R$ " + numeroFormat.format(inss));
		System.out.println("(-) SINDICATO (3%)\t\t: R$ " + numeroFormat.format(sindicato));
		System.out.println("FGTS\t\t\t\t: R$ " + numeroFormat.format(fgts));
		System.out.println("TOTAL DESCONTOS\t\t\t: R$ " + numeroFormat.format(totalDescontos));
		System.out.println("SALÁRIO LÍQUIDO\t\t\t: R$ " + numeroFormat.format(salarioLiquido));

		scan.close();
	}
}
