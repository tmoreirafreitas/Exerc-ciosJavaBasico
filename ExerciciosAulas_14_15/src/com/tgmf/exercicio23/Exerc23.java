package com.tgmf.exercicio23;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exerc23 {

	static double precoFileDuploAte5Kg = 4.90;

	public static void main(String[] args) {
		var scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Informe o tipo de carne que deseja comprar: ");
		System.out.println("F-Filé Duplo");
		System.out.println("A-Alcatra");
		System.out.println("P-Picanha");

		var opcao = scan.next().charAt(0);

		if (opcao != 'A' && opcao != 'a' && opcao != 'F' && opcao != 'f' && opcao != 'P' && opcao != 'p') {
			System.out.println("Valor inválido, saindo do sistema...");
			System.exit(-1);
		}

		System.out.println("Informe a quantidade ser comprado (kg): ");
		var quantidade = scan.nextDouble();
		if (quantidade < 0) {
			System.out.println("Valor inválido, saindo do sistema...");
			System.exit(-1);
		}

		var tipoCarne = "";
		var preco = 0.0;
		switch (opcao) {
		case 'F', 'f' -> {
			preco = quantidade <= 5 ? 4.9 : 5.8;
			tipoCarne = "Filé Duplo";
		}
		case 'A', 'a' -> {
			preco = quantidade <= 5 ? 5.9 : 6.8;
			tipoCarne = "Alcatra";
		}
		case 'P', 'p' -> {
			preco = quantidade <= 5 ? 6.9 : 7.8;
			tipoCarne = "Picanha";
		}
		}

		var precoTotal = preco * quantidade;
		var totalAPagar = 0.0;
		var valorDesconto = 0.0;
		var infoTipoPagamento = "";
		System.out.println("Informe a forma de pagamento: ");
		System.out.println("1-Dinheiro");
		System.out.println("2-Cartão Tabajara");
		var tipoPagamento = scan.nextInt();

		if (tipoPagamento == 1) {
			totalAPagar = precoTotal;
			infoTipoPagamento = "Dinheiro";
		} else if (tipoPagamento == 2) {
			valorDesconto = precoTotal * 0.05;
			totalAPagar = precoTotal - (precoTotal * 0.05);
			infoTipoPagamento = "Cartão Tabajara";
		}

		var numeroFormat = new DecimalFormat("#.00");
		var sb = new StringBuilder();
		sb.append("Tipo de Carne: " + tipoCarne);
		sb.append("\nQuantidade Kg: " + numeroFormat.format(quantidade) + "\n");
		sb.append("Preço Total: R$ " + numeroFormat.format(precoTotal) + "\n");
		sb.append("Tipo de Pagamento: " + infoTipoPagamento + "\n");
		sb.append("Valor do desconto: R$ " + (valorDesconto > 0 ? numeroFormat.format(valorDesconto) : "0") + "\n");
		sb.append("Valor a pagar: R$ " + numeroFormat.format(totalAPagar));

		System.out.println(sb.toString());
		
		scan.close();
	}
}