package com.tgmf.exercicio13;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.print("Quanto você ganha por hora trabalhada? ");
		double valorHora = scan.nextDouble();
		
		System.out.print("\r\nQual o total de horas que trabalha no mês? ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		double ir = salarioBruto * 0.11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		DecimalFormat numeroFormat = new DecimalFormat("#,000.00");
		
		System.out.println("\r\nSalário Bruto: R$ " + numeroFormat.format(salarioBruto));
		System.out.println("IR (11%): R$ " + numeroFormat.format(ir));
		System.out.println("INSS (8%): R$ " + numeroFormat.format(inss));
		System.out.println("Sindicato (5%): R$ " + numeroFormat.format(sindicato));
		System.out.println("Total descontos: R$ " + numeroFormat.format(totalDescontos));
		System.out.println("Salário Líquido: R$ " + numeroFormat.format(salarioLiquido));
		
		scan.close();
	}
}