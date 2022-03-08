package com.tgmf.exercicio21;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exerc21 {

	static double PrecoLitroGasolina = 2.50;
	static double PrecoLitroAlcool = 1.90;

	public static void main(String[] args) {
		var scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Deseja abastecer com qual tipo de combustível? ");
		System.out.println("A-álcool");
		System.out.println("G-gasolina");

		var opcaoCombustivel = scan.next().charAt(0);

		if(opcaoCombustivel != 'A' && opcaoCombustivel != 'a' && opcaoCombustivel != 'G' && opcaoCombustivel != 'g')
		{
			System.out.println("Valor de opção inválido, saíndo do programa.");
			System.exit(-1);
		}
		
		System.out.println("Informe a quantidade a ser abastecida L: ");
		calcularImprimirValorAbastecido(opcaoCombustivel, scan.nextDouble());	
		
		scan.close();
	}
	
	static void calcularImprimirValorAbastecido(char opcao, double quantidadeCombustivel) {
		if(opcao == 'A' || opcao == 'a') {
			calculaImprimeValorAlcool(quantidadeCombustivel);
		}else if(opcao == 'G' || opcao == 'g') {
			calculaImprimeValorGasolina(quantidadeCombustivel);
		}
	}
	
	static void calculaImprimeValorAlcool(double quantidadeCombustivel) {
		var percentagem = 0.0;
		var valorADescontar = 0.0;
		if(quantidadeCombustivel <= 20) {
			percentagem = 0.03;
		}else if(quantidadeCombustivel > 20) {
			percentagem = 0.05;
		}
		
		valorADescontar = (PrecoLitroAlcool * percentagem) * quantidadeCombustivel;
		var valorSemDesconto = (PrecoLitroAlcool * quantidadeCombustivel);
		var valorTotal = (PrecoLitroAlcool * quantidadeCombustivel) - valorADescontar;
		
		var numeroFormat = new DecimalFormat("#.00");
		
		var sb = new StringBuilder();
		sb.append("Tipo combustível: Álcool - " + "Preço/L: " + numeroFormat.format(PrecoLitroAlcool));
		sb.append("\nQuantidade L: " + quantidadeCombustivel + "\n");
		sb.append("Valor Sem desconto: " + numeroFormat.format(valorSemDesconto) + "\n");
		sb.append("Valor a descontar: " + numeroFormat.format(valorADescontar) + "\n");
		sb.append("Valor com desconto: " + numeroFormat.format(valorTotal));
		
		System.out.println(sb.toString());
	}
	
	static void calculaImprimeValorGasolina(double quantidadeCombustivel) {
		var percentagem = 0.0;
		var valorADescontar = 0.0;
		if(quantidadeCombustivel <= 20) {
			percentagem = 0.04;
		}else if(quantidadeCombustivel > 20) {
			percentagem = 0.06;
		}
		
		valorADescontar = (PrecoLitroGasolina * percentagem) * quantidadeCombustivel;
		var valorSemDesconto = (PrecoLitroGasolina * quantidadeCombustivel);
		var valorTotal = (PrecoLitroGasolina * quantidadeCombustivel) - valorADescontar;
		
		var numeroFormat = new DecimalFormat("#.00");
		
		var sb = new StringBuilder();
		sb.append("Tipo combustível: Gasolina - " + "Preço/L: " + numeroFormat.format(PrecoLitroGasolina));
		sb.append("\nQuantidade L: " + quantidadeCombustivel + "\n");
		sb.append("Valor Sem desconto: " + numeroFormat.format(valorSemDesconto) + "\n");
		sb.append("Valor a descontar: " + numeroFormat.format(valorADescontar) + "\n");
		sb.append("Valor com desconto: " + numeroFormat.format(valorTotal));
		
		System.out.println(sb.toString());
	}
}
