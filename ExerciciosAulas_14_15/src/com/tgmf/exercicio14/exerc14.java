package com.tgmf.exercicio14;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class exerc14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Informe as notas do aluno para gerar a situação acadêmica: ");

		var notas = new ArrayList<Double>();

		System.out.println("Informe a 1ª nota: ");
		notas.add(scan.nextDouble());

		System.out.println("Informe a 2ª nota: ");
		notas.add(scan.nextDouble());

		var result = 0.0;

		for (var nota : notas) {
			result += nota;
		}

		result /= notas.size();

		char conceito = '"';

		if (result > 9 && result <= 10) {
			conceito = 'A';
		} else if (result > 7.5 && result <= 9) {
			conceito = 'B';
		} else if (result > 6 && result <= 7.5) {
			conceito = 'C';
		} else if (result > 4 && result <= 6) {
			conceito = 'D';
		} else if (result > 0 && result <= 4) {
			conceito = 'E';
		}

		var situacao = "";

		switch (conceito) {
		case 'A', 'B', 'C' -> situacao = "APROVADO";
		default -> situacao = "REPROVADO";
		}

		DecimalFormat decimalFormat = new DecimalFormat("#.00");

		String message = MessageFormat.format("NOTA-1: {0}\tNOTA-2: {1}\tMÉDIA: {2}\tCONCEITO: {3}\tSITUAÇÃO: {4}",
				decimalFormat.format(notas.get(0)), decimalFormat.format(notas.get(1)), decimalFormat.format(result), 
				conceito, situacao);

		System.out.println(message);
		scan.close();
	}
}
